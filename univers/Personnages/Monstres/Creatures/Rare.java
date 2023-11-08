package univers.Personnages.Monstres.Creatures;
import univers.Element;
import univers.Personnages.Monstres.Creature;

public class Rare extends Creature {
    public Rare(String Nom){
        super(Nom);
        System.out.println("Je suis un monstre Rare !");
        this.vie = 3;
    }

    public Rare(String Nom,Element[] Elems){
        this(Nom);
        this.Elems = Elems;
    }
}
