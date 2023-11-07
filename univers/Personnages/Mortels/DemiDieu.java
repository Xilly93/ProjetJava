package univers.Personnages.Mortels;
import univers.Interfaces.*;

public class DemiDieu extends Humain implements Divin{
    protected String Nom;

    public DemiDieu(String Nom){
        super(Nom);
        System.out.println("Je suis " + Nom );
    }

    public void Ressuciter(){
        this.vie+=1;
    }
}
