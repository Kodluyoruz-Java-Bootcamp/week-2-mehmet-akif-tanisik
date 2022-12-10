package week2.question3.factorypattern.emlakcepte.service;

import week2.question3.factorypattern.emlakcepte.dao.UserDao;
import week2.question3.factorypattern.emlakcepte.interfaces.IUserService;
import week2.question3.factorypattern.emlakcepte.model.User;

import java.util.List;

public class UserService implements IUserService {
    private UserDao userDao = new UserDao();

    public void createUser(User user) {
        userDao.createUser(user);
    }

    public List<User> getAllUser() {
        return userDao.findAllUsers();
    }

    public void printAllUser() {
        getAllUser().forEach(user -> System.out.println(user.getName()));
    }

}
