package week2.question1.mediumclone.service;

import week2.question1.mediumclone.dao.UserDao;
import week2.question1.mediumclone.model.Blog;
import week2.question1.mediumclone.model.Tag;
import week2.question1.mediumclone.model.User;

import java.util.List;
import java.util.Scanner;

public class UserService {

    private UserDao userDao = new UserDao();

    private static final Scanner KEYBOARD = new Scanner(System.in);

    public void createUser(User user){

        userDao.createUser(user);
    }

    public List<User> getAll(){
        return userDao.getAllUsers();
    }

    public void printBlogByUser(User user){
        userDao.getAllUsers().stream()
                .filter(usr -> usr.getName().equalsIgnoreCase(user.getName()))
                .forEach(user1 -> user1.getBlogs().forEach(blog -> System.out.println(blog.getTitle() + " " + blog.getBlogStatus())));
    }

    public void writeDraftBlog(User user, Blog blog){
        String input;

        do {
            System.out.println("Do you want to publish your blog? (y/n)");
            input = KEYBOARD.nextLine();
            if (input.equalsIgnoreCase("y")){
                userDao.writeDraft(user,blog,input);
            } else {
                System.out.println("Blog has not been published.");
            }
        } while (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("n"));
    }

    public void deleteBlog(User user, Blog blog){
        userDao.deleteBlog(user,blog);
    }

    public void followUser(User user1, User user2){
        userDao.followUser(user1,user2);
    }

    public void unfollowUser(User user1, User user2){
        userDao.unfollowUser(user1,user2);
    }

    public void followTag(User user, Tag tag){
        userDao.followTag(user, tag);
    }

    public void printFollowedUsers(User user){
        user.getFollowedUsers().forEach(user1 -> System.out.println(user1.getName()));
    }
}
