package week2.question1.mediumclone.dao;

import week2.question1.mediumclone.model.Tag;

import java.util.ArrayList;
import java.util.List;

public class TagDao {

    private static List<Tag> tagList = new ArrayList<>();

    public void createTag(Tag tag){
        tag.getBlogs().forEach(blog -> blog.setTag(tag));
        tagList.add(tag);
    }

    public List<Tag> getAll(){
        return tagList;
    }

    public void removeTag(Tag tag){
        tagList.remove(tag);
        tag.getBlogs().forEach(blog -> blog.setTag(null));
    }
}
