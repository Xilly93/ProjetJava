package univers.Personnages.Monstres.Creatures;
import univers.Personnages.Monstres.Creature;
import univers.Element;

public class Epic extends Creature{
    public Epic(String Nom){
        super(Nom);
        //System.out.println("Je suis un monstre Epic !");      
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
