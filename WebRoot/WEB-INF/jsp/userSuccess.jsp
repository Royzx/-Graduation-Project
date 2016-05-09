<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'success.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    用户登录成功!
    <form action="" method="post"> 
    <input type="text" name="fplacefrom">
    <input type="text" name="fdestination">
    <input type="text" name="fdeparturedate">
    <input type="submit" value="查询">
    </form>
    <table width="100%">
						<tbody>
							<tr>
								<th>航班号</th>
								<th>航空公司</th>
								<th>起飞时间</th>
								<th>降落时间</th>
								<th>机票价格</th>
							</tr>
							<c:forEach items="${flightList}" var="flight"
								varStatus="status">
								<tr>
									<td>${flight.fnumber}</td>
									<td>${flight.fcompany}</td>
									<td>${flight.fdeparturetime}</td>
									<td>${flight.ffalltime}</td>
									<td>
									   <a href="">修改</a>&nbsp;&nbsp;&nbsp; 
									   <a href="${basePath}DeleteOneServlet.action?id=${message.id}">删除</a>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
  </body>
</html>
