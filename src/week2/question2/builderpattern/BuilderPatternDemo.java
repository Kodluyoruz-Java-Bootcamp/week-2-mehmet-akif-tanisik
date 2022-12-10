package week2.question2.builderpattern;

public class BuilderPatternDemo {

    public static void main(String[] args) {


        MobilePhone mobilePhone = new MobilePhone.MobilePhoneBuilder(
                "500 GB", "2 GB").setBluetoothEnabled(true).build();

    }


}
