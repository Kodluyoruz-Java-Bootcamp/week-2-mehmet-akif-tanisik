package week2.question2.objectpoolpattern;

public class ObjectPoolPatternDemo {


    public static void main(String[] args) {

        ObjectPoolPattern<UAV> objectPoool = new UAVPool();
        UAV uav1 = objectPoool.create();
        UAV uav2 = objectPoool.create();

        objectPoool.checkOut(uav1);

        UAV uav3 = objectPoool.checkIn();


    }
}
