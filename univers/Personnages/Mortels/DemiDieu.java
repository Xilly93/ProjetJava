package univers.Personnages.Mortels;
import univers.Interfaces.*;
import univers.Personnages.Mortel;

public class DemiDieu extends Mortel implements Divin{
    protected String Nom;

    public DemiDieu(String Nom){
        super(Nom);
    }

    public void Ressuciter(){
        this.vie+=1;
    }
}
