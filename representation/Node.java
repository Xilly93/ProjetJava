package representation;
import univers.Armes.Arme;
import univers.PersonnageDeBase;
import univers.Artefactes.Artefacte;
import univers.Objets.Objet;

public abstract class  Node {

    protected String description;
    protected static int nbNodes = 0;
    protected final int id;
    protected PersonnageDeBase[] personnages = new PersonnageDeBase[10];
    protected Arme[] armes = new Arme[4];
    protected Artefacte[] artefactes = new Artefacte[4];  
    protected Objet[] objets = new Objet[4];  


    public Node(String description){
        this.description = description;
        nbNodes += 1;
        id = nbNodes;
    }

    public Node(String description,PersonnageDeBase[] personnages,Arme[] armes,Artefacte[] artefactes,Objet[] objets){
        this(description);
        this.personnages = personnages;
        this.armes = armes;
        this.artefactes = artefactes;
        this.objets = objets;
    }

    public void display(){
        System.out.println(this.description);
    }

    abstract public Node chooseNext();

    @Override
    public String toString(){
        this.display();
        return "";
    }

    public int getId(){
        return id;
    }

    public String getDescription(){
        return description;
    }
}