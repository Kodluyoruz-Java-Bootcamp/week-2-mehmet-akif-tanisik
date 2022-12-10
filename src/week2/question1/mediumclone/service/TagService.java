package week2.question1.mediumclone.service;

import week2.question1.mediumclone.dao.TagDao;
import week2.question1.mediumclone.model.Tag;

import java.util.List;

public class TagService {

    private TagDao tagDao = new TagDao();


    public void createTag(Tag tag){
        tagDao.createTag(tag);
    }

    public void removeTag(Tag tag){
        tagDao.removeTag(tag);
    }

    public List<Tag> getAll(){
        return tagDao.getAll();
    }

    public void printAllTags(){
        getAll().forEach(tag -> System.out.println(tag.getName()));
    }

    public void printBlogTitleByTag(Tag tag){
        getAll().forEach(tag1 -> tag1.getBlogs().stream().filter(blog -> blog.getTag().getName().equals(tag.getName()))
                .forEach(blog1 -> System.out.println(blog1.getTitle())));
    }
}
