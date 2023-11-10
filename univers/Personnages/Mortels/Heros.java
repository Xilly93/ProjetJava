package univers.Personnages.Mortels;
import univers.Personnages.Mortel;
import univers.Armes.*;
import univers.Artefactes.Artefacte;
import univers.Objets.Objet;

public class Heros extends Mortel {
    Arme arme;
    Artefacte[] artefactes = new Artefacte[20];
    Objet[] objets = new Objet[20];

    public Heros(String Nom){
        super(Nom);
        this.vie = 3;
    }

    public void setVie(int vie){
        this.vie = vie; // 3 de base
    }

    public Arme getArme(){
        return this.arme;
    }

    public Artefacte[] getArtefactes(){
        return this.artefactes;
    }

    public Objet[] getObjets(){
        return this.objets;
    }

    public void showArtefactes(){
        for (Artefacte artefacte : this.artefactes){
            if(artefacte != null)
                System.out.println(artefacte + "\t");
            else
                return;
        }
    }

    public void showObjets(){
        for (Objet objet : this.objets){
            if (objet!=null)
                System.out.println(objet + "\t");
            else
                return;
        }
    }

    public void showArme(){
        System.out.println(this.arme.getNom());
    }

    public void setArme( Arme arme){
        this.arme = arme;
    }

    public void ajouteArtefacte( Artefacte artefacte){
        for(int i = 0; i<20; i++){
            if (this.artefactes[i] == null){
                this.artefactes[i] = artefacte;
                return;
            }
        }
        System.out.println("Probleme sortie Artefactes");
    }

    public void ajouteObjet( Objet objet ){
        for(int i = 0; i<20; i++){
            if (this.objets[i] == null){
                this.objets[i] = objet;
                return;
            }
        }
        System.out.println("Probleme sortie Objets");
    }
    @Override
    public String toString(){
        System.out.print("\tHeros : " + this.Nom + "\n");
        System.out.print("Arme :" + this.arme + "\n");
        System.out.print("\nArtefactes:\n");
        showArtefactes();
        System.out.print("\nObjets:\n");
        showObjets();

        return"";
    }
    
}
