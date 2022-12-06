package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.POJO.Account;

@Mapper
public interface AccountDao {
    @Select("SELECT * FROM account")
    List<Account> selectAll();
}
