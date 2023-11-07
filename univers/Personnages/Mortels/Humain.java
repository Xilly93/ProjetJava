package univers.Personnages.Mortels;
import univers.Personnages.Mortel;

public abstract class Humain extends Mortel{
    protected String Nom;

    public Humain(String Nom){
        super(Nom);
        System.out.println("Je suis un Humain.");
    }
}
