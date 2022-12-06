package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.POJO.Account;
import com.example.demo.mapper.AccountMapper;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private AccountMapper accountdMapper;

	@Test
	void contextLoads() {
		List<Account> selectAll = accountdMapper.selectList(null);
		System.out.println(selectAll);
	}

}
