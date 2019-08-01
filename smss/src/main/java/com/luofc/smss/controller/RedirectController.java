package com.luofc.smss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author:luoFc
 * @date:2019/3/3-12:06
 * @emal:523232622@qq.com
 * @Description:(控制页面跳转的方法)
 */

@Controller
public class RedirectController {

    @RequestMapping("/redirect/{page}")
    public String jumpPage(@PathVariable("page") Integer page){

        if (page == 1){
            return "article-list";
        }
        if (page == 8){
            return "user-list";
        }
        return "article-list";
    }
}
