package univers.Armes;

import univers.Interfaces.Melee;

public class Lance extends Arme implements Melee {
    protected String Nom;
    protected Element Elem;

    public Lance(String Nom){
        this.Nom = Nom;
        this.Elem = Element.AUCUN;
    }

    public void Ameliorer(){
        Elem = Element.FOUDRE;
    }
}
