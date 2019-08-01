<%@ page language="java" contentType="text/html" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//ZH-CN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登陆系统</title>
    
	<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
	
	<!-- Bootstrap核心文件 -->
    <link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <!-- 引入样式文件 -->
    <link href="https://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link href="static/css/style.css" rel="stylesheet" >
    <!-- jquery -->
    <script type="text/javascript" src="static/js/jquery-1.12.4.min.js"></script>
  </head>
  
  <body>
    <div class="container">
        <div class="form row">
            <div class="form-horizontal col-md-offset-3" id="login_form">
                <h3 class="form-title">登陆</h3>
                <form action="login" id="userLoginForm" method="post">
	                <div class="col-md-9">
	                    <div class="form-group">
	                        <i class="fa fa-user fa-lg"></i>
	                        <input class="form-control required" type="text" placeholder="Username" id="username" name="username" autofocus="autofocus" maxlength="20"/>
	                    </div>
	                    <div class="form-group">
	                            <i class="fa fa-lock fa-lg"></i>
	                            <input class="form-control required" type="password" placeholder="Password" id="password" name="password" maxlength="8"/>
	                    </div>
	                    <!-- <div class="form-group">
	                        <label class="checkbox">
	                            <input type="checkbox" name="remember" value="1"/>记住我
	                        </label>
	                    </div> -->
	                    <div class="form-group col-md-offset-9">
	                        <button type="submit" class="btn btn-success pull-right" name="submit">登录</button>
	                    </div>
	                </div>
            	</form>
            </div>
        </div>
    </div>
  </body>
</html>
