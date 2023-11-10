package univers.Armes;
import univers.Interfaces.Melee;
import univers.Element;

public class Epee extends Arme implements Melee{
    //Arme ayant Attaque FORTE, Portee FAIBLE, precision MOYEN  
    public Epee(String Nom, int attaque, int portee, int precision){
        super(Nom,attaque,portee,precision);
    }

    public Epee(String Nom, int attaque, int portee, int precision,Element Elem){
        super(Nom,attaque,portee,precision,Elem);
    }

    public void Competence(){ // retire 2 vies à l'ennemi
        return;
    }

    public void Ameliorer(){
        Elem = Element.AUCUN;
    }
}
