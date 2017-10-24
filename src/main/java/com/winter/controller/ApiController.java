package com.winter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ApiController {
    @RequestMapping("api")
    public String api(){
        return "测试拦截器的方法";
    }
}
