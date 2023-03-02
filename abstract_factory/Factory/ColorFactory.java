package abstract_factory.Factory;

public class ColorFactory extends AbstractFactory {
    @Override
    AbstractFactory getColorFactory() {
        // TODO Auto-generated method stub
        return this;
    }
    @Override
    AbstractFactory getShapeFactory() {
        // TODO Auto-generated method stub
        return null;
    }
    public Color getColor(String color){
        switch(color.toLowerCase()){
            case "green":
                return new Green();
            case "red":
                return new Red();
            default:
                return null;
        }
    }  
}
