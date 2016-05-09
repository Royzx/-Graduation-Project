<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>订单信息</title>
<script src="./resources/js/jquery.min.js"></script>
<script src="./resources/js/bootstrap.min.js"></script>
<link  href="resources/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<script type="text/javascript">

function send(orderNum) {
	 var uname='<c:out value="${uname}"/>'; 
	 if (uname.length == 0) 
	 {
	     alert("您还没有登录！请先登录！");
		 window.location.href="userLogin.jsp";
	 }
	 else
	 {
		 var con = confirm("确认退票吗？");
		 if (con == true) 
		 {
			 window.location.href="userOrder/deleteOrder.action?uname="+uname+"&orderNum="+orderNum;
		 }
	 }
}

</script>
</head>

<h1>您的订单信息</h1>
<body>
		<%-- <table class="table table-striped table-bordered table-hover" align="center">
			<tbody>
				<tr>
					<th>航班号</th>
					<th>起点/目的地</th>
					<th>起飞日期/时间</th>
					<th>操作</th>
				</tr>
				<c:forEach items="${orderList}" var="order" varStatus="status">
					<tr <c:if test="${status.index % 2 != 0}"> class="success" </c:if>
					    <c:if test="${status.index % 2 != 1}"> class="info"    </c:if>>
						<td>${order.flight.fnumber}</td>
						<td>${order.fplacefrom}/${order.fdestination}</td>
						<td><fmt:formatDate value="${order.fdeparturedate}" pattern="MM/dd" />&nbsp;
						    <fmt:formatDate value="${order.fdeparturetime}" pattern="HH:mm" /></td>
						<td><a href="javascript:void(0);" onclick="send('${flight.fnumber}')">退票</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table> --%>
		
		<div class="collapse navbar-collapse navbar-responsive-collapse navbar-left">
						<ul class="nav navbar-nav">
							<li>
								<form class="navbar-form navbar-left" role="search">
				            		<div class="input-group">
										<input type="text" class="form-control" placeholder="Search">
										<span class="input-group-btn">
											<button class="btn btn-default" type="button">Go!</button>
										</span>
									</div>
								</form>
							</li>
					  		<li class="active"><a href="List.jsp">首页</a></li>
					        <li class="dropdown">
					           <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown">${uname}<b class="caret"></b></a>
					           <ul class="dropdown-menu">
									<li><a href="javascript:;">设置</a></li>
									<li><a href="user/ulogout.action">退出登录</a></li>
					           </ul>
					        </li>
					        <c:if test="${uname == null}">
					           <li><a href="userLogin.jsp" >登录</a></li>
					  		   <li><a href="register.jsp"  >注册</a></li>
					        </c:if>
					 	</ul>
					</div>
		<div class="col-md-9 column" >
					<table class="table table-hover">
						<thead>
							<tr>
								<th>航班号</th>
								<th>起点/目的地</th>
								<th>起飞日期/时间</th>
								<th>操作</th>
							</tr>
						</thead>
						 <tbody>
						    <c:forEach items="${session.orderList}" var="order" varStatus="status">
								<tr>
									<td>${order.flight.fnumber}</td>
									<td>${order.fplacefrom}/${order.fdestination}</td>
									<td><fmt:formatDate value="${order.fdeparturedate}" pattern="MM/dd" />&nbsp;
								    <fmt:formatDate value="${order.fdeparturetime}" pattern="HH:mm" /></td>
									<td><a href="javascript:void(0);" onclick="send('${order.orderNum}')">退票</a></td>
								</tr>
						</c:forEach>
						</tbody>
					</table>
				</div>
</body>
</html>
