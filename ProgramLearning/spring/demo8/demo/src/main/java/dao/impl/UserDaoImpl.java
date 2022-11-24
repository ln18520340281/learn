package dao.impl;

import org.springframework.stereotype.Component;

import dao.UserDao;
@Component("userDao")
public class UserDaoImpl implements UserDao{

    @Override
    public void save() {
        System.out.println("UserDaoImpl...");        
    }
    
}
