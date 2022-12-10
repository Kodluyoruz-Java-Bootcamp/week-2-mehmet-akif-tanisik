package week2.question1.mediumclone.dao;

import week2.question1.mediumclone.model.Blog;
import week2.question1.mediumclone.model.BlogStatus;
import week2.question1.mediumclone.model.Tag;
import week2.question1.mediumclone.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> userList = new ArrayList<>();

    private TagDao tagDao = new TagDao();

    private BlogDao blogDao = new BlogDao();

    public void createUser(User user){
        userList.add(user);
    }

    public List<User> getAllUsers(){
        return userList;
    }

    public void followUser(User user1, User user2){

        if (!userList.contains(user1) || ! userList.contains(user2)){
            System.out.println("This account is not exist!");
        }

        user1.getFollowedUsers().add(user2);
        user2.getFollowerUsers().add(user1);
    }

    public void unfollowUser(User user1, User user2){

        if (!userList.contains(user1) || ! userList.contains(user2)){
            System.out.println("This account is not exist!");
        }

        user1.getFollowedUsers().remove(user2);
        user2.getFollowerUsers().remove(user1);
    }

    public void followTag(User user, Tag tag){
        user.getFollowedTags().add(tag);
    }

    public void unfollowTag(User user, Tag tag){
        user.getFollowedTags().remove(tag);
    }

    public void writeDraft(User user, Blog blog, String input){

        if (input.equalsIgnoreCase("y")){
            blog.setBlogStatus(BlogStatus.PUBLISHED);
        }

        user.getBlogs().add(blog);
    }

    public void deleteBlog(User user, Blog blog){
        user.getBlogs().remove(blog);
    }
}
