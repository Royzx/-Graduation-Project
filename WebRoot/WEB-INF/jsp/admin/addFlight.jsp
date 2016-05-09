<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addFlight.jsp' starting page</title>
    <script src="./resources/js/jquery.min.js"></script>
	<script src="./resources/js/bootstrap.min.js"></script>
	<script src="./resources/js/common/Calendar3.js"></script>
	<link  href="resources/css/bootstrap.min.css" rel="stylesheet" type="text/css">
   <%--  <script src="<%=basePath%>resources/js/common/Calendar3.js"></script> --%>

  </head>
  <h2>添加航班</h2>
  <body>
    <%-- <s:fielderror fieldName="FlightExistError" />
    <s:fielderror fieldName="FlightNumberError" />
    <s:fielderror fieldName="FlightCompanyError" />
    <s:fielderror fieldName="FlightDeparturedate" />
    <s:fielderror fieldName="FlightDeparturetimeError" />
    <s:fielderror fieldName="FlightFalltimeError" />
    <s:fielderror fieldName="FlightPlaceFromError" />
    <s:fielderror fieldName="FlightDestinationError" />
    <s:fielderror fieldName="FlightPriceError" />
    <form action="flight/AddFlight.action" method="post">
         航班号    ：<input type="text" name="fnumber"><br>
         航空公司：<input type="text" name="fcompany"><br>
         飞机型号：<input type="text" name="ftype"><br>
         出发地    ：<input type="text" name="fplacefrom"><br>
         目的地    ：<input type="text" name="fdestination"><br>
         起飞日期：<input type="text" name="fdeparturedate" id="control_date" size="10" maxlength="10" onclick="new Calendar().show(this);" readonly="readonly" /><br>
         起飞时间：<input type="text" name="fdeparturetime"><br>  
         到达时间：<input type="text" name="ffalltime"><br>   
         机票价格：<input type="text" name="fprice"><br>
         <input type="submit" onclick="javascript:return confirm('确认添加吗？');" value="添加">   
    </form> --%>
    
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
			<form action="flight/addFlight.action" method="post">
				<div class="form-group">
					<label for="exampleInputEmail1"> 航班号</label><input
						class="form-control" id="exampleInputEmail1" type="text"
						name="fnumber" />
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1"> 航空公司 </label><input
						class="form-control" id="exampleInputEmail1" type="text"
						name="fcompany"  />
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">飞机型号 </label><input
						class="form-control" id="exampleInputPassword1" type="text"
						name="ftype"/>
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">出发地 </label><input
						class="form-control" id="exampleInputPassword1" type="text"
						name="fplacefrom" />
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1"> 目的地 </label><input
						class="form-control" id="exampleInputEmail1" type="text"
						name="fdestination"/>
				</div>
				<div class="form-group">
					 <label for="date">起飞日期</label>
					 <!-- <input type="text" class="form-control" id="date" name="fdeparturedate" 
					 	onclick="new Calendar().show(this);" readonly="readonly"  
					 	/> -->
				 	<input type="date" class="form-control" id="date" name="fdeparturedate" value="${fdeparturedate}" />
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1"> 起飞时间</label><input
						class="form-control" id="exampleInputEmail1" type="text"
						name="fdeparturetime" />
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1"> 到达时间 </label><input
						class="form-control" id="exampleInputEmail1" type="text"
						name="ffalltime" />
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1"> 机票价格 </label><input
						class="form-control" id="exampleInputEmail1" type="text"
						name="fprice"/>
				</div>
				<button type="submit" class="btn btn-default">提交</button>
			</form>
		</div>
	</div>
</div>
  </body>
</html>
