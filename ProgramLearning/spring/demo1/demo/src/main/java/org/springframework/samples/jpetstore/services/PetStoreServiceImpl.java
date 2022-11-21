package org.springframework.samples.jpetstore.services;

import java.util.List;

import org.springframework.samples.jpetstore.dao.jpa.JpaAccountDao;
import org.springframework.samples.jpetstore.dao.jpa.JpaItemDao;

public class PetStoreServiceImpl implements PetStoreService{
    private JpaAccountDao accountDao;
    private JpaItemDao itemDao;

    public void setAccountDao(JpaAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setItemDao(JpaItemDao itemDao) {
        this.itemDao = itemDao;
    }

    @Override
    public List<String> getUsernameList() {
        System.out.println("PetStoreServiceImpl...");
        return null;
    }
    
}
