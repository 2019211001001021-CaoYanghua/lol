package com.assys.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class loginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {//执行控制器之前
        //1.获取请求url
        if(request.getRequestURI().contains("login") || request.getRequestURI().contains("register"))return true;
        HttpSession session = request.getSession();
        Object user = session.getAttribute("user");
//        if(ObjectUtils.isEmpty(user)){
//            response.sendRedirect(request.getServletContext().getContextPath()+"/pages/login.html");
//            return true;
//        }
        return true;

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("控制器执行完毕");
    }

    @Override//视图渲染完运行
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("结束");
    }
}
