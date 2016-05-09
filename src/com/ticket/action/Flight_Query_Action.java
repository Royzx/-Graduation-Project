package com.ticket.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ticket.model.Flight;
import com.ticket.service.UserService;


/**
 * 用户查询机票类
 * @author 59215_000
 *
 */
public class Flight_Query_Action extends ActionSupport{

	private static final long serialVersionUID = -3698053586890257282L;

	//起飞地点
	private String fplacefrom;
	//降落地点
	private String fdestination;
	//起飞日期
	private String fdeparturedate;

	private UserService userService;
	
	public String queryFlight(){
		List<Flight> flightList = new ArrayList<Flight>();
		System.out.println(fplacefrom);
		System.out.println(fdestination);
		System.out.println(fdeparturedate);
		flightList = userService.queryFlight(fplacefrom,fdestination,fdeparturedate);
		ActionContext.getContext().getSession().put("flightList", flightList);
		return SUCCESS;
	}
	
	public String getFplacefrom() {
		return fplacefrom;
	}

	public void setFplacefrom(String fplacefrom) {
		this.fplacefrom = fplacefrom;
	}

	public String getFdestination() {
		return fdestination;
	}

	public void setFdestination(String fdestination) {
		this.fdestination = fdestination;
	}

	public String getFdeparturedate() {
		return fdeparturedate;
	}

	public void setFdeparturedate(String fdeparturedate) {
		this.fdeparturedate = fdeparturedate;
	}

	//设置注入获得UserService实体类
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
}
