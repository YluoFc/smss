package com.luofc.smss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author:luoFc
 * @date:2019/3/3-11:09
 * @emal:523232622@qq.com
 * @Description:(控制登出的类)
 */

@Controller
public class LoginOutController {

    @Autowired
    HttpSession session;

    @RequestMapping("/loginout")
    public String loginOut(){
        Object sessionUser = session.getAttribute("loginUser");

        if (sessionUser != null){
            session.removeAttribute("loginUser");
        }
        return "redirect:/index.jsp";
    }
}
