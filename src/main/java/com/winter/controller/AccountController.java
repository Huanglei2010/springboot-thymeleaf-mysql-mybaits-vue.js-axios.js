package com.winter.controller;

import com.winter.model.Account;
import com.winter.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("one1")
    public String one(){
        return "account/one1";
    }
    @ResponseBody
    @RequestMapping("transfer")
    public String transfer(){
        accountService.transfer();
        return "ok";
    }
    @ResponseBody
    @PostMapping("insert")
    public String insert(@RequestBody Account account){
        System.out.println(account.getName()+""+account.getMoney());
        accountService.insert(account);
        return "ok";
    }
}
