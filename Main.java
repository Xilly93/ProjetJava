import representation.*;

import Autres.*;
import univers.*;
import univers.Armes.*;
import univers.Artefactes.Artefacte;
import univers.Objets.Objet;
import univers.Personnages.*;
import univers.Personnages.Divinites.*;
import univers.Personnages.Mortels.*;
import univers.Personnages.Monstres.*;
import univers.Personnages.Monstres.Creatures.*;
import univers.Interfaces.*;
import java.util.Scanner;
import java.util.List;
import java.util.Map;
/**
 * 
 * Commentaire pour le Main
 */
public class Main {
	
	/**
	 * 
	 * Fonction Main
	 * @param args arguments du Main
	 */
    public static void main (String args[]){

    //Test Terminal Node

    // ------------------ PERSONNAGES -----------------------------
    Dieu[] Dieux = {new Dieu("Poseidon",6,Element.EAU),new Dieu("Zeus",6,Element.FOUDRE),new Dieu("Héphaistos",6,Element.FEU),new Dieu("Ares",6,Element.FEU),new Dieu("Hermes",6,Element.VENT)};
    Titan[] Titans = {new Titan("Chronos",6),new Titan("Promethee",6),new Titan("Atlas",6)};
    DemiDieu[] DemiDieux = {new DemiDieu("Hercule"),new DemiDieu("Achille"),new DemiDieu("Thesee"),new DemiDieu("Ulysse")};
    Civil[] Civils = {new Civil("Persee"),new Civil("Dedale"),new Civil("Icare"),new Civil("Oedipe"),new Civil("Jason"),new Civil("Midas")};
    Commun[] Communs = {new Commun("Araignees")};
    Rare[] Rares = {new Rare("Sirene", new Element[]{Element.EAU,Element.ANIMAL}),new Rare("Satyre", new Element[]{Element.ANIMAL}),new Rare("Centaure", new Element[]{Element.ANIMAL})};
    Demon[] Demons = {new Demon("Cerbere", new Element[]{Element.ANIMAL,Element.FEU}),new Demon("Gorgogne", new Element[]{})};
    
    // ------------------ ARMES -----------------------------
    Epee[] Epees = {new Epee("Epee en bois",9,4,7), new Epee("Epee d'Achille",15,7,10),new Epee("Epee d'Hector",18,10,14) , new Epee("Excalibur", 100, 50, 20,Element.FEU)};
    Lance[] Lances = {new Lance("Lance en bois",7,9,4),new Lance("Lance d'Athena",9,13,7)};
    Arc[] Arcs = {new Arc("Arc en bois",4,7,9)}; 


    //-------------------HISTOIRE------------------
    
Scanner sc = new Scanner(System.in);
// Choix du nom du personnage
    Heros heros = new Heros(null);
    //Introduction(heros,sc);

    // Partie 1 : Arrivée d'Hermes

    Map<String,Node> nodeMap = Lecture.CreateNodeMap("Donnees/Nodes.txt");
    Map<String,List<String>> nodeNextMap = Lecture.CreateNodeNextMap("Donnees/NextNodes.txt");
    Lecture.LinkNodeMap(nodeMap,nodeNextMap);
    Lecture.addHerosNodeMap(nodeMap,heros);
    //Lecture.AfficheNodeMap(nodeMap,nodeNextMap);

    DecisionNode D2 = (DecisionNode) nodeMap.get("D2");
    DecisionNode D3 = (DecisionNode) nodeMap.get("D3");
    DecisionNode D9 = (DecisionNode) nodeMap.get("D9");
    DecisionNode D10 = (DecisionNode) nodeMap.get("D10");
    DecisionNode D11 = (DecisionNode) nodeMap.get("D11");
    DecisionNode D15 = (DecisionNode) nodeMap.get("D15");
    DecisionNode D17 = (DecisionNode) nodeMap.get("D17");
    ChanceNode C1 = (ChanceNode) nodeMap.get("C1");
    ChanceNode C2 = (ChanceNode) nodeMap.get("C2");
    ChanceNode C3 = (ChanceNode) nodeMap.get("C3");
    InnerNode I20 = (InnerNode) nodeMap.get("I20");
    InnerNode I31 = (InnerNode) nodeMap.get("I31");
    InnerNode I36 = (InnerNode) nodeMap.get("I36");
    InnerNode I37 = (InnerNode) nodeMap.get("I37");
    InnerNode I52 = (InnerNode) nodeMap.get("I52");
    InnerNode I59 = (InnerNode) nodeMap.get("I59");
    InnerNode I70 = (InnerNode) nodeMap.get("I70");
    InnerNode I71 = (InnerNode) nodeMap.get("I71");
    InnerNode I74 = (InnerNode) nodeMap.get("I74");
    InnerNode I75 = (InnerNode) nodeMap.get("I75");
    
    
    //D2.addPerso(heros);
    D2.addArme(Epees[0]);
    D2.addArme(Lances[0]);
    D2.addArme(Arcs[0]);
    D2.setAction(1);
    D3.setNbOfDecision(3);
    D3.setCondition(1);
    D3.setAllStatsMin(new int[][]{{0,0,0},{5,0,0},{0,5,0}} );
    D3.setNextChoice(new int[][]{{1,1},{2,1},{3,4}}); // [[victoire,perdu], ...]
    D9.setAction(2);
    D9.addArme(Epees[1]);
    D10.setCondition(1);
    D10.setAllStatsMin(new int[][]{{0,0,9},{0,0,0},{0,5,0}} );
    D10.setNextChoice(new int[][]{{1,2},{2,2},{3,3}});
    D11.setNbOfDecision(4);
    D11.setCondition(1);
    D11.setAllStatsMin(new int[][]{{9,0,0},{7,0,7},{0,9,0},{0,7,7}});
    D11.setNextChoice(new int[][]{{2,1},{2,1},{2,1},{2,1}});
    D15.setNbOfDecision(3);
    D15.setCondition(2);
    D15.setObjets(new Objet[]{null,Objet.CIRE,null});
    D15.setNextChoice(new int[][]{{1,1},{2,4},{3,3}});
    D17.setNbOfDecision(3);
    D17.setCondition(2);
    D17.setObjets(new Objet[]{Objet.FLUTE_DE_PAN,null,null});
    D17.setNextChoice(new int[][]{{1,4},{2,2},{3,3}});


    C1.setProba(ChanceNode.HighChance);
    C2.setProba(ChanceNode.LowChance);
    C3.setProba(ChanceNode.FiftyFifty);
    
    I20.setAction(2);
    I20.addObjets(Objet.CIRE);
    I31.setCondition(1);
    I31.addPerso(heros);
    I31.setStatsMin(new int[]{5,4,4});
    I36.setAction(2);
    I36.addObjets(Objet.VIN);
    I37.setCondition(2);
    I37.addObjets(Objet.VIN);
    I52.setAction(3);
    I52.addArme(Epees[1]);
    I59.setAction(2);
    I59.addObjets(Objet.AILES_ICARE);
    I70.setAction(2);
    I70.addObjets(Objet.CLEF_DES_ENFERS);
    I71.setAction(3);
    I71.addArme(Lances[1]);
    I74.setAction(3);
    I74.addArme(Epees[2]);
    I75.setAction(2);
    I75.addObjets(Objet.BOUCLIER_MIROIR);


    //Execution
    heros.setArme(Epees[0]);
    heros.ajouteObjet(Objet.CIRE);
    heros.ajouteObjet(Objet.FLUTE_DE_PAN);
    MenuInter.Display(nodeMap);
    //NodeF.Execute(nodeMap.get("I54"),sc);

    }
    
    /**
     * Genere un texte d'introduction pour le joueur et donne un nom au Heros.
     * 
     * @param heros Heros du personnage
     * @param sc Scanner
     */
    public static void Introduction(Heros heros,Scanner sc){
        System.out.print("Choisissez le nom de votre Héros : ");
        String Nom = sc.next();
        heros.setNom(Nom);
        sc.nextLine();
        System.out.println("Salut ! Tu es " +heros.getNom());
        sc.nextLine();
        System.out.println("Quelle difficulte veux tu choisir :\n1.Facile (recommandé)\n2.Moyen\n3.Difficile");
        do{
            System.out.print("\nDECISION: ");
            try{
            int v = sc.nextInt();
            if (v ==1 || v==2 || v==3){
                sc.nextLine();
                heros.setVie(4-v);
                break;
            }
            throw new IllegalArgumentException();
            
            }
            catch(Exception e){
                System.out.println("\nCARACTERE INVALIDE:\nEntrez un entier parmi les reponses proposés...\n");
                sc.nextLine();
            }  
        }while(true);
        
        System.out.print("Es tu prêt à commencer l'aventure ??");
        sc.nextLine();
        System.out.print("Super !!");
        sc.nextLine();

    }
    
    
}