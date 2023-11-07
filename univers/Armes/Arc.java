package univers.Armes;

import univers.Interfaces.Distance;

public class Arc extends Arme implements Distance{
    protected String Nom;
    protected Element Elem;

    public Arc(String Nom){
        this.Nom = Nom;
        this.Elem = Element.AUCUN;
    }

    public void Ameliorer(){
        Elem = Element.VENT;
    }
}
