package com.luofc.smss.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.luofc.smss.bean.User;
import com.luofc.smss.dao.ArticleMapper;
import com.luofc.smss.dao.UserMapper;


/**  
* @Title: MapperTest.java
* @Package:com.luofc.smss.test
* @author:luoFc 
* @date:2019年1月24日-上午11:17:19
* @emal:523232622@qq.com
* @Description:(测试Dao层)
*/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class MapperTest {
	
	@Autowired
	ArticleMapper articleMapper;
	
	@Autowired
	UserMapper userMapper;
	
	@Test
	public void testCRUD() {
/*		//1、创建SpringIoc容器
		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2、从容器中获取mapper
		ArticleMapper bean = ioc.getBean(ArticleMapper.class);*/
		
		//System.out.println(articleMapper);
		//userMapper.insertSelective(new User(null,"dajuanzi","1234",1));
		//userMapper.deleteByPrimaryKey(3);
		User user = userMapper.selectByPrimaryKey(1);
		System.out.println(user);
	}
}
