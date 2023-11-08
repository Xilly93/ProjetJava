package univers.Personnages.Mortels;

import univers.Personnages.Mortel;

public class Civil extends Mortel{
    protected String Nom;
    
    public Civil(String Nom){
        super(Nom);
        System.out.println("Je suis " + Nom );
    }
}

