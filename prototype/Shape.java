package prototype;

public abstract class Shape implements Cloneable {
    private String id;
    protected String type;
    public abstract void draw();
    public Object clone(){
        // TODO Auto-generated method stub
        Object clone = null;
        try{
            clone = super.clone();
            System.out.println("Shape cloned");
        }
        catch(CloneNotSupportedException e){
            System.out.println(e.getMessage());
        }
        return clone;
    }
    public String getType(){
        return type;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
}
