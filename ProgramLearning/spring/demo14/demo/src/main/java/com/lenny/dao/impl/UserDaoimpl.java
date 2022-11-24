package com.lenny.dao.impl;

import org.springframework.stereotype.Repository;

import com.lenny.dao.UserDao;

/**
 * UserDaoimpl
 */
@Repository
public class UserDaoimpl implements UserDao{

	@Override
	public void test() {
		System.out.println("hello");		
	}
   
}