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

public class Main {
    public static void main (String args[]){

    //Test Terminal Node
    TerminalNode t1 = new TerminalNode("TERMINAL NODE 1");
    TerminalNode t2 = new TerminalNode("TERMINAL NODE 2");
    TerminalNode t3 = new TerminalNode("TERMINAL NODE 3");
    TerminalNode t4 = new TerminalNode("TERMINAL NODE 4");
    TerminalNode GameOverTn = new TerminalNode("GAME OVER");

    // ------------------ PERSONNAGES -----------------------------
    Dieu[] Dieux = {new Dieu("Poseidon",6,Element.EAU),new Dieu("Zeus",6,Element.FOUDRE),new Dieu("Héphaistos",6,Element.FEU),new Dieu("Ares",6,Element.FEU),new Dieu("Hermes",6,Element.VENT)};
    Titan[] Titans = {new Titan("Chronos",6),new Titan("Promethee",6),new Titan("Atlas",6)};
    DemiDieu[] DemiDieux = {new DemiDieu("Hercule"),new DemiDieu("Achille"),new DemiDieu("Thesee"),new DemiDieu("Ulysse")};
    Civil[] Civils = {new Civil("Persee"),new Civil("Dedale"),new Civil("Icare"),new Civil("Oedipe"),new Civil("Jason"),new Civil("Midas")};
    Commun[] Communs = {new Commun("Araignees")};
    Rare[] Rares = {new Rare("Sirene", new Element[]{Element.EAU,Element.ANIMAL}),new Rare("Satyre", new Element[]{Element.ANIMAL}),new Rare("Centaure", new Element[]{Element.ANIMAL})};
    Demon[] Demons = {new Demon("Cerbere", new Element[]{Element.ANIMAL,Element.FEU}),new Demon("Gorgogne", new Element[]{})};
    
    // ------------------ ARMES -----------------------------
    Epee[] Epees = {new Epee("Epee en bois",9,4,7), new Epee("Excalibur", 100, 50, 20,Element.FEU)};
    Lance[] Lances = {new Lance("Lance en bois",7,9,4)};
    Arc[] Arcs = {new Arc("Arc en bois",4,7,9)}; 


    //-------------------HISTOIRE------------------
    
    Scanner sc = new Scanner(System.in);
    // Choix du nom du personnage
        Heros heros = new Heros(null);
        Introduction(heros,sc);
    
        // Partie 1 : Arrivée d'Hermes
        Map<String,Node> nodeMap = Lecture.CreateNodeMap("Donnees/Nodes.txt");
        Map<String,List<String>> nodeNextMap = Lecture.CreateNodeNextMap("Donnees/NextNodes.txt");
        Lecture.AfficheNodeMap(nodeMap,nodeNextMap);
        Lecture.LinkNodeMap(nodeMap,nodeNextMap);
        DecisionNode D2 = (DecisionNode) nodeMap.get("D2");
        DecisionNode D3 = (DecisionNode) nodeMap.get("D3");

        D2.setNbOfDecision(3);
        D2.addPerso(heros);
        D2.addArme(Epees[0]);
        D2.addArme(Lances[0]);
        D2.addArme(Arcs[0]);
        D2.setAction(1);
        D3.setNbOfDecision(3);
        D3.setCondition(1);
        D3.addPerso(heros);
        D3.setAllStatsMin(new int[][]{{0,0,0},{5,0,0},{0,5,0}} );
        D3.setNextChoice(new int[][]{{1,1},{2,1},{3,4}}); // [[victoire,perdu], ...]
        
        

        /*for(String ligne : nodesText)
            System.out.println(ligne);
        */
        /* 
        NodeF.Link(C2,1,I4[1]);
        NodeF.Link(C2,2,I5);

        String I6p1 = "Vous continuez votre chemin et voyez que le couloir se sépare en deux chemins différents";
        String D4p = "GAUCHE : Un couloir bien éclairé avec des tableaux de monarques de part et d'autres des murs et un tapis rouge sur le sol qui mène jusqu'au bout du couloir.\nDROITE : Un couloir sombre qui vous à l'air de mener vers un lieu qui a l'air d'être éclairé par la lumière naturelle du soleil.\n1.GAUCHE\n2.DROITE";
        String[] I6p = {I6p1};
        DecisionNode D4 = new DecisionNode(D4p);
        InnerNode[] I6 = NodeF.CreateLinkedNodes(I6p);
        NodeF.Link(I5,I6);
        NodeF.Link(I4_2,I6);
        NodeF.Link(I6,D4);
         */

        //Execution
        System.out.println("EXECUTION");
        NodeF.Execute(nodeMap.get("I1"),sc);

    }

    public static void Introduction(Heros heros,Scanner sc){
        System.out.print("Choisissez le nom de votre Héros : ");
        String Nom = sc.next();
        heros.setNom(Nom);
        sc.nextLine();
        System.out.print("Salut ! Tu es " +heros.getNom());
        sc.nextLine();
        System.out.print("Es tu prêt à commencer l'aventure ??");
        sc.nextLine();
        System.out.print("Super !!");
        sc.nextLine();

    }
    
}