package abstract_factory.Factory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factory){
        switch(factory.toLowerCase()){
            case "shape":
              return new ShapeFactory();
            case "color":
              return new ColorFactory();
            default:
              return null;

        }
        }
        private FactoryProducer(){
            
        }
    
}

abstract class AbstractFactory{
    abstract AbstractFactory getShapeFactory();
    abstract AbstractFactory getColorFactory();
}
