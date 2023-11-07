package univers;

public abstract class PersonnageDeBase {
    protected int vie;
    protected String Nom;
    public PersonnageDeBase(String Nom){
        //System.out.println("Je suis un personnage de base !");
        this.Nom = Nom;
    }
    public int getVie(){
        return this.vie;
    }

    public String getNom(){
        return this.Nom;
    }
}