package representation;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import univers.Artefactes.Artefacte;
import univers.Personnages.Mortels.Heros;
import univers.PersonnageDeBase;
import univers.Objets.Objet;
import univers.Artefactes.Artefacte;
import univers.Armes.Arme;
public class DecisionNode extends InnerNode {
    private int decision;
    private List<List<Integer>> allStatsMin = new ArrayList<>();
    private List<List<Integer>> nextChoice = new ArrayList<>();

    public DecisionNode(String description,Node n1,Node n2,Node n3,Node n4){
        super(description,n1,n2,n3,n4);
    }

    public DecisionNode(String description){
        super(description);
    }

    public void setAllStatsMin(int[][] T){
        for (int i = 0; i<T.length ; i++){
            allStatsMin.add(new ArrayList<>());
            if (T[i] != null){
                for (int j = 0; j<3 ;j++){
                    allStatsMin.get(i).add(T[i][j]);
                }
                
            }
        }

    }


    public void Decision(){
        Scanner sc = new Scanner(System.in);
        int nbOfDecision = nodes.size();
        boolean isCorrect;
        do{
            isCorrect = false;
            System.out.print("\nDECISION : ");
            try{
            this.decision = sc.nextInt();
            if (decision > nbOfDecision || decision<1)
                throw new IllegalArgumentException();
            }
            catch(Exception e){
                System.out.println("\nCARACTERE INVALIDE:\nEntrez un entier parmi les reponses proposés...\n");
                isCorrect = true;
                sc.nextLine();
            }  
        }while(isCorrect);
    }

    public int NextConditionUnderDecision(int decision, int condition){
        //System.out.println("Je suis dans NextConditionUnderDecision");
        if (!(this.personnages[0] instanceof Heros)){
            System.out.println("Probleme : Il y a pas d'heros dans le node");
            return -1;
        }
        Heros heros = (Heros) this.personnages[0] ;
        
        if(condition == 1){
            Arme HerosArme = heros.getArme();
            List<Integer> StatsMin = allStatsMin.get(decision-1);
            int attaqueMin = StatsMin.get(0);
            int porteeMin = StatsMin.get(1);
            int precMin = StatsMin.get(2);

            if( HerosArme.getPrecision() >= precMin && HerosArme.getAttaque() >= attaqueMin && HerosArme.getPortee() >= porteeMin ){
                return nextChoice.get(decision-1).get(0);   
            }
            else{
                return nextChoice.get(decision-1).get(1);
            }
        }
        return 0;
    }

    public   int getDecision(){
        return decision;
    }

    public void setNextChoice(int[][] T){
        for (int i = 0; i<T.length ; i++){
            this.nextChoice.add(new ArrayList<>());
            for (int j = 0; j<T[0].length ;j++){
                this.nextChoice.get(i).add(T[i][j]);
            }
        }
    }

    public void callAction(){
        Heros heros = (Heros) this.personnages[0];
        if (this.action ==1){
            heros.setArme(this.armes[decision-1]);
        }
        return;
    }

    @Override
    public Node chooseNext(){
        //callAction();
        if (this.getCondition() == 0 )
            return nodes.get(decision-1);
        else{
            int numNextNode = NextConditionUnderDecision(decision,getCondition()); // A FAIRE : Modifier decision
            return nodes.get(numNextNode-1);
        }

    }

    @Override
    public void display(){
        super.display();
        Decision();
    }


}
