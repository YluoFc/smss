package com.luofc.smss.bean;

import java.util.HashMap;
import java.util.Map;

/**  
* @Title: ReturnMsg.java
* @Package:com.luofc.smss.bean
* @author:luoFc 
* @date:2019年2月1日-下午12:30:33
* @emal:523232622@qq.com
* @Description:(带处理状态的通用的返回类)
*/
public class ReturnMsg {

	//返回状态码
	private int code;
	
	//返回提示信息
	private String msg;
	
	//返回的数据（放在map中）
	private Map<String,Object> jsonData =new HashMap<String,Object>();
	
	//处理成功
	public static ReturnMsg success() {
		ReturnMsg result = new ReturnMsg();
		result.setCode(100);
		result.setMsg("处理成功！");
		return result;
	}
	
	//处理失败
	public static ReturnMsg faild() {
		ReturnMsg result = new ReturnMsg();
		result.setCode(200);
		result.setMsg("处理失败！");
		return result;
	}

	//用户可添加数据的链式操作方法
	public ReturnMsg addMsg(String key, Object value) {
		
		this.getJsonData().put(key, value);
		return this;
		
	}
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Map<String, Object> getJsonData() {
		return jsonData;
	}

	public void setJsonData(Map<String, Object> jsonData) {
		this.jsonData = jsonData;
	}

	
}
