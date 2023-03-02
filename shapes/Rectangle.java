package shapes;
public class Rectangle implements shape{
    private static int noOfInstances = 0;
    @Override
    public void draw() {
        System.out.println("Rectangle draw");
    }
    private Rectangle(){}
    static Rectangle getInstance() throws Exception{
        if(noOfInstances < 2){
            noOfInstances++;
            return new Rectangle();
        }
        throw new Exception("Cannot create more than two instances of Rectangle");
    }
}
