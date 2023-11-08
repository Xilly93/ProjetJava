package univers.Personnages;
import univers.Element;
import univers.PersonnageDeBase;

public abstract class Monstre extends PersonnageDeBase{
    protected Element[] Elems;
    public Monstre(String Nom){
        super(Nom);
    }

    @Override
    public String toString() {
        String s ="";
        for (Element Elem : Elems){
            s = s + Elem.toString();
            s = s+" ";
        }
        if (s!="")
            return super.toString() + "\nElement: "+s+"";
        else
            return super.toString();
    }
}
