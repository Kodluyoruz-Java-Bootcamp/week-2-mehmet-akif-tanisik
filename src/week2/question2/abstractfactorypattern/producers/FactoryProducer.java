package week2.question2.abstractfactorypattern.producers;

import week2.question2.abstractfactorypattern.abstracts.AbstractFactory;
import week2.question2.abstractfactorypattern.factories.ColorFactory;
import week2.question2.abstractfactorypattern.factories.ShapeFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){

        if (choice.equalsIgnoreCase("SHAPE")){

            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")){

            return new ColorFactory();
        }

        return null;

    }


}
