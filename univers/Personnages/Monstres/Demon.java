package univers.Personnages.Monstres;
import univers.Personnages.Monstre;
import univers.Interfaces.*;

public class Demon extends Monstre implements Enfer{
    public Demon(String Nom){
        super(Nom);
        System.out.println("Je suis un Démon!");
        this.vie = 6;
    }

    public void Intimider(){
        return;
    }
}
