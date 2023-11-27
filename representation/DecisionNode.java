package representation;
import java.util.Scanner;

import univers.Artefactes.Artefacte;
import univers.Personnages.Mortels.Heros;
import univers.PersonnageDeBase;
import univers.Objets.Objet;
import univers.Artefactes.Artefacte;
import univers.Armes.Arme;
public class DecisionNode extends InnerNode {
    private Scanner sc = new Scanner(System.in);
    private int decision;
    private int action;
    private int numArme;
    private int numPerso;
    private int numItem;
    private int numArtefacte;

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


    public void Decision(){
        while(! (decision == 1 ||decision == 2 ||decision == 3 ||decision == 4 )){
            System.out.print("\nDECISION : ");
            this.decision = sc.nextInt();
        }
    }
    @Override
    public Node chooseNext(){
        Decision();
        callAction();
        return nodes[getDecision()-1];

    }

    public int getDecision(){
        return decision;
    }

    public void setAction(int action){
        this.action = action;
    }

    public int getAction(){
        return action;
    }

    public void setNumArme(int numArme){
        this.numArme = numArme;
    }

    public void setNumPerso(int numPerso){
        this.numPerso = numPerso;
    }

    public void setNumItem(int numItem){
        this.numItem = numItem;
    }

    public void setNumArtefacte(int numArtefacte){
        this.numArtefacte = numArtefacte;
    }

    public void callAction(){
        Heros heros = (Heros) this.personnages[0]; // Heros
        if(this.action == 1){
            heros.setArme(this.armes[this.decision -1]);
        }      
    }

}
