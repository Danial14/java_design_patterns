package prototype;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, Shape> shapes = new Hashtable<String, Shape>();
    public static Shape getShape(String shapeKey){
        Shape clonedShape = (Shape) shapes.get(shapeKey).clone();
        return clonedShape;
    }
    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("C1");
        shapes.put(circle.getId(), circle);
        Square square = new Square();
        square.setId("S1");
        shapes.put(square.getId(), square);
    }
}
