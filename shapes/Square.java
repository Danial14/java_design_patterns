package shapes;
public class Square implements shape{
    private static int noOfInstances = 0;
    @Override
    public void draw() {
        System.out.println("Square draw");
    }
    private Square(){}
    static Square getInstance() throws Exception{
        if(noOfInstances < 2){
            noOfInstances++;
            return new Square();
        }
        throw new Exception("Cannot create more than two instances of Square");
    }  
}
