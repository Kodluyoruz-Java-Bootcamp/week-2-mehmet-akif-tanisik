package week2.question2.abstractfactorypattern.factories;

import week2.question2.abstractfactorypattern.abstracts.AbstractFactory;
import week2.question2.abstractfactorypattern.concretes.Circle;
import week2.question2.abstractfactorypattern.concretes.Rectangle;
import week2.question2.abstractfactorypattern.concretes.Square;
import week2.question2.abstractfactorypattern.interfaces.Color;
import week2.question2.abstractfactorypattern.interfaces.Shape;

public class ShapeFactory extends AbstractFactory {


    public Shape getShape(String shapeType){

        if (shapeType == null){
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }

    public Color getColor(String color){
        return null;
    }
}
