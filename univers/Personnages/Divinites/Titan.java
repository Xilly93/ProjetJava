package univers.Personnages.Divinites;
import univers.Personnages.Divinite;

public class Titan extends Divinite{
    protected String Nom;
    public Titan(String Nom, int vie){
        super(Nom,vie);
        System.out.println("Je suis " + Nom);
    }
}
