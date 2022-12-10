package week2.question2.factorypattern.factory;
import week2.question2.factorypattern.concretes.Circle;
import week2.question2.factorypattern.concretes.Rectangle;
import week2.question2.factorypattern.concretes.Square;
import week2.question2.factorypattern.interfaces.Shape;

public class ShapeFactory {

    public Shape getShape(String shapeType) {

        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        return null;
    }


}
