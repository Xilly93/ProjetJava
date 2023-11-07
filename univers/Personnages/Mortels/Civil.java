package univers.Personnages.Mortels;

public class Civil extends Humain{
    protected String Nom;
    
    public Civil(String Nom){
        super(Nom);
        System.out.println("Je suis " + Nom );
    }
}

