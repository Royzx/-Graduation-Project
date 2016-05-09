<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=9; IE=8; IE=7; IE=EDGE" />

<title>机票查询页面</title>
<script src="./resources/js/jquery.min.js"></script>
<script src="./resources/js/bootstrap.min.js"></script>
<link  href="resources/css/bootstrap.min.css" rel="stylesheet" type="text/css">

</head>
<body style="background: #e1e9eb;">
     <h3>航班后台管理</h3>
	 <div class="container">
					<div class="collapse navbar-collapse navbar-responsive-collapse navbar-right">
						<ul class="nav navbar-nav">
							<li>
								<form class="navbar-form navbar-left" role="search">
								</form>
							</li>
					  		<li class="active"><a href="List.jsp">首页</a></li>
					  		<li class="active"><a href="flight/jumpAdd.action">添加航班</a></li>
					        <li class="dropdown">
					           <c:if test="${aname == null}">
					              	<li><a href="javascript:;">未登录</a></li>
					           </c:if>
					           <c:if test="${aname != null}">
					           	   <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown">${aname}<b class="caret"></b></a>
						           <ul class="dropdown-menu">
										<li><a href="javascript:;">设置</a></li>
										<li><a href="user/ulogout.action">退出登录</a></li>
						           </ul>
					           </c:if>
					        </li>
					        <c:if test="${aname == null}">
					           <li><a href="userLogin.jsp" >登录</a></li>
					  		   <li><a href="register.jsp"  >注册</a></li>
					        </c:if>
					        
					 	</ul>
					</div>
				</div>
			
	<div class="row clearfix" style="margin-top: 50px">
				<div class="col-md-9 column">
				<s:fielderror fieldName="FlightIsUsed" />
					<table class="table table-hover">
						<thead>
							<tr>
								<th>航班号</th>
								<th>起点/目的地</th>
								<th>起飞日期/时间</th>
								<th>降落时间</th>
								<th>机票价格</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
						    <c:forEach items="${flightList}" var="flight">
								<tr>
									<td>${flight.fnumber}&nbsp;${flight.fcompany}</td>
									<td>${flight.fplacefrom}/${flight.fdestination}</td>
									<td><fmt:formatDate value="${flight.fdeparturedate}" pattern="MM/dd" />&nbsp;<fmt:formatDate value="${flight.fdeparturetime}" pattern="HH:mm" /> </td>
									<td><fmt:formatDate value="${flight.ffalltime}" pattern="HH:mm" /> </td>
									<td>${flight.fprice}</td>
									<td><a href="flight/jumpUpdate.action?fnumber=${flight.fnumber}">修改</a>/<a href="flight/deleteflight.action?fnumber=${flight.fnumber}" onclick="javascript:return confirm('确认删除吗？');">删除</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				<div class="col-md-3 column">
					<div class="col-md-12 column">
						<form action="flight/aqueryflight.action" method="post" >
							<div class="form-group">
								 <label for="from">起始地：</label>
								 <input type="text" class="form-control" id="from"  name="fplacefrom" value="${fplacefrom}"/>
							</div>
							<div class="form-group">
								 <label for="to">目的地：</label>
								 <input type="text" class="form-control" id="to" name="fdestination" value="${fdestination}"/>
							</div>
							<div class="form-group">
								 <label for="date">日期：</label>
								 <input type="date" class="form-control" id="date" name="fdeparturedate" value="${fdeparturedate}" />
							</div>
						 <button type="submit" class="btn btn-default btn-block btn-success">查询</button>
						</form>
					</div>
				</div>
			</div>
		
	
	
</body>
</html>