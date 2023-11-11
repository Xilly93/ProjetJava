package univers.Personnages;
import univers.PersonnageDeBase;
import univers.Interfaces.*;

public abstract class Divinite extends PersonnageDeBase implements Divin { 
    String Nom;
    public Divinite(String Nom, int vie){
        super(Nom);
        this.vie = vie;
    }

    @Override
    public void Ressuciter(){
        vie++;
    }
}
