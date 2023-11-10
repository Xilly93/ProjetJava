package univers.Armes;
import univers.Element;

/* 
- Chaque arme contient 3 attributs: attaque, portee, precision (0 à 50).
- Certains choix EN COMBAT nécessite un minimum d'attaque, de portee, ou de precision pour
pouvoir faire perdre une vie à l'adversaire.
- Si le choix est choisi et le nbr d'attaque , portee, precision est inférieur, 
alors le héros perd une vie.
 */
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

    public abstract void Competence();// Envoie une competence speciale selon l'arme.

    @Override 
    public String toString(){
        if (this.Elem==null)
            return "\n" + this.Nom + "\nAttaques : " + this.attaque + "\nPortee : " + this.portee  + "\nPrecision : " + this.precision + "\nElement : AUCUN" ;
        else
            return "\n" + this.Nom + "\nAttaques : " + this.attaque + "\nPortee : " + this.portee  + "\nPrecision : " + this.precision + "\nELEMENT : " + this.Elem ;
    }

    // Ameliore les attributs de l'arme
    public void Ameliorer(int att,int port,int prec){
        this.attaque+= att;
        this.portee += port;
        this.precision += prec;
    }

    //GETTERS
    public String getNom(){
        return this.Nom ;
    }
    
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

    //SETTERS

    public void setAttaque(int attaque){
        this.attaque = attaque;
    }

    public void setPortee(int portee){
        this.portee = portee;
    }

    public void setPrecision(int precision){
        this.precision = precision;
    }


    public void setElem(Element Elem){
        this.Elem = Elem;
    }
}
