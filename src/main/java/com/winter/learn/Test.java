package com.winter.learn;

import org.springframework.stereotype.Component;
//      http://blog.csdn.net/cb2474600377/article/details/53740312
@Component
public class Test {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String test(String str){
        System.out.println("000000000000"+str);
        return "test1"+str+"name="+name;
    }
}
