package com.example.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dao.BlogMapper;
import com.example.POJO.Blog;
import com.example.Service.SelectService;

@Service
public class Serviceimpl implements SelectService{
    @Autowired
	private BlogMapper blogMapper;
    @Override
    public Blog selectblog(Integer id) {
        return blogMapper.selectBlog(id);
    }
    
}
