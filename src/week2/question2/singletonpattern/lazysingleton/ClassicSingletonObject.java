package week2.question2.singletonpattern.lazysingleton;

public class ClassicSingletonObject {

    private static ClassicSingletonObject singleInstance = null;


    public static ClassicSingletonObject getInstance(){

        if (singleInstance == null){
            singleInstance = new ClassicSingletonObject();
        }
        return singleInstance;
    }

    public void showMessage(){
        System.out.println("Hello World.");
    }


}
