package builder;

public abstract class Colddrink implements Item{
    @Override
    public Packing pack() {
        // TODO Auto-generated method stub
        return new Bottle();
    }    
}
