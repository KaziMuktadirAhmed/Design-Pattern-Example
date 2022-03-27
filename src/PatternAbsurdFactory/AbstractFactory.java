package PatternAbsurdFactory;

import PatternFactory.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape (String shapeType);
}
