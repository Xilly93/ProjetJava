import representation.*;

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

public class Main{
    public static void main (String args[]){
        /* 
        Node n1 = new TerminalNode("Description");
        TerminalNode tn1 = new TerminalNode("Je suis le terminalNode1");
        TerminalNode tn2 = new TerminalNode("Je suis le terminalNode2");
        DecisionNode dn1 = new DecisionNode("Je suis decisionNode 1",n1,tn1,tn2);
        */
        // ----------------------------TEST Nodes--------------------------- 
        // Test Decision Node
        /*
        Node resultNode = dn1.chooseNext();
        resultNode.display();
        
        // Test ChanceNode ; 
        
        double[] proba1 = {(double)1/3,(double)1/3,(double)1/3,0} ;
        ChanceNode cn1 = new ChanceNode("Je suis ChanceNode1",proba1,n1,tn1,tn2);
        Node resultNodeCn = cn1.chooseNext();
        resultNodeCn.display();
        */
        // ----------------------------TEST MONSTRES--------------------------- 
        /*
        PersonnageDeBase H1 = new Civil();
        Monstre M0 = new Araignees();
        Monstre M1 = new Centaure();
        Monstre M2 = new Sirene();
        Monstre M3 = new Harpie();
        Monstre M4 = new Gorgone();
        Monstre M5 = new Chimere();
        Monstre M6 = new LoupGarou();
        Monstre M7 = new Dragon();
        Monstre M8 = new Cerbere();
        Monstre M9= new Minotaure();
        Monstre M10 = new Hydre();

        Divinite D1 = new Poseidon();
        Divinite D2 = new Zeus();
        Divinite D3 = new Hephaistos();
        Divinite D4 = new Ares();

        Divinite D5 = new Titan("Chronos");
        Divinite D6 = new Titan("Atlas");
        Divinite D7 = new Titan("Promethee");
        */

        //----------------------------TEST ARTEFACTE-OBJET---------------------------
        /*
        Artefacte A1 = Artefacte.Ailes;
        Artefacte A2 = Artefacte.Casque_De_Hades;
        Objet O1 = Objet.Yeux_Oedipe;
        Objet O2 = Objet.Clef_Des_Enfers;
        */
       
        //----------------------------TEST PERSONNAGES---------------------------
        /*
        Divinite D1 = new Dieu("Zeus",4,Element.FOUDRE);
        Element[] ElemList1 = {Element.ANIMAL};
        Monstre M1 = new Legendaire("Minotaure",ElemList1);
        Element[] ElemList2 = {Element.FEU,Element.VENT};
        CreatureVolante M2 = new CreatureVolante("Dragon",5,ElemList2);
        //Element[] ElemList3 = {Element.ANIMAL};
        Monstre M3 = new Legendaire("Minotaure",ElemList2);


        System.out.println(D1);
        System.out.println(M1);
        System.out.println(M2);
        System.out.println(M3);
        //System.out.println(M3.equals(M2));
         */
        
        //----------------------------TEST HEROS ----------------------------
         /* 
        Epee epee = new Epee("Epee en bois",9,4,5);
        Artefacte a1 = Artefacte.AILES;
        Artefacte a2 = Artefacte.CASQUE_DE_HADES;
        Objet o1 = Objet.CLEF_DES_ENFERS;
        Objet o2 = Objet.TETE_DE_GORGOGNE;
        Heros heros = new Heros("L");
        heros.setArme(epee);
        heros.ajouteArtefacte(a1);
        heros.ajouteArtefacte(a2);
        heros.ajouteObjet(o1);
        heros.ajouteObjet(o2);

        System.out.println(heros);
         */
    // ------------------ PERSONNAGES -----------------------------
    Dieu[] Dieux = {new Dieu("Poseidon",6,Element.EAU),new Dieu("Zeus",6,Element.FOUDRE),new Dieu("Héphaistos",6,Element.FEU),new Dieu("Ares",6,Element.FEU),new Dieu("Hermes",6,Element.VENT)};
    Titan[] Titans = {new Titan("Chronos",6),new Titan("Promethee",6),new Titan("Atlas",6)};
    DemiDieu[] DemiDieux = {new DemiDieu("Hercule"),new DemiDieu("Achille"),new DemiDieu("Thesee"),new DemiDieu("Ulysse")};
    Civil[] Civils = {new Civil("Persee"),new Civil("Dedale"),new Civil("Icare"),new Civil("Oedipe"),new Civil("Jason"),new Civil("Midas")};
    Commun[] Communs = {new Commun("Araignees")};
    Rare[] Rares = {new Rare("Sirene", new Element[]{Element.EAU,Element.ANIMAL}),new Rare("Satyre", new Element[]{Element.ANIMAL}),new Rare("Centaure", new Element[]{Element.ANIMAL})};
    Demon[] Demons = {new Demon("Cerbere", new Element[]{Element.ANIMAL,Element.FEU,Element.ENFER}),new Demon("Gorgogne", new Element[]{Element.ENFER})};
    
    // ------------------ ARMES -----------------------------
    Epee[] Epees = {new Epee("Epee en bois",9,4,7), new Epee("Excalibur", 100, 50, 20,Element.FEU)};
    Lance[] Lances = {new Lance("Lance en bois",7,9,4)};
    Arc[] Arc = {new Arc("Arc en bois",4,7,9)}; 


    //-------------------HISTOIRE------------------
    
    Scanner sc = new Scanner(System.in);
    // Choix du nom du personnage
        System.out.print("Choisissez le nom de votre Héros : ");
        String Nom = sc.next();
        Heros heros = new Heros(Nom);
        sc.nextLine();
        System.out.print("Salut ! Tu es " +heros.getNom());
        sc.nextLine();
        System.out.print("Es tu prêt à commencer l'aventure ??");
        sc.nextLine();
        System.out.print("Super !!");
        sc.nextLine();
    
    // Partie 1 : Arrivée d'Hermes
    
        // INITIALISATION DES NOEUDS
        String I1p1 = "\nVous vous reveillez en plein milieu d'une piece vide. Vous ne savez pas qui vous etes. Vous avez perdu la mémoire.\n ";
        String I1p2 = "Vous voyez un mystérieux personnage arrivé du ciel. Qui est ce mysterieux personnage ?";
        String I1p3 = "Salut, je suis Hermes, je viens t'aider dans ton aventure. Tu es dans le celebre et redoutable labyrinthe de Dedale.\n";
        String I1p4 = "Considère ce lieu comme ta prison. Dieu t'as enfermé pour avoir commis un crime impardonable !";
        String I1p5 = "Ta mission est de t'echapper ou sinon tu periras a vie dans ce lieu.";
        String I1p6 = "Si tu as bien compris dis moi OUI, sinon NON :\n1.Oui\n2.Non\n(Choississez entre 1 ou 2)";
        InnerNode[] I1 = {new InnerNode(I1p1),new InnerNode(I1p2),new InnerNode(I1p3),new InnerNode(I1p4),new InnerNode(I1p5)};
        DecisionNode dn1 = new DecisionNode(I1p6);
        for (int i = 0; i<I1.length-1; i++){
            I1[i].setNodes(I1[i+1]);
        }
        I1[4].setNodes(dn1);
        Node t1 = new TerminalNode("OUI");
        Node t2 = new TerminalNode("NON");
        dn1.setNodes(t1,t2);

        // Execution DES NOEUDS
        for (int i = 0; i<I1.length; i++){
            System.out.print(I1[i].getDescription());
            sc.nextLine();
        }
        System.out.println(dn1.getDescription());
        dn1.chooseNext();
    
    }
}                       