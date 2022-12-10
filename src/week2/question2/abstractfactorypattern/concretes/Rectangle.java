package week2.question2.abstractfactorypattern.concretes;

import week2.question2.abstractfactorypattern.interfaces.Shape;

public class Rectangle implements Shape {


    @Override
    public void draw() {

        System.out.println(this.getClass().getSimpleName() + " draw() method");

    }
}
