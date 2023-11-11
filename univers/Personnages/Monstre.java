package univers.Personnages;
import univers.Element;
import univers.PersonnageDeBase;

public abstract class Monstre extends PersonnageDeBase{ // Chaque monstre possède un niveau de rareté (Commun,Rare,Epic,Legendaire)
    protected Element[] Elems; // Liste des Elements associée au monstre
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
