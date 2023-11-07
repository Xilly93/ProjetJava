package univers.Personnages.Mortels;
import univers.Interfaces.*;

public class DemiDieu extends Humain implements Divin{
    protected String Nom;

    public DemiDieu(){
        System.out.println("Je suis un Demi-Dieu" );
    }

    public DemiDieu(String Nom){
        this.Nom = Nom;
        System.out.println("Je suis " + Nom );
    }
}
