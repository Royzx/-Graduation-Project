package com.ticket.action;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ticket.model.Flight;
import com.ticket.service.FlightService;

public class Admin_FlightMng_Action extends ActionSupport{

	private static final long serialVersionUID = 391171155371073011L;

	private FlightService flightService;
	
	private String fnumber;
	
    public String flightMng(){
    	return SUCCESS;
    }
	
    public String jumpAdd(){
    	return SUCCESS;
    }
    
    public String jumpUpdate(){
    	Flight flight = flightService.queryFlightByFnumber(fnumber);
    	ActionContext.getContext().getSession().put("flight", flight);
    	ActionContext.getContext().getSession().put("fnumber", fnumber);
    	return SUCCESS;
    }

	public String getFnumber() {
		return fnumber;
	}

	public void setFnumber(String fnumber) {
		this.fnumber = fnumber;
	}

	@Resource
	public void setFlightService(FlightService flightService) {
		this.flightService = flightService;
	}
}
