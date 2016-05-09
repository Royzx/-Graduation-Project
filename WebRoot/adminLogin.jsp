<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'adminLogin.jsp' starting page</title>
	    <script src="./resources/js/jquery.min.js"></script>
		<script src="./resources/js/bootstrap.min.js"></script>
		<link href="./resources/css/bootstrap.min.css" rel="stylesheet" type="text/css">
  </head>
  <body>

     <div class="container">
		<h2>管理员登录</h2>
		<div class="row clearfix">
			<s:fielderror name="uErrorMsg" />
			<div class="col-md-2 column">
				<form action="admin/alogin.action" method="post">
					<div class="form-group">
						<label for="exampleInputEmail1"> 账户 </label><input
							class="form-control" id="exampleInputEmail1" type="text"
							name="aname" />
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">密码 </label><input
							class="form-control" id="exampleInputPassword1" type="password"
							name="apassword" />
					</div>
					<button type="submit" class="btn btn-default">提交</button>
				</form>
			</div>
		</div>
		 <a href="userLogin.jsp">转到用户登录页</a>
	</div>
	
	
  </body>
</html>
