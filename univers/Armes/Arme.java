package univers.Armes;
import univers.Element;

public abstract class Arme {
    protected String Nom;
    protected Element Elem; // FEU VENT EAU FOUDRE
    protected int attaque ; // 0 à 50
    protected int portee ; // 0 à 50
    protected int precision; // 0 à 50

    public Arme(String Nom, int attaque, int portee, int precision){
        this.Nom = Nom;
        this.attaque= attaque;
        this.portee = portee;
        this.precision = precision;
    }

    public Arme(String Nom, int attaque, int portee, int precision,Element Elem){
        this(Nom,attaque,portee,precision);
        this.Elem = Elem;
    }

    public abstract void Competence();
    
    public int getAttaque(){
        return this.attaque;
    }

    public int getPortee(){
        return this.portee ;
    }

    public int getPrecision(){
        return this.precision ;
    }

    public Element getElem(){
        return this.Elem ;
    }

    public void setElem(Element Elem){
        this.Elem = Elem;
    }

    public String getNom(){
        return this.Nom ;
    }
}
