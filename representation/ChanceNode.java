package representation;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class ChanceNode extends InnerNode {
    private List<Double> proba = new ArrayList<>();   // Somme des probas vaut 1
    public static double[] AlmostSure = new double[]{1,0};
    public static double[] VeryHighChance = new double[]{0.9,0.1};
    public static double[] HighChance = new double[]{0.9,0.1};
    public static double[] MiddleChance = new double[]{0.65,0.35};
    public static double[] FiftyFifty = new double[]{0.5,0.5};
    public static double[] LowChance = new double[]{0.2,0.8};

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
