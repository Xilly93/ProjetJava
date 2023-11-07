import representation.*;

import univers.*;
import univers.Artefactes.Artefacte;
import univers.Objets.Objet;
import univers.Armes.*;
import univers.Personnages.*;
import univers.Personnages.Divinites.*;
import univers.Personnages.Divinites.Dieux.*;
import univers.Personnages.Mortels.*;
import univers.Personnages.Monstres.*;
import univers.Personnages.Monstres.Creatures.*;
import univers.Personnages.Monstres.Creatures.Communs.*;
import univers.Personnages.Monstres.Creatures.Epics.*;
import univers.Personnages.Monstres.Creatures.Legendaires.*;
import univers.Personnages.Monstres.Creatures.Rares.*;
import univers.Interfaces.*;

public class Main{

    public static void main (String args[]){
        Node n1 = new TerminalNode("Description");
        TerminalNode tn1 = new TerminalNode("Je suis le terminalNode1");
        TerminalNode tn2 = new TerminalNode("Je suis le terminalNode2");
        DecisionNode dn1 = new DecisionNode("Je suis decisionNode 1",n1,tn1,tn2);

        // ----------------------------TEST Nodes--------------------------- 
        // Test Decision Node

        Node resultNode = dn1.chooseNext();
        resultNode.display();
        
        // Test ChanceNode ; 

        double[] proba1 = {(double)1/3,(double)1/3,(double)1/3,0} ;
        ChanceNode cn1 = new ChanceNode("Je suis ChanceNode1",proba1,n1,tn1,tn2);
        Node resultNodeCn = cn1.chooseNext();
        resultNodeCn.display();

        // ----------------------------TEST MONSTRES--------------------------- 
        
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
        

        //----------------------------TEST ARTEFACTE-OBJET---------------------------
        /*
        Artefacte A1 = Artefacte.Ailes;
        Artefacte A2 = Artefacte.Casque_De_Hades;
        Objet O1 = Objet.Yeux_Oedipe;
        Objet O2 = Objet.Clef_Des_Enfers;
        */
       
    }
}                       