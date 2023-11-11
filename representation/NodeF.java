package representation;

import java.util.Scanner;

public class NodeF {
        public static InnerNode[] CreateNodes(String[] descriptions){
        int n = descriptions.length;
        InnerNode[] I = new InnerNode[n];
        for(int i =0; i<n; i++){
            I[i] = new InnerNode(descriptions[i]);
            }
        return I;
    }

    public static InnerNode[] CreateLinkedNodes(String[] descriptions){
        InnerNode[] I = CreateNodes(descriptions);
        int n = descriptions.length;
        for(int i = 0 ; i<n-1;i++){
            I[i].setNodes(I[i+1]);
        }
        return I;
    }
    
    public static void Link(DecisionNode d,int numero, InnerNode[] I){ // I est un Linked Nodes et numéro (1,2,3 ou 4)
        Node[] DNodes = d.getNodes();
        DNodes[numero-1] = I[0];
        d.setNodes(DNodes); 
    }
    public static void Link(InnerNode[] I, DecisionNode d){ // I est un Linked Nodes
        int n = I.length;
        I[n-1].setNodes(d);
    }

    public static void Link(DecisionNode d1,int numero, InnerNode[] I, DecisionNode d2){ // I est un Linked Nodes
        Link(d1,numero, I);
        Link(I,d2);
    }

    public static void Link(InnerNode[] I1, InnerNode[] I2){ // I est un Linked Nodes
        int n = I1.length;
        I1[n-1].setNodes(I2[0]);
    }

    
    
    public static InnerNode[] CreateNodes(String[] descriptions, DecisionNode dNode){
        InnerNode[] I = CreateNodes(descriptions);
        int n = descriptions.length;
        I[n-1].setNodes(dNode);
        return I;
    }

    public static void Execute(Node node,Scanner sc ){
        {
            if (node == null){
                System.out.println("FIN !!");
                return;
            }

            System.out.print(node);
            if (!(node instanceof DecisionNode)){
            sc.nextLine();
            }
            if(node instanceof TerminalNode){Execute(null, sc); return;}
            Execute(node.chooseNext(), sc);
        }
    }

}
