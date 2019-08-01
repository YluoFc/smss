package com.luofc.smss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luofc.smss.bean.Article;
import com.luofc.smss.dao.ArticleMapper;

/**  
* @Title: ArticleService.java
* @Package:com.luofc.smss.service
* @author:luoFc 
* @date:2019年1月25日-下午3:18:05
* @emal:523232622@qq.com
* @Description:(网站文章的业务层)
*/

@Service
public class ArticleService {
	
    @Autowired
	ArticleMapper articleMapper;

	//查询所有文章
	public List<Article> getAllArticle() {
		return articleMapper.selectByExample(null);
	}

	//保存文章
	public void insertArticle(Article article) {
		articleMapper.insertSelective(article);
	}

	//通过ID删除一篇文章
	public void deleteArticleById(Integer id) {
		articleMapper.deleteByPrimaryKey(id);
	}
}
