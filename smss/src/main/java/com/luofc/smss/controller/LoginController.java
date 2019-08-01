package com.luofc.smss.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.luofc.smss.bean.User;
import com.luofc.smss.service.UserService;

/**  
* @Title: LoginController.java
* @Package:com.luofc.smss.controller
* @author:luoFc 
* @date:2019年1月26日-下午2:35:22
* @emal:523232622@qq.com
* @Description:(用于登陆的控制类)
*/

@Controller
public class LoginController {

	@Autowired
	UserService userservice;
	
	@Autowired
	HttpSession session;
	
	@RequestMapping("/login")
	public String findByUsername(@RequestParam("username") String username,@RequestParam("password") String password) {
				
		User user =  userservice.findByUserName(username);
		
		if(user==null) {			
			return "redirect:/index.jsp";			
		}else {
			if(!password.equals(user.getUserpwd())) {
				return "redirect:/index.jsp";
			}
			//把登陆用户写入session，提供给拦截器验证
            session.setAttribute("loginUser",user);
		}
		
		return "article-list";
		
	}
	
}
