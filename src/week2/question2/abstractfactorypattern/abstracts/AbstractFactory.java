package week2.question2.abstractfactorypattern.abstracts;

import week2.question2.abstractfactorypattern.interfaces.Color;
import week2.question2.abstractfactorypattern.interfaces.Shape;

public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);


}
