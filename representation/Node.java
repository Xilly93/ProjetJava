package representation;

public abstract class  Node {

    protected String description;
    //protected PersonnageDeBase[] personnages = new PersonnageDebase[4];
    //protected Armes[] armes = new Armes[4]; 
    //protected PersonnageDeBase[] artefact = new Artefact[4]; 
    protected static int nbNodes = 0;
    protected final int id;


    public Node(String description){
        this.description = description;
        nbNodes += 1;
        id = nbNodes;
    }

    public void display(){
        System.out.println(this.description);
    }

    public String getDescription(){
        return description;
    }

    public int getId(){
        return id;
    }

    abstract public Node chooseNext();
}