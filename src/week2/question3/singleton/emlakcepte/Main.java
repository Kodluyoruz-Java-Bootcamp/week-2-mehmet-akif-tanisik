package week2.question3.singleton.emlakcepte;

import week2.question3.singleton.emlakcepte.service.RealtyService;
import week2.question3.singleton.emlakcepte.service.UserService;

public class Main {


    public static void main(String[] args) {

        UserService userService = UserService.getInstance();
        UserService userService1 = UserService.getInstance();

        RealtyService realtyService = RealtyService.getInstance();
        RealtyService realtyService1 = RealtyService.getInstance();


        if (userService == userService1){
            System.out.println("userService and userService1 are same object.");
        } else {
            System.out.println("userService and userService1 are not same object.");
        }

        if (realtyService == realtyService1){
            System.out.println("realtyService and realtyService1 are same object.");
        } else {
            System.out.println("realtyService and realtyService1 are not same object.");
        }
    }
}
