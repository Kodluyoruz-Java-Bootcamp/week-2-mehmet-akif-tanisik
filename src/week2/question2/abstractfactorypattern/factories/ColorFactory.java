package week2.question2.abstractfactorypattern.factories;

import week2.question2.abstractfactorypattern.abstracts.AbstractFactory;
import week2.question2.abstractfactorypattern.concretes.Blue;
import week2.question2.abstractfactorypattern.concretes.Green;
import week2.question2.abstractfactorypattern.concretes.Red;
import week2.question2.abstractfactorypattern.interfaces.Color;
import week2.question2.abstractfactorypattern.interfaces.Shape;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String shapeType) {
        if (shapeType == null){
            return null;
        }

        if (shapeType.equalsIgnoreCase("RED")){
            return new Red();
        } else if (shapeType.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if (shapeType.equalsIgnoreCase("BLUE")){
            return new Blue();
        }

        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }


}
