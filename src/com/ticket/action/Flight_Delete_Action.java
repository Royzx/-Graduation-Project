package com.ticket.action;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;
import com.ticket.service.FlightService;
import com.ticket.service.UserOrderService;

public class Flight_Delete_Action extends ActionSupport {

	private static final long serialVersionUID = 2628853978496386172L;

	private String fnumber;
	
	private FlightService flightService;
	
	private UserOrderService orderService;
	
	public String deleteFlight(){
		System.out.println(fnumber);
		flightService.deleteFlight(fnumber);
		return SUCCESS;
		
	}

	public String getFnumber() {
		return fnumber;
	}

	public void setFnumber(String fnumber) {
		this.fnumber = fnumber;
	}

	public void validate() {
		if(orderService.checkFlightExist(fnumber)){
			this.addFieldError("FlightIsUsed", "航班已有人订票,无法删除");
		}
	}

	@Resource
	public void setOrderService(UserOrderService orderService) {
		this.orderService = orderService;
	}
	
	@Resource
	public void setFlightService(FlightService flightService) {
		this.flightService = flightService;
	}
}
