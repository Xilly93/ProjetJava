package univers.Personnages.Mortels;

public class Civil extends Humain{
    protected String Nom;
    public Civil(){
        System.out.println("Je suis un Civil");
    }

    public Civil(String Nom){
        this.Nom = Nom;
        System.out.println("Je suis " + Nom);
    }
}
