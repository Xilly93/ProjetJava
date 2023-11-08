package univers.Personnages.Monstres.Creatures;
import univers.Personnages.Monstres.Creature;

public class Commun extends Creature {

    public Commun(String Nom){
        super(Nom);
        this.vie = 1;
        this.Elems = null; // Les Communs n'ont pas d'elements
    }

    @Override
    public String toString() {
        return super.toString() + "\nNiveau : Commun";
    }
}
