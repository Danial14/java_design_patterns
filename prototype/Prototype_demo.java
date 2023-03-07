package prototype;

public class Prototype_demo {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Circle circle = (Circle) ShapeCache.getShape("C1");
        circle.draw();
        Square square = (Square) ShapeCache.getShape("S1");
        square.draw();
    }
    
}
