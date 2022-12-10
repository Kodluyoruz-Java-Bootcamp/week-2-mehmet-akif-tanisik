package week2.question1.mediumclone.model;

import java.util.List;

public class Tag {

    private String name;
    private List<Blog> blogs;

    public Tag(){

    }

    public Tag(String name, List<Blog> blogs) {
        this.name = name;
        this.blogs = blogs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }
}
