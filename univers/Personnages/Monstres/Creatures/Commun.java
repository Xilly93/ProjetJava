package univers.Personnages.Monstres.Creatures;
import univers.Personnages.Monstres.Creature;

public class Commun extends Creature {
    public Commun(String Nom){
        super(Nom);
        System.out.println("Je suis un monstre commun !");
        this.vie = 1;
    }
}
