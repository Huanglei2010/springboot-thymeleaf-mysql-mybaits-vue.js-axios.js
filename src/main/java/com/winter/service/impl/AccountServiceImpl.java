package com.winter.service.impl;

import com.winter.mapper.AccountMapper;
import com.winter.model.Account;
import com.winter.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
//http://blog.csdn.net/forezp/article/details/70833629
@Service(value = "accountService")
public class AccountServiceImpl implements AccountService{
    @Autowired
    AccountMapper accountMapper;

    @Transactional
    @Override
    public void transfer() {
        accountMapper.update(900,1);//用户1减10块 用户2加10块
        int i=1/0;
        accountMapper.update(1100,2);
    }

    @Override
    public void insert(Account account) {

        accountMapper.insertAccount(account);

    }


}
