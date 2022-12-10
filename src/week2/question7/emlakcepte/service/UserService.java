package week2.question7.emlakcepte.service;

import week2.question7.emlakcepte.dao.UserDao;
import week2.question7.emlakcepte.model.Search;
import week2.question7.emlakcepte.model.User;

import java.util.List;

public class UserService {

    private UserDao userDao = new UserDao();

    public void createUser(User user){
        userDao.createUser(user);
    }

    public List<User> getAllUser(){
        return userDao.finAllUsers();
    }

    public void printAllUsers(){
        getAllUser().forEach(user -> System.out.println(user.getName() +" " +user.getEmail()));
    }

    public void saveSearch(Search search, User user){
        userDao.saveSearch(search,user);
    }
}
