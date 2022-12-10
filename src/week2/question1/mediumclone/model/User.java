package week2.question1.mediumclone.model;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private String password;
    private String email;
    private List<Blog> blogs;
    private List<User> followedUsers;
    private List<User> followerUsers;
    private List<Tag> followedTags;

    public User() {
    }

    public User(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.blogs = new ArrayList<>();
        this.followedUsers = new ArrayList<>();
        this.followerUsers = new ArrayList<>();
        this.followedTags = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }

    public List<User> getFollowedUsers() {
        return followedUsers;
    }

    public void setFollowedUsers(List<User> followedUsers) {
        this.followedUsers = followedUsers;
    }

    public List<User> getFollowerUsers() {
        return followerUsers;
    }

    public void setFollowerUsers(List<User> followerUsers) {
        this.followerUsers = followerUsers;
    }

    public List<Tag> getFollowedTags() {
        return followedTags;
    }

    public void setFollowedTags(List<Tag> followedTags) {
        this.followedTags = followedTags;
    }
}
