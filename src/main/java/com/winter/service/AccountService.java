package com.winter.service;

import com.winter.model.Account;
import org.springframework.stereotype.Service;


public interface AccountService {
    public void transfer();
    public void insert(Account account);
}
