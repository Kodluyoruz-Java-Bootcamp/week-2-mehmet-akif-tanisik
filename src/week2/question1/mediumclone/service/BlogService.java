package week2.question1.mediumclone.service;

import week2.question1.mediumclone.dao.BlogDao;
import week2.question1.mediumclone.model.Blog;
import week2.question1.mediumclone.model.BlogStatus;
import week2.question1.mediumclone.model.Tag;

import java.util.List;

public class BlogService {
    private BlogDao blogDao = new BlogDao();

    public void createBlog(Blog blog){
        blogDao.createBlog(blog);
    }

    public void removeBlog(Blog blog){
        blogDao.removeBlog(blog);
    }

    public List<Blog> getAll(){
        return blogDao.getAll();
    }

    public void printAllBlogs(){
        blogDao.getAll().forEach(blog -> System.out.println(blog.getTitle() + " " + blog.getBlogStatus()));
    }

    public void addBlogToTag(Blog blog, Tag tag){
        blogDao.addBlogToTag(blog, tag);
    }

    public void removeBlogFromTag(Blog blog, Tag tag){
        blogDao.removeBlogFromTag(blog, tag);
    }

    public void publishBlog(Blog blog){
        blogDao.setBlogStatus(blog, BlogStatus.PUBLISHED);
    }

    public void deleteBlog(Blog blog){
        blogDao.setBlogStatus(blog, BlogStatus.DELETED);
    }

    public void draftBlog(Blog blog){
        blogDao.setBlogStatus(blog, BlogStatus.DRAFT);
    }
}
