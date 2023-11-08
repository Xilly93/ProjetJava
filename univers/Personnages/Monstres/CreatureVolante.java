package univers.Personnages.Monstres;
import univers.Element;
import univers.Interfaces.Vol;

public class CreatureVolante extends Creature implements Vol{
    boolean vol = false;
    public CreatureVolante(String Nom,int vie){
        super(Nom);
        this.vie = vie;
    }

    public CreatureVolante(String Nom,int vie,Element[] Elems){
        this(Nom,vie);
        this.Elems = Elems;
    }

    public void Voler(){
        this.vol = true;
    }

    public void Atterir(){
        this.vol = false;
    }

    public boolean getVol(){
        return this.vol;
    }

}
