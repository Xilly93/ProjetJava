package univers.Personnages.Monstres.Creatures;
import univers.Interfaces.Vol;
import univers.Personnages.Monstres.Creature;

public class Rare extends Creature implements Vol{
    boolean vol = false;
    public Rare(String Nom){
        super(Nom);
        System.out.println("Je suis un monstre Rare !");
        this.vie = 3;
    }

    public void Voler(){
        this.vol = true;
    }
}
