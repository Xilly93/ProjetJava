package univers.Personnages.Monstres.Creatures;
import univers.Interfaces.Vol;
import univers.Personnages.Monstres.Creature;

public class Legendaire extends Creature implements Vol{
    boolean vol = false;

    public Legendaire(String Nom){
        super(Nom);
        System.out.println("Je suis un monstre Legendaire !");
        this.vie = 4;
    }

    public void Voler(){
        this.vol = true;
    }

    public boolean getVol(){
        return this.vol;
    }
}
