package week2.question3.factorypattern.emlakcepte.interfaces;

import week2.question3.factorypattern.emlakcepte.model.User;

import java.util.List;

public interface IUserService {
    void createUser(User user);

    List<User> getAllUser();

    void printAllUser();
}
