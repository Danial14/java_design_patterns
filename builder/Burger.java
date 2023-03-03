package builder;

public abstract class Burger implements Item{
    @Override
    public Packing pack() {
        // TODO Auto-generated method stub
        return new Wrapper();
    }  
}
