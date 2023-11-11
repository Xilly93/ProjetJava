package univers.Personnages.Monstres.Creatures;
import univers.Element;
import univers.Personnages.Monstres.Creature;

public class Legendaire extends Creature {

    public Legendaire(String Nom){
        super(Nom);
        this.vie = 4;
    }

    public Legendaire(String Nom,Element[] Elems){
        this(Nom);
        this.Elems = Elems;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNiveau : Legendaire";
    }
}
