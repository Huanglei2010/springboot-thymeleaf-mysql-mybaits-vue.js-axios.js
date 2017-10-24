package com.winter.controller;

import com.winter.learn.Test;
import com.winter.learn.Test2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//      http://blog.csdn.net/cb2474600377/article/details/53740312
@Controller
public class TestController {

    @Autowired
    private Test test;
    @Autowired
    private Test2 test2;

    //   http://localhost:8080/test?str=aaa
    @RequestMapping("/test")
    @ResponseBody
    public String test(String str){
        System.out.println(test2.test(str));
        return test.test(str);
    }
    @Value("${person.age}")
    private Integer age;
    @GetMapping(value = "hello2")
    public String getHello(){
        return "hello world "+age;
    }

    @Value("${name}")
    private String name;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(){
        return name;
    }
    @RequestMapping("/pathVariable/{name}")
    public String pathVariable(@PathVariable("name")String name){
        System.out.println("hello "+name);
        return "helloworld";
    }
}
