package com.example.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface AccountDao {
    @Select("SELECT * FROM account")
    List<AccountDao> selectallAccountDao();

    @Update("UPDATE account SET balance = balance + #{money} where accountusername = #{name}")
    void inmoney(@Param("name") String name, @Param("money") double money);

    @Update("UPDATE account SET balance = balance - #{money} where accountusername = #{name}")
    void outmoney(@Param("name") String name, @Param("money") double money);
}
