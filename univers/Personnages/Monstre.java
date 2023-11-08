package univers.Personnages;
import univers.Element;
import univers.PersonnageDeBase;

public abstract class Monstre extends PersonnageDeBase{
    protected Element[] Elems;
    public Monstre(String Nom){
        super(Nom);
    }
}
