package com.luofc.smss.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.github.pagehelper.PageInfo;
import com.luofc.smss.bean.Article;

/**  
* @Title: pageHelperTest.java
* @Package:com.luofc.smss.test
* @author:luoFc 
* @date:2019年1月25日-下午4:19:20
* @emal:523232622@qq.com
* @Description:(测试分页查询，使用spring测试模块)
*/

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations= {"classpath:applicationContext.xml","file:src/main/webapp/WEB-INF/dispatcherServlet-servlet.xml"})
public class pageHelperTest {
	
	@Autowired
	WebApplicationContext context;
	
	MockMvc mockMvc;
	
	@Before
	public void initMokcMvc() {
		
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}
	
	@Test
	public void testPage() throws Exception {
		
		//模拟web页面请求并拿到返回值
		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/articles").param("page", "1")).andReturn();
		
		//请求成功后，验证取出pageInfo中的数据
		MockHttpServletRequest request = result.getRequest();
		PageInfo attribute = (PageInfo) request.getAttribute("pageInfo");
		
		System.out.println("当前是第"+attribute.getPageNum()+"页");
		
		//获取文章数据
		List<Article> list = attribute.getList();
		for(Article article : list) {
			System.out.println("文章ID："+article.getId()+"文章标题："+article.getTitle());
		}
	}
	
}
