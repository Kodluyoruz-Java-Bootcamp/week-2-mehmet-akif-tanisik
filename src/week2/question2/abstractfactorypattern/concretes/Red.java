package week2.question2.abstractfactorypattern.concretes;

import week2.question2.abstractfactorypattern.interfaces.Color;

public class Red implements Color {


    @Override
    public void fill() {

        System.out.println(this.getClass().getSimpleName() + " fill() method");

    }
}
