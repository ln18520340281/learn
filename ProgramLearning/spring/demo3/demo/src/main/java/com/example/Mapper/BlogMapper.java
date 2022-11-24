package com.example.Mapper;

import org.apache.ibatis.annotations.Select;

import com.example.POJO.Blog;

public interface BlogMapper {
  @Select("SELECT * FROM blog WHERE id = #{id}")
  Blog selectBlog(int id);
}