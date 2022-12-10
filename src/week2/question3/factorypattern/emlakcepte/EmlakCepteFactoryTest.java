package week2.question3.factorypattern.emlakcepte;

import week2.question3.factorypattern.emlakcepte.factory.RealtyServiceFactory;
import week2.question3.factorypattern.emlakcepte.factory.UserServiceFactory;
import week2.question3.factorypattern.emlakcepte.interfaces.IRealtyService;
import week2.question3.factorypattern.emlakcepte.interfaces.IUserService;
import week2.question3.factorypattern.emlakcepte.model.Realty;
import week2.question3.factorypattern.emlakcepte.model.User;

public class EmlakCepteFactoryTest {


    public static void main(String[] args) {

        RealtyServiceFactory realtyServiceFactory = new RealtyServiceFactory();
        IRealtyService realtyService = realtyServiceFactory.getIRealtyService("REALTYSERVICE");

        UserServiceFactory userServiceFactory = new UserServiceFactory();
        IUserService userService = userServiceFactory.getIUserService("USERSERVICE");


        Realty realty1 = new Realty();
        User user1= new User();

        realtyService.createRealty(realty1);
        userService.createUser(user1);

        userService.getAllUser();
        realtyService.getAll();
    }
}
