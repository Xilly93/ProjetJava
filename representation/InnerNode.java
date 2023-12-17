package representation;
import univers.PersonnageDeBase;
import univers.Armes.Arme;
import univers.Personnages.Mortels.Heros;
import java.util.List;
import java.util.ArrayList;
public class InnerNode extends Node {
    protected List<Node> nodes = new ArrayList<Node>();
    private int condition = 0;
    private int[] StatsMin;

    public InnerNode(){
        super(null);
    }

    public InnerNode(int condition){
        this();
        this.condition = condition;
    }

    public InnerNode(String description){
        super(description);
    }

    public InnerNode(String description,int condition){
        super(description);
        this.condition = condition;
    }

    public InnerNode(String description,Node n1,Node n2,Node n3,Node n4){
        super(description);
        nodes.add(n1);
        nodes.add(n2);
        nodes.add(n3);
        nodes.add(n4);
    }

    public List<Node> getNodes(){
        return nodes;
    } 
    public void setNodes(Node n1){
        this.nodes.add(n1);
    } 

    public void setNodes(Node[] nodes){
        for (int i = 0; i<nodes.length ; i++){
            this.nodes.add(nodes[i]);
        }
    } 

    public void setNodes(int numero, Node node){
        int n = nodes.size();
        //System.out.println("InnerNode 1, numero" + numero + " n : " + n);
        if (n<numero){
            for (int i = 0; i<numero-n; i++){
                nodes.add(null);
            }
        }
        nodes.set(numero-1,node);
        //System.out.println("InnerNode 2");
    }

    public void setCondition( int condition){
        this.condition = condition;
    }

    public void setStatsMin( int[] StatsMin){
        this.StatsMin = StatsMin;
    }

    public int getCondition(){
        return this.condition;
    }
    public int NextCondition(){
        Heros heros = (Heros) this.personnages[0];
        if(this.condition==1){
            if (heros.getArme() == null){System.out.println("ERREUR : Le heros n'as pas d'arme.");}
            Arme HerosArme = heros.getArme();
            int attaqueMin = StatsMin[0];
            int porteeMin = StatsMin[1];
            int precMin = StatsMin[2];
            //System.out.println("Arme:\nPrec : " + HerosArme.getPrecision() + "\tAttaque : " + HerosArme.getAttaque() + "\tPortee :  " + HerosArme.getPortee());
            //System.out.println("StatsMin :\nPrec : " + precMin + "\tAttaque : " + attaqueMin + "\tPortee :  " + porteeMin );
            if( HerosArme.getPrecision() >= precMin && HerosArme.getAttaque() >= attaqueMin && HerosArme.getPortee() >= porteeMin ){
                return 1;   
            }
            else{
                return 2;
            }
        }

        else if( this.condition == 2){
            if (heros.hasObjet(this.objets[0])){
                return 1;
            }
            else{
                return 2;
            }
        }
        return -2;
    }
    @Override
    public Node chooseNext(){
        if (this.condition==0){
            if (this.nodes.isEmpty()){
                return null;
            }
            else{
                return this.nodes.get(0);
            }
        }
        else{
            int numNextNode = this.NextCondition();
            return this.nodes.get(numNextNode-1);
        }
        
    }
}
