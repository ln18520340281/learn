package service.impl;

import org.springframework.stereotype.Component;

import service.UserService;
@Component("userService")
public class UserServiceImpl implements UserService {

    @Override
    public void save() {
        System.out.println("UserServiceImpl...");
    }

}
