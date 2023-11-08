package univers.Personnages.Monstres.Creatures;
import univers.Element;
import univers.Interfaces.Vol;
import univers.Personnages.Monstres.Creature;

public class Legendaire extends Creature {

    public Legendaire(String Nom){
        super(Nom);
        System.out.println("Je suis un monstre Legendaire !");
        this.vie = 4;
    }

    public Legendaire(String Nom,Element[] Elems){
        this(Nom);
        this.Elems = Elems;
    }

}
