package representation;
import univers.Armes.Arme;
import univers.PersonnageDeBase;
import univers.Artefactes.Artefacte;
import univers.Objets.Objet;
import univers.Personnages.Mortels.Heros;

public abstract class  Node implements Event{
    protected String description;
    protected static int nbNodes = 0;
    protected final int id;
    protected PersonnageDeBase[] personnages = new PersonnageDeBase[10];
    protected Arme[] armes = new Arme[4];
    protected Artefacte[] artefactes = new Artefacte[4];  
    protected Objet[] objets = new Objet[4];  
    protected int action = 0;


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

    public void setUnivers(PersonnageDeBase[] personnages,Arme[] armes,Artefacte[] artefactes,Objet[] objets){
        this.personnages = personnages;
        this.armes = armes;
        this.artefactes = artefactes;
        this.objets = objets;
    }

    public void addArme(Arme arme){
        for ( int i = 0; i<armes.length;i++){
            if (armes[i]==null){
                armes[i] = arme;
                return;
            }
        }
        System.out.println("Plus de places disponibles");

    }

    public void addPerso(PersonnageDeBase perso){
        for ( int i = 0; i<personnages.length;i++){
            if (personnages[i]==null){
                personnages[i] = perso;
                return;
            }
        }
        System.out.println("Plus de places disponibles");

    }

    public void addObjets(Objet objet){
        for ( int i = 0; i<objets.length;i++){
            if (objets[i]==null){
                objets[i] = objet;
                return;
            }
        }
        System.out.println("Plus de places disponibles");
    }

    public void addArteface(Artefacte artefacte){
        for ( int i = 0; i<artefactes.length;i++){
            if (artefactes[i]==null){
                artefactes[i] = artefacte ;
                return;
            }
        }
        System.out.println("Plus de places disponibles");

    }

    @Override
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

    public void setAction(int action){
        this.action = action;
    }

    public int getAction(){
        return action;
    }
    /* 
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
    */

    public void callAction(){
        return;
    }
    
}