package univers.Personnages.Divinites;
import univers.Personnages.Divinite;
import univers.Element;

public class Dieu extends Divinite{ //on definit la classe Dieu, heritier de Divinité
    Element Elem; // Element associé au Dieu
    public Dieu(String Nom,int vie, Element Elem){
        super(Nom,vie); //chaque Dieu a un nom
        this.Elem = Elem; //ainsi qu'un element 
    }
    @Override 
    public String toString(){  
        return super.toString() + "\nElement:" + this.Elem; 
    }

    public Element getElem(){
        return this.Elem;
    }

    public void setElem(Element Elem){
        this.Elem = Elem;
    }
}