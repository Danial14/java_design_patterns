package shapes;
public class Circle implements shape{
    private static int noOfInstances = 0;
    @Override
    public void draw() {
       System.out.println("Circle draw");
    }
    private Circle(){}
    static Circle getInstance() throws Exception{
        if(noOfInstances < 2){
            noOfInstances++;
            return new Circle();
        }
        throw new Exception("Cannot create more than two instances of Circle");
    }    
}
