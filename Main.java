import representation.*;

import univers.*;
import univers.Armes.Epee;
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
        Node n1 = new TerminalNode("Description");
        TerminalNode tn1 = new TerminalNode("Je suis le terminalNode1");
        TerminalNode tn2 = new TerminalNode("Je suis le terminalNode2");
        DecisionNode dn1 = new DecisionNode("Je suis decisionNode 1",n1,tn1,tn2);

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
        Monstre M1 = new Legendaire("Minotaure");
        Element[] ElemList = {Element.FEU};
        CreatureVolante M2 = new CreatureVolante("Dragon",5,ElemList);
        
        System.out.println("Je suis " +D1.getNom() +" et j'ai " + D1.getVie()+"vies.");
        System.out.println("Je suis " +M1.getNom() +" et j'ai " + M1.getVie()+" vies.");
        System.out.println("Je suis " +M2.getNom() +" et j'ai " + M2.getVie()+" vies et je vole : " + M2.getVol());
        */
        //----------------------------TEST HEROS ----------------------------
        Scanner sc = new Scanner(System.in);
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
        System.out.print("Commencons par choisir ton arme");
        sc.nextLine();
        Epee epee = new Epee("Epee en bois",9,4,5);
        Artefacte a1 = Artefacte.AILES;
        Artefacte a2 = Artefacte.CASQUE_DE_HADES;
        Objet o1 = Objet.CLEF_DES_ENFERS;
        Objet o2 = Objet.TETE_DE_GORGOGNE;

        heros.setArme(epee);
        heros.ajouteArtefacte(a1);
        heros.ajouteArtefacte(a2);
        heros.ajouteObjet(o1);
        heros.ajouteObjet(o2);

        heros.showArme();
        heros.showArtefactes();
        heros.showObjets();

        //System.out.print("Fin !!");
        
    }
}                       