package representation;
import java.util.Random;

public class ChanceNode extends InnerNode {
    double[] proba = new double[4];   // Somme des probas vaut 1

    public ChanceNode(String description){
        super(description);
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
                return nodes.get(i); 
                }   
        }
        return null;
    }
}
