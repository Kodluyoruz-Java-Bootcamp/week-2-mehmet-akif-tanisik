package week2.question2.factorypattern.concretes;

import week2.question2.factorypattern.interfaces.Shape;

public class Circle implements Shape {


    @Override
    public void draw() {

        System.out.println(this.getClass().getSimpleName() + " - draw() method." );

    }

}
