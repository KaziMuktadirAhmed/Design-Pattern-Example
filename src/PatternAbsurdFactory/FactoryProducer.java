package PatternAbsurdFactory;

import PatternFactory.RoundedShapeFactory;
import PatternFactory.ShapeFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory (boolean rounded) {
        if (rounded)
            return  new RoundedShapeFactory();
        else
            return new ShapeFactory();
    }
}
