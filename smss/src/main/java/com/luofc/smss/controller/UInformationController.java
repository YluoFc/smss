package com.luofc.smss.controller;

import com.luofc.smss.bean.ReturnMsg;
import com.luofc.smss.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author:luoFc
 * @date:2019/7/31-22:15
 * @emal:523232622@qq.com
 * @Description:()
 */

@Controller
public class UInformationController {

    @Autowired
    HttpSession session;

    @RequestMapping(value = "/uinformation",method = RequestMethod.GET)
    @ResponseBody
    public ReturnMsg userInformation(){

        User user =(User)session.getAttribute("loginUser");
        String name = user.getUsername();
        Integer usermark = user.getUsermark();

        return ReturnMsg.success().addMsg("username",name)
                .addMsg("usermark",usermark);
    }
}
