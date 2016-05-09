<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'success.jsp' starting page</title>
    <script src="./resources/js/jquery.min.js"></script>
	<script src="./resources/js/bootstrap.min.js"></script>
	<link  href="./resources/css/bootstrap.min.css" rel="stylesheet" type="text/css">
	<style type="text/css">
	.carousel-inner > .item {
		height:450px;
	}
	.carousel-inner > .item > img {
		width:100%;
	}
</style>

  </head>
  <body>
    <h2>管理员管理</h2>

<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="row">
				<div class="col-md-4">
					<div class="thumbnail">
						<img alt="300x200" src="<%=basePath%>resources/images/admin3.jpg" />
						<div class="caption">
							<h3>
								用户管理
							</h3>
							<p>
							</p>
							<p>
								 <a class="btn btn-primary" href="admin/userMng">管理</a> 
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="thumbnail">
						<img alt="300x200" src="<%=basePath%>resources/images/admin1.jpg" />
						<div class="caption">
							<h3>
								售票员管理
							</h3>
							<p>
							</p>
							<p>
								 <a class="btn btn-primary" href="admin/conductorMng">管理</a> 
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="thumbnail">
						<img alt="300x200" src="<%=basePath%>resources/images/admin2.jpg" />
						<div class="caption">
							<h3>
								航班管理
							</h3>
							<p>
							</p>
							<p>
								 <a class="btn btn-primary" href="admin/flightMng">管理</a> 
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

  </body>
</html>
