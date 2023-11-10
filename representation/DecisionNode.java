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

    public DecisionNode(String description){
        super(description);
    }


    
    @Override
    public Node chooseNext(){

        while(! (decision == 1 ||decision == 2 ||decision == 3 ||decision == 4 )){
            System.out.print("\nDECISION : ");
            this.decision = sc.nextInt();
        }
        return nodes[decision-1];

    }

}
