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

    @Override 
    public String toString(){
        return "\n" + this.Nom + "\nVies : " + this.vie ;
    }

    @Override 
    public boolean equals(Object obj){
        PersonnageDeBase P2 = (PersonnageDeBase) obj;
        return this.vie == P2.vie && this.Nom.equals(P2.Nom);
    }
}