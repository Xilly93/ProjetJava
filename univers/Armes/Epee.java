package univers.Armes;
import univers.Interfaces.Melee;

public class Epee extends Arme implements Melee{
    protected String Nom;
    protected Element Elem;

    public Epee(String Nom){
        this.Nom = Nom;
        this.Elem = Element.AUCUN;
    }

    public void Ameliorer(){
        Elem = Element.AUCUN;
    }
}
