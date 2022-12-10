package week2.question3.factorypattern.emlakcepte.factory;

import week2.question3.factorypattern.emlakcepte.interfaces.IUserService;
import week2.question3.factorypattern.emlakcepte.service.UserService;

public class UserServiceFactory {

    public IUserService getIUserService(String userServiceType){

        if (userServiceType == null){
            return null;
        }

        if (userServiceType.equalsIgnoreCase("USERSERVICE")){
            return new UserService();
        }
        return null;
    }
}
