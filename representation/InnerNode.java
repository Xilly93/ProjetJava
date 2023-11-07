package representation;

public abstract class InnerNode extends Node {
    protected Node[] nodes = new Node[4];

    public InnerNode(String description,Node n1,Node n2,Node n3,Node n4){
        super(description);
        nodes[0] = n1;
        nodes[1] = n2;
        nodes[2] = n3;
        nodes[3] = n4;
    }
    
    @Override
    public abstract Node chooseNext();
}
