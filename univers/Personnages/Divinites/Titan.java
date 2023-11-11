package univers.Personnages.Divinites;
import univers.Personnages.Divinite;

public class Titan extends Divinite{  //on definit la classe Titan, heritiere de Divinité
    protected String Nom;  //chaque Titan a un nom
    public Titan(String Nom, int vie){ 
        super(Nom,vie);
    }
}
