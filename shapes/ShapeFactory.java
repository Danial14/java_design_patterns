package shapes;

public class ShapeFactory {
    private static int noOfInstances = 0;
    private static ShapeFactory shapeFactory;
    private ShapeFactory(){

    }
    public static ShapeFactory getInstance(){
        if(noOfInstances < 2){
            shapeFactory = new ShapeFactory();
            noOfInstances++;
        }
        else{
            System.out.println("Cannot create more than two instances of Shape factory");
        }
        return shapeFactory;
    }
    public shape getShape(String shape) throws Exception{
        try{
        switch(shape){
            case "Circle":
                return Circle.getInstance();
            case "Square":
                return Square.getInstance();
            case "Rectangle":
                return Rectangle.getInstance();
            default:
                return null;

        }
    }
    catch(Exception ex){
        throw ex;
    }
    }
}
