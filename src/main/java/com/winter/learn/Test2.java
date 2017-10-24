package com.winter.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//      http://blog.csdn.net/cb2474600377/article/details/53740312
@Component
public class Test2 {
    @Autowired
    private Test test;

    public String test(String str){
        test.setName(str);
        return "test2"+test.test(str);
    }
}
