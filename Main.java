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
import java.util.List;

public class Main {
    public static void main (String args[]){
        // ----------------------------TEST Nodes--------------------------- 
        /*
        // Test Decision Node
        
        Node resultNode = dn1.chooseNext();
        resultNode.display();
        
        // Test ChanceNode ; 
        
        double[] proba1 = {(double)1/3,(double)1/3,(double)1/3,0} ;
        ChanceNode cn1 = new ChanceNode("Je suis ChanceNode1",proba1,n1,tn1,tn2);
        Node resultNodeCn = cn1.chooseNext();
        resultNodeCn.display();
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
        String I1p1 = "\nVous vous reveillez en plein milieu d'une piece vide. Vous ne savez pas qui vous etes. Vous avez perdu la mémoire";
        String I1p2 = "Vous voyez un mystérieux personnage arrivé du ciel. Qui est ce mysterieux personnage ?";
        String I1p3 = "Salut, je suis Hermes, je viens t'aider dans ton aventure. Tu es dans le celebre et redoutable labyrinthe de Dedale.";
        String I1p4 = "Considère ce lieu comme ta prison. Dieu t'as enfermé pour avoir commis un crime impardonable !";
        String I1p5 = "Ta mission est de t'echapper ou sinon tu periras a vie dans ce lieu.";
        String I2p1 = "Tres bien. Commençons";
        String I2p2 = "Avant de partir, je vais t'offrir un cadeau, histoire que tu ne meurs pas dès les premieres secondes.";
        String I2_2p1 = "Tu n'as pas COMPRIS ???";
        String I2_2p2 = "Comment dire ...";
        String I2_2p3 = "Contente toi de ne pas mourir !";
        String I3p1 = "Désormais ta destinée ne tient plus qu'à tes propres décisions.";
        String I3p2 = "Je te souhaite bonne chance pour ton aventure. Nous nous reverrons très sûrement. Enfin ... si tu es toujours vivant.";
        String I3p3 = "Hermès s'en va...";
        String I3p4 = "Vous continuez sur le seul couloir qui se présente à vous dans la pièce. Le couloir est ancien et sombre dans le fond mais vous n’avez pas le choix. Seul quelques torches éclairent le lieu. ";
        String I3p5 ="Au fur et à mesure que vous avancez. Des carcasses de morts et des os humain trainent sur le sol. La poussière enveloppe le lieu, vous ne voyez pas plus de 5 mètres devant vous. Des toiles d'arraignent recouvrent les murs et l'odeur est infame, une sorte d'odeur de chair. Quelque chose cloche ...";
        String I3p6 ="Vous voyez un cocon en toile d'arraignee au niveau du plafond, un cadavre à l'air d'y être suspendu. Il fait trop sombre pour savoir s'il est vivant ou mort. Vous vous approchez de ce cadavre...";
        String I4p1= "Vous vous approchez lentement de l'arraignée.";
        String I4p2 = "Hélas, celle ci-bondit sur vous, pour y planter ses griffes, arrachant brusquement la tête de votre corps. Elle finit par envelopper le reste de votre corps dans un cocon pour donner à manger à ses enfants arraignées. Elle avait probablement faim...";
        String I4_2p1= "Vous bondissez sur elle en utilisant votre arme et vous réussissez à l'abattre. Bien joué !";
        String I5p1 = "Vous faites un bond en arrière et lui infligez une attaque a distance.\r\n";
        String I5p2 = "Elle s'enfuit de douleur vous laissant le passage pour la suite. Bien joué";
        String D1p = "Si tu as bien compris dis moi OUI, sinon NON :\n1.Oui\n2.Non\n(Choississez entre 1 ou 2)";
        String D2p = "Je te laisse le choix entre trois armes. Chaque arme possèdes des attributs spécials. Lequel choisis tu :\n1.Epee\n2.Lance\n3.Arc";
        String D3p = "Une arraignée géante tombe du plafond. Elle à l'air aggressive . Que faites vous ...\r\n1.S'approcher calmement pour voir s'il est inoffensif.\r\n2.Se rapprocher et lui donner un coup. \r\n3.Essayer de l'attaquer en prenant de la distance.\r\n";
        String[] I1p = {I1p1, I1p2, I1p3, I1p4, I1p5};
        String[] I2p = {I2p1,I2p2};
        String[] I2_2p = {I2_2p1,I2_2p2,I2_2p3};
        String[] I3p = {I3p1,I3p2,I3p3,I3p4,I3p5,I3p6};
        String[] I4p= {I4p1,I4p2};
        String[]I4_2p = {I4_2p1};
        String[] I5p = {I5p1,I5p2};
        InnerNode[] I1 = NodeF.CreateLinkedNodes(I1p);
        InnerNode[] I2 = NodeF.CreateLinkedNodes(I2p);
        InnerNode[] I2_2 = NodeF.CreateLinkedNodes(I2_2p);
        InnerNode[] I3 = NodeF.CreateLinkedNodes(I3p);
        InnerNode[] I4 = NodeF.CreateLinkedNodes(I4p);
        InnerNode[] I4_2 = NodeF.CreateLinkedNodes(I4_2p);
        InnerNode[] I5 = NodeF.CreateLinkedNodes(I5p);
        //  SoundNode sn1 = new SoundNode(I1[0],"Interstellar.wav",0.0f);
        DecisionNode D1 = new DecisionNode(D1p);
        DecisionNode D2 = new DecisionNode(D2p); 
        DecisionNode D3 = new DecisionNode(D3p);
        D2.addPerso(heros);
        D2.addArme(Epees[0]);
        D2.addArme(Lances[0]);
        D2.addArme(Arcs[0]);
        D2.setAction(1); 
        D3.setCondition(1);
        D3.addPerso(heros);  
        D3.setAllStatsMin(new int[][]{{0,0,0},{5,0,0},{0,5,0}} );
        D3.setNextChoice(new int[][]{{1,1},{2,1},{3,4}}); // [[victoire,perdu], ...]
        NodeF.Link(I1,D1);
        NodeF.Link(D1,1,I2,D2);
        NodeF.Link(D1,2,I2_2);
        NodeF.Link(I2_2,I2);   
        NodeF.Link(D2,1,I3,D3);
        NodeF.Link(D2,2,I3,D3);
        NodeF.Link(D2,3,I3,D3);
        NodeF.Link(D3,1 ,I4);
        NodeF.Link(D3,2,I4_2);
        NodeF.Link(D3,3,I5);
        NodeF.Link(D3,4,I4[1]);
        
        /*for(String ligne : nodesText)
            System.out.println(ligne);
        */
        List<Node> nodeList = Lecture.CreateNodeList("C:\\Users\\willy\\OneDrive\\Bureau\\Java\\Projet\\Nodes.txt");
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
        NodeF.Execute(I1[0],sc);

    // Test Sound Node
    /*
    Event N1 = new InnerNode("Sound Node test");
    N1 = new SoundNode(N1);
    N1.display();
    Scanner sc = new Scanner(System.in);
    sc.nextLine();
    */   
    }
    
}