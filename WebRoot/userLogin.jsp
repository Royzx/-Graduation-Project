<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>用户登录页面</title>
<script src="./resources/js/jquery.min.js"></script>
<script src="./resources/js/bootstrap.min.js"></script>
<link href="./resources/css/bootstrap.min.css" rel="stylesheet" type="text/css">
</head>

<body>
	
	<div class="container">
		<h2>用户登录页面</h2>
		<div class="row clearfix">
			<s:fielderror name="uErrorMsg" />
			<div class="col-md-2 column">
				<form action="user/ulogin.action" method="post">
					<div class="form-group">
						<label for="exampleInputEmail1"> 账户 </label><input
							class="form-control" id="exampleInputEmail1" type="text"
							name="uname" />
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">密码 </label><input
							class="form-control" id="exampleInputPassword1" type="password"
							name="upassword" />
					</div>
					<button type="submit" class="btn btn-default">提交</button>
				</form>
			</div>
		</div>
			<a href="register.jsp">                     注册用户</a>
	        <a href="adminLogin.jsp">                   管理员登录页</a>
	</div>
	
	
	
	
</body>

</html>
