package com.example.POJO;

public class Blog {
    public int id;
    public String blogname;
    @Override
    public String toString() {
        return "Blog [id=" + id + ", blogname=" + blogname + "]";
    }
    public int getId() {
        return id;
    }
    public String getBlogname() {
        return blogname;
    }
}
