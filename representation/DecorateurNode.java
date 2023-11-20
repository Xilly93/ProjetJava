package representation;

public abstract class DecorateurNode implements Event{
    protected Event E;
    public DecorateurNode(Event E){
        this.E = E;
    }

    @Override
    public Event chooseNext() {
        return E.chooseNext();
    }
    @Override
    public void display(){
        E.display();
    }
    
    public Event getEvent(){
        return this.E;
    }
}
