package representation;
import java.util.Random;

public class ChanceNode extends InnerNode{
    double[] proba = new double[4];   // Somme des probas vaut 1
    public ChanceNode(String description, double[] proba,Node n1,Node n2,Node n3,Node n4){
        super(description,n1,n2,n3,n4);
        this.proba = proba;
    }

    public ChanceNode(String description, double[] proba,Node n1,Node n2,Node n3){
        super(description,n1,n2,n3,null);
        this.proba = proba;
    }

    public ChanceNode(String description, double[] proba,Node n1,Node n2){
        super(description,n1,n2,null,null);
        this.proba = proba;
    }

    public ChanceNode(String description, double[] proba){
        super(description);
        this.proba = proba;
    }

    @Override
    public Node chooseNext(){
        Random rd = new Random();
        double rand = rd.nextDouble(); // Génère un nombre aléatoire entre 0 et 1
        // 1/3  1/3  1/3  0
        double sommeProb = 0;
        for (int i = 0; i<4;i++){
            sommeProb += this.proba[i];
            if (rand <= sommeProb){
                return nodes[i]; 
                }   
        }
        return null;
    }
}
