<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE HTML >
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addFlight.jsp' starting page</title>
	<script src="./resources/js/jquery.min.js"></script>
		<script src="./resources/js/bootstrap.min.js"></script>
		<script src="./resources/js/common/Calendar3.js"></script>
		<link  href="resources/css/bootstrap.min.css" rel="stylesheet" type="text/css">
		
  </head>
  <h2>修改航班</h2>
  <body>
  
  <div class="container">
    <div class="row clearfix">
		 <s:fielderror fieldName="FlightExistError" />
	    <s:fielderror fieldName="FlightNumberError" />
	    <s:fielderror fieldName="FlightCompanyError" />
	    <s:fielderror fieldName="FlightDeparturedate" />
	    <s:fielderror fieldName="FlightDeparturetimeError" />
	    <s:fielderror fieldName="FlightFalltimeError" />
	    <s:fielderror fieldName="FlightPlaceFromError" />
	    <s:fielderror fieldName="FlightDestinationError" />
	    <s:fielderror fieldName="FlightPriceError" />
		<div class="col-md-2 column">
			<form action="flight/updateFlight.action" method="post">
				<div class="form-group">
					<label for="exampleInputEmail1"> 航班号</label><input
						class="form-control" id="exampleInputEmail1" type="text"
						name="fnumber" value="${flight.fnumber}" readonly="readonly" />
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1"> 航空公司 </label><input
						class="form-control" id="exampleInputEmail1" type="text"
						name="fcompany" value="${flight.fcompany}" />
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">飞机型号 </label><input
						class="form-control" id="exampleInputPassword1" type="text"
						name="ftype" value="${flight.ftype}" />
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">出发地 </label><input
						class="form-control" id="exampleInputPassword1" type="text"
						name="fplacefrom" value="${flight.fplacefrom}"/>
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1"> 目的地 </label><input
						class="form-control" id="exampleInputEmail1" type="text"
						name="fdestination" value="${flight.fdestination}"/>
				</div>
				<div class="form-group">
					 <label for="date">起飞日期</label>
					 <input type="text" class="form-control" id="date" name="fdeparturedate" 
					 	onclick="new Calendar().show(this);" readonly="readonly"  
					 	value="<fmt:formatDate value='${flight.fdeparturedate}' pattern="yy/MM/dd" />"/>
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1"> 起飞时间</label><input
						class="form-control" id="exampleInputEmail1" type="text"
						name="fdeparturetime" value="<fmt:formatDate value='${flight.fdeparturetime}' pattern="HH:mm" />"/>
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1"> 到达时间 </label><input
						class="form-control" id="exampleInputEmail1" type="text"
						name="ffalltime" value="<fmt:formatDate value='${flight.ffalltime}' pattern="HH:mm" />"/>
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1"> 机票价格 </label><input
						class="form-control" id="exampleInputEmail1" type="text"
						name="fprice" value="${flight.fprice}"/>
				</div>
				<button type="submit" class="btn btn-default">提交</button>
			</form>
		</div>
	</div>
</div>
  </body>
</html>
