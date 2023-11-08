package univers.Armes;
import univers.Element;

import univers.Interfaces.Melee;

public class Lance extends Arme implements Melee {

    public Lance(String Nom, int attaque, int portee, int precision){
        super(Nom,attaque,portee,precision);
    }

    public Lance(String Nom, int attaque, int portee, int precision,Element Elem){
        super(Nom,attaque,portee,precision,Elem);
    }

    public void Competence(){ // ataque les ennemis en vol
        return;
    }

    public void Ameliorer(){
        Elem = Element.FOUDRE;
    }
}
