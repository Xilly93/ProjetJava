package representation;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class ChanceNode extends InnerNode {
    List<Double> proba = new ArrayList<>();   // Somme des probas vaut 1

    public ChanceNode(String description){
        super(description);
    }


    public void setProba(double[] proba){
        try{
            double somme = 0;
            for (double p : proba){
                this.proba.add(p);
                somme += p;
            }
            if (somme !=1)
                throw new IllegalArgumentException();
        }
        catch(IllegalArgumentException e){
            System.out.println("\nERREUR:\n(NodeId:"+this.getId()+"): La somme des probas ne vaut pas 1\n");
        }
    }

    @Override
    public Node chooseNext(){
        Random rd = new Random();
        double rand = rd.nextDouble(); // Génère un nombre aléatoire entre 0 et 1
        // 1/3  1/3  1/3  0
        double sommeProb = 0;
        for (int i = 0; i<proba.size();i++){
            sommeProb += proba.get(i);
            if (rand <= sommeProb){
                return nodes.get(i); 
                }   
        }
        return null;
    }
}
