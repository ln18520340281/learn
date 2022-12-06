package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.POJO.Account;
import com.example.demo.dao.AccountDao;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private AccountDao accountdDao;

	@Test
	void contextLoads() {
		List<Account> selectAll = accountdDao.selectAll();
		System.out.println(selectAll);
	}

}
