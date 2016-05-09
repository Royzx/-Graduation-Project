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
<META HTTP-EQUIV="pragma" CONTENT="no-cache">
<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache, must-revalidate">
<META HTTP-EQUIV="expires" CONTENT="Wed, 26 Feb 1997 08:21:57 GMT"> 

<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=9; IE=8; IE=7; IE=EDGE" />

<title>机票查询页面</title>
<script src="./resources/js/jquery.min.js"></script>
<script src="./resources/js/bootstrap.min.js"></script>
<link  href="resources/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<style type="text/css">
	.carousel-inner > .item {
		height:400px;
	}
	.carousel-inner > .item > img {
		width:100%;
	}
</style>
<script type="text/javascript">

function send(fnumber) {
	 var uname='<c:out value="${uname}"/>'; 
	 if (uname.length == 0) 
	 {
	     alert("您还没有登录！请先登录！");
		 window.location.href="userLogin.jsp";
	 }
	 else
	 {
		 var con = confirm("确认购票吗？");
		 if (con == true) {
			 window.location.href="userOrder/saveOrder.action?fnumber="+fnumber;
		}
	 }
}

</script>
</head>

<body>
	<div class="container" style="margin-top: 100px">
		<div class="row clearfix">
			<div class="navbar navbar-default navbar-fixed-top" role="navigation">
				<div class="container">
					<div class="navbar-header">
						<button class="navbar-toggle" type="button" data-toggle="collapse" data-target=".navbar-responsive-collapse">
							<span class="sr-only">Toggle Navigation</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
						<a href="javascript:;" class="navbar-brand">机票预订查询系统</a>
					</div>
					<div class="collapse navbar-collapse navbar-responsive-collapse navbar-right">
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
					        <c:if test="${uname != null}">
						        <li class="dropdown">
						           <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown">${uname}<b class="caret"></b></a>
						           <ul class="dropdown-menu">
										<li><a href="userOrder/getOrderList.action">订单信息</a></li>
										<li><a href="user/ulogout.action">退出登录</a></li>
						           </ul>
						        </li>
					        </c:if>
					        <c:if test="${uname == null}">
					           <li><a href="userLogin.jsp" >登录</a></li>
					  		   <li><a href="register.jsp"  >注册</a></li>
					        </c:if>
					 	</ul>
					</div>
				</div>
			</div>
			<div class="carousel slide" id="carousel-238091">
				<ol class="carousel-indicators">
					<li class="active" data-slide-to="0" data-target="#carousel-238091">
					</li>
					<li data-slide-to="1" data-target="#carousel-238091">
					</li>
					<li data-slide-to="2" data-target="#carousel-238091">
					</li>
				</ol>
				<div class="carousel-inner">
					<div class="item active">
						<img alt="" src="<%=basePath%>resources/images/pl0.jpg" />
						<div class="carousel-caption">
							<h4>
								
							</h4>
							<p>
							
							</p>
						</div>
					</div>
					<div class="item">
						<img alt="" src="<%=basePath%>resources/images/pl7.jpg" />
						<div class="carousel-caption">
							<h4>
							
							</h4>
							<p>
							
							</p>
						</div>
					</div>
					<div class="item">
						<img alt="" src="<%=basePath%>resources/images/pl6.jpg" />
						<div class="carousel-caption">
							<h4>

							</h4>
							<p>

							</p>
						</div>
					</div>
				</div> <a class="left carousel-control" href="#carousel-238091" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a> <a class="right carousel-control" href="#carousel-238091" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
			</div>
		<div class="row clearfix" style="margin-top: 50px">
				<div class="col-md-3 column">
					<div class="col-md-12 column">
						<form action="flight/uqueryflight.action"  method="post" >
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
				<div class="col-md-9 column">
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
									<td><a href="javascript:void(0);" onclick="send('${flight.fnumber}')">订票</a> </td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</body>
</html>