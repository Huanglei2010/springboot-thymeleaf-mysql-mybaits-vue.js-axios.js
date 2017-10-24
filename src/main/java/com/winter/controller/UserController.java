package com.winter.controller;

import com.winter.model.User;
import com.winter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("one")
    public String one(){

       return "user/one";
    }
    @RequestMapping("one1")
    public String one1(){

       return "user/one1";
    }
    @ResponseBody
    @PostMapping("/add")
    public int addUser(@RequestBody User user){

        return userService.addUser(user);
    }
    @ResponseBody
    @RequestMapping("/findall")
   public List<User> findAll(){
        return  userService.selectAllUser();
   }


    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){

        return userService.findAllUser(pageNum,pageSize);
    }
}

//produces可能不算一个注解，因为什么呢，它是注解@requestMapping注解里面的属性项，-------
//它的作用是指定返回值类型，不但可以设置返回值类型还可以设定返回值的字符编码；-----------