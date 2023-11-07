package univers.Personnages.Divinites;
import univers.Personnages.Divinite;
import univers.Element;

public class Dieu extends Divinite{
    Element Elem;
    public Dieu(String Nom,int vie, Element Elem){
        super(Nom,vie);
        this.Elem = Elem;
        System.out.println("Je suis un Dieu !");
    }
}