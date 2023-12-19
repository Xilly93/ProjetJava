package representation;

import java.util.Scanner;
import java.util.List;
import Autres.MenuInter;

public class NodeF {
    /*
    // Creer une liste de innernodes à partir d'une liste de texte
    public static InnerNode[] CreateNodes(String[] descriptions){
    int n = descriptions.length;
    InnerNode[] I = new InnerNode[n];
    for(int i =0; i<n; i++){
        I[i] = new InnerNode(descriptions[i]);
        }
    return I;
    }

    // Lie tous les InnerNode de la liste un à un
    public static InnerNode[] CreateLinkedNodes(String[] descriptions){
        InnerNode[] I = CreateNodes(descriptions);
        int n = descriptions.length;
        for(int i = 0 ; i<n-1;i++){
            I[i].setNodes(I[i+1]);
        }
        return I;
    }
    */
    // Liaison DecisionNode - LinkedNode
    public static void Link(InnerNode I1, Node I2){ // I est un Linked Nodes et numéro (1,2,3 ou 4) // d est un decision Node ou linked Node
        I1.setNodes(I2);
    }

    public static void Link(InnerNode I1, int numero, Node I2){ // I est un Linked Node
        I1.setNodes(numero,I2);
    }

    public static void Link(InnerNode I1, int[] numeros, Node[] allI){ // taille de numeros == taille allI
        for (int i = 0; i<numeros.length; i++){
            I1.setNodes(numeros[i],allI[i]);
        }
    }
    /*
    public static void Link(InnerNode d,int numero, InnerNode[] I){ // I est un Linked Nodes et numéro (1,2,3 ou 4) // d est un decision Node ou linked Node
        d.setNodes(numero,I[0]);
    }
    
    // Liaison LinkedNode - DecisionNode
    public static void Link(InnerNode[] I, InnerNode d){ // I est un Linked Node
        int n = I.length;
        I[n-1].setNodes(d);
    }

    // Liaison DecisionOuInnerNode - LinkedNode - DecisionOuInnerNode
    public static void Link(InnerNode d1,int numero, InnerNode[] I, InnerNode d2){ // I est un Linked Nodes
        Link(d1,numero, I);
        Link(I,d2);
    }

    // Liaison LinkedNode - LinkedNode
    public static void Link(InnerNode[] I1, InnerNode[] I2){ // I est un Linked Nodes
        int n = I1.length;
        I1[n-1].setNodes(I2[0]);
    }
     */
    public static void mettreAjour(Node node){
        //System.out.println("MAJ");
        if ( node.getAction() == 0){
            return;
        }
        if(node instanceof DecisionNode){
            DecisionNode dnode = (DecisionNode) node;
            dnode.callAction();
        }
        else{
            node.callAction();
        }
        //System.out.println("MISE A JOUR : Je mets à jour.");
         
        if (node instanceof InnerNode){
            InnerNode n = (InnerNode) node;
            if (n.action > 0 || n.getCondition() > 0)
                System.out.println(node.personnages[0]);
        }
        return;
    }

    
    public static void Execute(Node node,Scanner sc ){
        {
            if (node == null){
                System.out.println("FIN !!");
                return;
            }
            if(!(node.getDescription().equals("null")))
                //System.out.println(node.personnages[0]);
                node.display();
            mettreAjour(node);
            if (!(node instanceof DecisionNode || node.getDescription().equals("null"))){
                String s = sc.nextLine();
                if(s.equals("s")){
                    MenuInter.sauvegarder(node);
                }
            }


            if(node instanceof TerminalNode){Execute((Node)null, sc); return;}
            Execute(node.chooseNext(), sc);
        }
    }

    public static void Execute(DecorateurNode node,Scanner sc ){
        if (node.E instanceof Node){
            node.display();
            Node node1 = (Node) node.E;
            Execute(node1,sc);
        }
    }
}
