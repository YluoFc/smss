<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//ZH-CN">
<html>
  <head>
	<base href="<%=basePath%>">
    
    <title>文章列表</title>
    
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8">
    
	<!-- Bootstrap核心文件 -->
    <link href="/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <!-- jquery -->
    <script type="text/javascript" src="/static/js/jquery-1.12.4.min.js"></script>
    
    <script type="text/javascript" src="/static/js/article-list.js"></script>

  </head>
  
  <body>
    <div class="container">
    	<!-- 标题行 -->
    	<div class="row">
    		<div class="col-md-12">
    			<h1>文章列表</h1>
    		</div>
    	</div>
    	<!-- 按钮行 -->
    	<div class="row">
    		<div class="col-md-4 col-md-offset-10">
    			<button class="btn btn-primary">新增</button>
    			<button class="btn btn-danger">删除</button>
    		</div>
    	</div>
    	<!-- 表格数据 -->
    	<div class="row">
    		<div class="col-md-12">
    			<table class="table table-hover" id="article_table">
    				<thead>
	    				<tr>
	    					<th>编号</th>
	    					<th>栏目</th>
	    					<th>属性</th>
	    					<th>标题</th>	    					
	    					<!-- <th>描述</th> -->
	    					<th>图片</th>
	    					<th>发布时间</th>
	    					<th>关键字</th>
	    					<th>摘要</th>
	    					<th>作者</th>
	    					<!-- <th>内容</th> -->
	    					<th>操作</th>
	    				</tr>
    				</thead>
    				<tbody>
	    				
    				</tbody>
    			</table>
    		</div>
    	</div>
    	<!-- 分页 -->
    	<div class="row">
    		<!-- 分页文字 -->
    		<div class="col-md-6" id="page_info">
    		</div>
    		<!-- 分页条-->
    		<div class="col-md-6 col-md-offset-8" id="page_nav">    			
    		</div>
    	</div>
    </div>
    
    <script type="text/javascript">
    	$(function(){
    		toPage(1);
    	});
    	    	
    </script>
  </body>
</html>
