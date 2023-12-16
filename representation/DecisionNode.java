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
    private Scanner sc = new Scanner(System.in);
    private int decision;
    private List<List<Integer>> allStatsMin = new ArrayList<>();
    private int[][] nextChoice;

    public DecisionNode(String description,Node n1,Node n2,Node n3,Node n4){
        super(description,n1,n2,n3,n4);
    }

    public DecisionNode(String description,Node n1,Node n2,Node n3){
        super(description,n1,n2,n3,null);
    }

    public DecisionNode(String description,Node n1,Node n2){
        super(description,n1,n2,null,null);
    }

    public DecisionNode(String description){
        super(description);
    }

    public void setAllStatsMin(int[][] T){
        allStatsMin.add(new ArrayList<>());
        allStatsMin.add(new ArrayList<>());
        allStatsMin.add(new ArrayList<>());
        for (int i = 0; i<T.length ; i++){
            if (T[i] != null){
                for (int j = 0; j<3 ;j++){
                    allStatsMin.get(i).add(T[i][j]);
                }
                
            }
        }
        System.out.println(allStatsMin);

    }


    public void Decision(){
        while(! (decision == 1 ||decision == 2 ||decision == 3 ||decision == 4 )){
            System.out.print("\nDECISION : ");
            this.decision = sc.nextInt();
        }
    }

    public int NextConditionUnderDecision(int decision, int condition){
        //System.out.println("Je suis dans NextConditionUnderDecision");
        if (!(this.personnages[0] instanceof Heros)){
            System.out.println("Probleme");
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
                return nextChoice[decision-1][0];   
            }
            else{
                return nextChoice[decision-1][1];
            }
        }
        return 0;
    }

    @Override
    public Node chooseNext(){
        //callAction();
        if (this.getCondition() == 0 )
            return nodes[decision-1];
        else{
            int numNextNode = NextConditionUnderDecision(decision,getCondition()); // A FAIRE : Modifier decision
            return nodes[numNextNode-1];
        }

    }

    @Override
    public void display(){
        super.display();
        Decision();
    }

    public   int getDecision(){
        return decision;
    }

    public void setNextChoice(int[][] nextChoice){
        this.nextChoice = nextChoice;
    }

    public void callAction(){
        Heros heros = (Heros) this.personnages[0];
        if (this.action ==1){
            heros.setArme(this.armes[decision-1]);
        }
        return;
    }
}
