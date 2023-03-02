import shapes.ShapeFactory;

public class first{
    public static void main(String[] args) {
        System.out.println("java vs");
        try{
        ShapeFactory shapeFactory = ShapeFactory.getInstance();
        shapeFactory.getShape("Circle").draw();
        shapeFactory.getShape("Square").draw();
        shapeFactory.getShape("Rectangle").draw();
        shapeFactory.getShape("Circle").draw();
        shapeFactory.getShape("Square").draw();
        shapeFactory.getShape("Rectangle").draw();
        //shapeFactory.getShape("Circle").draw();
        //shapeFactory.getShape("Square").draw();
        ShapeFactory.getInstance();
        ShapeFactory.getInstance();
        shapeFactory.getShape("Rectangle").draw();
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}