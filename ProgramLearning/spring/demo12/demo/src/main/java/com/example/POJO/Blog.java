package com.example.POJO;

public class Blog {
    public int id;
    public String blogname;
    public int getId() {
        return id;
    }
    public String getBlogname() {
        return blogname;
    }
    @Override
    public String toString() {
        return "Blog [id=" + id + ", blogname=" + blogname + "]";
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setBlogname(String blogname) {
        this.blogname = blogname;
    }
}
