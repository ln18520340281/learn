package com.example.Service;

import org.springframework.transaction.annotation.Transactional;

public interface AccountService {
    @Transactional
    void transfer(String out, String in, Double money);
}
