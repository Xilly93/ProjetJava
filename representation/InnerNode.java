package representation;

public class InnerNode extends Node {
    protected Node[] nodes = new Node[4];

    public InnerNode(String description,Node n1,Node n2,Node n3,Node n4){
        super(description);
        nodes[0] = n1;
        nodes[1] = n2;
        nodes[2] = n3;
        nodes[3] = n4;
    }

    public InnerNode(String description){
        super(description);
    }
    
    public void setNodes(Node n1,Node n2,Node n3,Node n4){
        nodes[0] = n1;
        nodes[1] = n2;
        nodes[2] = n3;
        nodes[3] = n4;
    } 

    public void setNodes(Node n1){
        nodes[0] = n1;
    } 

    public void setNodes(Node n1,Node n2){
        nodes[0] = n1;
        nodes[1] = n2;
    } 

    public void setNodes(Node n1,Node n2,Node n3){
        nodes[0] = n1;
        nodes[1] = n2;
        nodes[2] = n3;
    } 
    
    @Override
    public Node chooseNext(){
        return this.nodes[0];
    };
}
