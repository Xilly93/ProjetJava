package univers.Personnages.Monstres.Creatures;
import univers.Personnages.Monstres.Creature;
import univers.Element;

public class Epic extends Creature{
    public Epic(String Nom){
        super(Nom);   
        this.vie = 3;
    }

    public Epic(String Nom,Element[] Elems){
        this(Nom);
        this.Elems = Elems;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNiveau : Epic";
    }
}
