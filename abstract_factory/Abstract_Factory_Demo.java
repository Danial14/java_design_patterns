package abstract_factory;

import abstract_factory.Factory.ColorFactory;
import abstract_factory.Factory.FactoryProducer;
import abstract_factory.Factory.Shape;
import abstract_factory.Factory.ShapeFactory;
import abstract_factory.Factory.Color;

public class Abstract_Factory_Demo {
    public static void main(String[] args){
        ShapeFactory shapeFactory = (ShapeFactory) FactoryProducer.getFactory("shape");
        Shape shape = shapeFactory.getShape("Square");
        shape.draw();
        shape = shapeFactory.getShape("circle");
        shape.draw();
        ColorFactory colorFactory = (ColorFactory) FactoryProducer.getFactory("color");
        Color color = colorFactory.getColor("Green");
        color.fill();
        color = colorFactory.getColor("red");
        color.fill();
    }
    
}
