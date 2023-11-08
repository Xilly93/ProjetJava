package univers.Personnages.Monstres;
import univers.Personnages.Monstre;
import univers.Interfaces.*;
import univers.Element;

public class Demon extends Monstre implements Enfer{
    public Demon(String Nom){
        super(Nom);
        System.out.println("Je suis un Démon!");
        this.vie = 6;
    }

    public Demon(String Nom, Element[] Elems){
        super(Nom);
        this.Elems = Elems;
    }

    public void Intimider(){
        return;
    }
}
