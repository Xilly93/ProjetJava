package representation;
import java.util.Scanner;

public class DecisionNode extends InnerNode {
    private Scanner sc = new Scanner(System.in);
    private int decision;
    
    public DecisionNode(String description,Node n1,Node n2,Node n3,Node n4){
        super(description,n1,n2,n3,n4);
    }

    public DecisionNode(String description,Node n1,Node n2,Node n3){
        super(description,n1,n2,n3,null);
    }

    public DecisionNode(String description,Node n1,Node n2){
        super(description,n1,n2,null,null);
    }


    
    @Override
    public Node chooseNext(){

        while(decision == 0){
            System.out.print("Choisissez le node 1,2,3 ou 4 : ");
            this.decision = sc.nextInt();
        }

        if (decision == 0){
            System.out.println("Apprends à ecrire");
            return null;
            }
        if (decision >4){
            System.out.println("Apprends à lire");
            return null;
        }
        return nodes[decision-1];

    }

}
