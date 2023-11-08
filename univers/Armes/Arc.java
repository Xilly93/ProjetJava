package univers.Armes;
import univers.Element;

import univers.Interfaces.Distance;

public class Arc extends Arme implements Distance{

    public Arc(String Nom, int attaque, int portee, int precision){
        super(Nom,attaque,portee,precision);
    }

    public Arc(String Nom, int attaque, int portee, int precision,Element Elem){
        super(Nom,attaque,portee,precision,Elem);
    }

    public void Competence(){ // retire 2 vies à l'ennemi
        return;
    }
}
