package week2.question2.singletonpattern.earlysingleton;

public class SingletonPatternDemo {

    public static void main(String[] args) {

        SingletonObject object = SingletonObject.getInstance();

        object.showMessage();

    }


}
