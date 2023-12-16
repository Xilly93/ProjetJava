package representation;
import univers.PersonnageDeBase;
import univers.Armes.Arme;
import univers.Personnages.Mortels.Heros;
import java.util.ArrayList;
public class InnerNode extends Node {
    protected Node[] nodes = new Node[4];
    private int condition = 0;
    private int[] StatsMin;

    public InnerNode(String description,Node n1,Node n2,Node n3,Node n4){
        super(description);
        nodes[0] = n1;
        nodes[1] = n2;
        nodes[2] = n3;
        nodes[3] = n4;
    }

    public InnerNode(String description){
        super(description);
    }

    public InnerNode(){
        super(null);
    }

    public InnerNode(int condition){
        this();
        this.condition = condition;
    }

    public Node[] getNodes(){
        return nodes;
    } 

    public void setNodes(Node[] nodes){
        this.nodes = nodes;
    } 

    public void setNodes(int numero, Node node){
        nodes[numero-1 ] = node;
    } 

    public void setNodes(Node n1,Node n2,Node n3,Node n4){
        nodes[0] = n1;
        nodes[1] = n2;
        nodes[2] = n3;
        nodes[3] = n4;
    } 

    public void setNodes(Node n1){
        nodes[0] = n1;
    } 

    public void setNodes(Node n1,Node n2){
        nodes[0] = n1;
        nodes[1] = n2;
    } 

    public void setNodes(Node n1,Node n2,Node n3){
        nodes[0] = n1;
        nodes[1] = n2;
        nodes[2] = n3;
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
    public int NextCondition(Heros heros){
        if(this.condition==1){
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
                return 0;
            }
        }
        return -2;
    }
    @Override
    public Node chooseNext(){
        if (this.condition==0){
            return this.nodes[0];
        }
        else{
            Heros heros = (Heros) this.personnages[0];
            int condition = this.NextCondition(heros);
            return this.nodes[condition];
        }
        
    }
}
