package com.winter.adapter;

import com.winter.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Configuration
public class AddInterceptor extends WebMvcConfigurerAdapter{
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //addPattern(“/api/**”) 用来指定要拦截的请求路径
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/api/***");
    }
}
