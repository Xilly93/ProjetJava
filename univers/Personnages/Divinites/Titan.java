package univers.Personnages.Divinites;
import univers.Personnages.Divinite;

public class Titan extends Divinite{
    protected String Nom;
    public Titan(String Nom){
        this.Nom = Nom;
        System.out.println("Je suis " + Nom);
    }
}
