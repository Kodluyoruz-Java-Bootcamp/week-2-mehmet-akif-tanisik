package week2.question2.singletonpattern.earlysingleton;

public class SingletonObject {


    private static SingletonObject singleInstance = new SingletonObject();

    private SingletonObject(){

    }

    public static SingletonObject getInstance(){
        return singleInstance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
