<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>注册</title>
<script src="./resources/js/jquery.min.js"></script>
<script src="./resources/js/bootstrap.min.js"></script>
<link href="./resources/css/bootstrap.min.css" rel="stylesheet"
	type="text/css">
</head>

<div class="container">
	<h2>用户注册页面</h2>
	<div class="row clearfix">
		<s:fielderror fieldName="urnErrorMsg" />
		<s:fielderror fieldName="urpErrorMsg" />
		<s:fielderror fieldName="urnExistErrorMsg" />
		<s:fielderror fieldName="urRealNameErrorMeg" />
		<div class="col-md-2 column">
			<form action="user/uregister.action" method="post">
				<div class="form-group">
					<label for="exampleInputEmail1"> 用户名 </label><input
						class="form-control" id="exampleInputEmail1" type="text"
						name="uname" />
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1"> 真实姓名 </label><input
						class="form-control" id="exampleInputEmail1" type="text"
						name="urealname" />
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">密码 </label><input
						class="form-control" id="exampleInputPassword1" type="password"
						name="upassword" />
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">确认密码 </label><input
						class="form-control" id="exampleInputPassword1" type="password"
						name="upassword1" />
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1"> 邮箱 </label><input
						class="form-control" id="exampleInputEmail1" type="text"
						name="uemail" />
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1"> 手机号 </label><input
						class="form-control" id="exampleInputEmail1" type="text"
						name="uphone" />
				</div>
				<button type="submit" class="btn btn-default">提交</button>
			</form>
		</div>
	</div>
	<a href="userLogin.jsp">返回登录页</a> <a href="List.jsp">返回首页</a>
</div>
</body>
</html>
