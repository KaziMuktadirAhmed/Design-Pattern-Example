package PatternAbsurdFactory;

import PatternFactory.Shape;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        System.out.println("okay");
        run();
    }

    public static void run () {
        AbstractFactory RoundedFactory = FactoryProducer.getFactory(true);
        AbstractFactory PointyFactory = FactoryProducer.getFactory(false);

        Scanner scanInput = new Scanner(System.in);
        System.out.println("Input shape type: ");
        String shapeType = scanInput.nextLine();

        Shape pointyShape = PointyFactory.getShape(shapeType);
        Shape roundedShape = RoundedFactory.getShape(shapeType);

        pointyShape.draw();
        roundedShape.draw();
    }
}
