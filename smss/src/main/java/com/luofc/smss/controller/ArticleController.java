package com.luofc.smss.controller;

import java.util.List;

import com.luofc.smss.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.luofc.smss.bean.Article;
import com.luofc.smss.bean.ReturnMsg;
import com.luofc.smss.service.ArticleService;

import javax.servlet.http.HttpSession;

/**  
* @Title: ArticleController.java
* @Package:com.luofc.smss.controller
* @author:luoFc
* @date:2019年1月25日-下午3:13:38
* @emal:523232622@qq.com
* @Description:(操作文章增删改查的控制类)
*/

@Controller
public class ArticleController {

	@Autowired
	ArticleService articleService;

	@Autowired
	HttpSession session;
	
	/**
	 * 	分页查询所有文章方法
	 */
	@RequestMapping(value = "/articles",method = RequestMethod.GET)
	@ResponseBody   //通过该注解，把返回的数据自动转为Json类型
	public ReturnMsg findAllArticle(@RequestParam(value="page",defaultValue="1")Integer page) {

		User user =(User)session.getAttribute("loginUser");
		String name = user.getUsername();
		Integer usermark = user.getUsermark();

		//查询前调用调用PageHelper中的startPage方法
		PageHelper.startPage(page, 5);

		//查询所有文章
		List<Article> articles = articleService.getAllArticle();
				
		//使用pageInfo封装查询后的结果
		PageInfo pages = new PageInfo(articles,5);

		//添加需要的数据后返回给页面
		return ReturnMsg.success().addMsg("username",name)
				.addMsg("usermark",usermark).addMsg("PageInfo", pages);
	}
	
	/* B-S模型返回数据方式
	@RequestMapping("/articles")
	public String findAllArticle(@RequestParam(value="page",defaultValue="1")Integer page,Model model) {
		
		//查询前调用调用PageHelper中的startPage方法
		PageHelper.startPage(page, 10);
		
		List<Article> articles = articleService.getAllArticle();
		
		//使用pageInfo封装查询后的结果
		PageInfo pages = new PageInfo(articles,5);
		
		//把封装后的查询结果添加到model中返回页面
		model.addAttribute("pageInfo", pages);
		return "article-list";
	}*/

    /**
     *  保存文章的方法
     */
    @RequestMapping(value = "/articles",method = RequestMethod.POST)
    @ResponseBody
	public ReturnMsg insetArticle(Article article){
        articleService.insertArticle(article);
        return ReturnMsg.success();
    }


    /**
     *  根据ID删除文章
     */
    @RequestMapping(value = "/articles/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public ReturnMsg deleteArticleById(@PathVariable("id") Integer id){
        articleService.deleteArticleById(id);
	    return ReturnMsg.success();
    }
}
