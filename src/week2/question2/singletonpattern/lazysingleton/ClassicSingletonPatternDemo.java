package week2.question2.singletonpattern.lazysingleton;

public class ClassicSingletonPatternDemo {


    public static void main(String[] args) {

        ClassicSingletonObject object = ClassicSingletonObject.getInstance();

        object.showMessage();


    }


}
