package representation;
import univers.Armes.Arme;

import java.util.ArrayList;
import java.util.List;
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
    protected List<Objet> objets = new ArrayList<>();  
    protected int action = 0;


    public Node(String description){
        this.description = description;
        nbNodes += 1;
        id = nbNodes;
    }
        /* 
    public void setItemKeys(Objet[] objets){
        for (Objet o : objets)
            itemKeys.add(o);
    }
    

    public void setUnivers(PersonnageDeBase[] personnages,Arme[] armes,Artefacte[] artefactes,Objet[] objets){
        this.personnages = personnages;
        this.armes = armes;
        this.artefactes = artefactes;
        this.objets = objets;
    }
    */

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
        objets.add(objet);
    }

    public void setObjets(Objet[] objets){
        for (Objet o : objets)
            this.objets.add(o);
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
        Heros heros = null;
        try{
            if (this.personnages[0]==null)
                throw new IllegalArgumentException();
            heros = (Heros) this.personnages[0];
        }
        catch(IllegalArgumentException e){ System.out.println("\nERREUR:\n(NodeId:"+this.getId()+"): Absence de l'heros dans le Node \n");}
        catch(Exception e){e.printStackTrace();}

        if (action==2){
            heros.ajouteObjet(objets.get(0));
        }
        if (action == 3){
            heros.setArme(armes[0]);
        }
        
        return;
    }
    
}