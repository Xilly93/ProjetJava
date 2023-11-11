package univers.Personnages.Monstres.Creatures;
import univers.Element;
import univers.Personnages.Monstres.Creature;

public class Rare extends Creature {
    public Rare(String Nom){
        super(Nom);
        this.vie = 3;
    }

    public Rare(String Nom,Element[] Elems){
        this(Nom);
        this.Elems = Elems;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNiveau : Rare";
    }
}
