package com.example.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dao.AccountDao;
import com.example.Service.AccountService;

@Service
public class AccountImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public void transfer(String outaccount, String inaccount, Double money) {
        accountDao.outmoney(outaccount, money);
        accountDao.inmoney(inaccount, money);
    }

}
