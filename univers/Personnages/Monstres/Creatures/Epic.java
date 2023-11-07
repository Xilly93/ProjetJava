package univers.Personnages.Monstres.Creatures;
import univers.Personnages.Monstres.Creature;

public class Epic extends Creature{
    public Epic(String Nom){
        super(Nom);
        System.out.println("Je suis un monstre Epic !");      
        this.vie = 3;
    }
    
}
