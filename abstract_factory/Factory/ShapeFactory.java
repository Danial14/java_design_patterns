package abstract_factory.Factory;

public class ShapeFactory extends AbstractFactory {
    @Override
    AbstractFactory getShapeFactory() {
        // TODO Auto-generated method stub
        return this;
    }
    @Override
    AbstractFactory getColorFactory() {
        // TODO Auto-generated method stub
        return null;
    }
    public Shape getShape(String shape){
        switch(shape.toLowerCase()){
            case "circle":
              return new Circle();
            case "square":
              return new Square();
            default:
              return null;
        }
    } 
}
