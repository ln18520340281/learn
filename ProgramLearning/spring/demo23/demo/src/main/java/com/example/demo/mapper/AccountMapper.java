package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.POJO.Account;

// @Mapper
public interface AccountMapper extends BaseMapper<Account> {
    // @Select("SELECT * FROM account")
    // List<Account> selectAll();
}