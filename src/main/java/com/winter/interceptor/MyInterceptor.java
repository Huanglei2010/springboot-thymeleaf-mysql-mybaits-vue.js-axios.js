package com.winter.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyInterceptor implements HandlerInterceptor {
    Logger logger= LoggerFactory.getLogger(getClass());

    /**
     * 请求正式处理前
     */
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        logger.error("=================preHandle");
        httpServletRequest.setAttribute("starttime",System.currentTimeMillis());
        return true;
    }
    /**
     * 请求处理完成
     */
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        logger.error("=================postHandle");
        long starttime= (long) httpServletRequest.getAttribute("starttime");
        httpServletRequest.removeAttribute("starttime");
        long endtime=System.currentTimeMillis();
        logger.error("=================请求"+httpServletRequest.getRequestURI()+"处理时间"+(endtime-starttime));
    }
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        logger.error("=================afterCompletion");
    }
}
