package com.mengxuegu.springbootbill.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Logininterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object loginuser = request.getSession().getAttribute("loginuser");
        if (loginuser != null) {
            return true;
        } else {
            request.setAttribute("msg", "没有登陆 请先登陆");
            request.getRequestDispatcher("/index").forward(request, response);
            return false;
        }
    }
}
