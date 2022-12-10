package week2.question3.singleton.emlakcepte.dao;

import week2.question3.singleton.emlakcepte.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private static List<User> userList = new ArrayList<>();

    public void createUser(User user) {
        userList.add(user);
    }

    public List<User> findAllUsers() {
        return userList;
    }

}
