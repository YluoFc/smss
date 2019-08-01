package com.luofc.smss.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**  
* @Title: loginInterceptor.java
* @Package:com.luofc.smss.utils
* @author:luoFc 
* @date:2019年1月26日-下午5:50:58
* @emal:523232622@qq.com
* @Description:(用于拦截非登陆用户跳转)
*/
public class loginInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		HttpSession session = request.getSession(true);
        // 获取session中用户名信息用于验证
        Object obj = session.getAttribute("loginUser");
        if (obj == null || "".equals(obj.toString())) {
            response.sendRedirect(request.getSession().getServletContext().getContextPath());
            return false;
        }
        return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		

	}

}
