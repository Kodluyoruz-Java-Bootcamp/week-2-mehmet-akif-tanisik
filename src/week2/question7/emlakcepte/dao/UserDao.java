package week2.question7.emlakcepte.dao;

import week2.question7.emlakcepte.model.Search;
import week2.question7.emlakcepte.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> userList = new ArrayList<>();

    public void createUser(User user){
        userList.add(user);
    }

    public List<User> finAllUsers(){
        return userList;
    }

    public void saveSearch(Search search, User user){
        user.getSearches().add(search);
    }

}
