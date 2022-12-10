package week2.question3.singleton.emlakcepte.service;

import week2.question3.singleton.emlakcepte.dao.UserDao;
import week2.question3.singleton.emlakcepte.model.User;

import java.util.List;

public class UserService {
    private static UserService userService = null;
    private UserDao userDao = new UserDao();

    public static UserService getInstance(){

        if (userService == null){
            userService = new UserService();
        }
        return userService;
    }

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
