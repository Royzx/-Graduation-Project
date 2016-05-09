package com.ticket.action;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ticket.po.FlightModel;
import com.ticket.service.FlightService;

public class Flight_Update_Action extends ActionSupport implements ModelDriven<FlightModel>{

	private static final long serialVersionUID = -3929558724910400399L;

	private FlightModel flightModel = new FlightModel();
	
	private FlightService flightService;
	
	@Override
	public FlightModel getModel() {
		System.out.println(flightModel);
		return flightModel;
	}

	public String updateFlight(){
		String oldFnumber = (String) ActionContext.getContext().getSession().get("fnumber");
		System.out.println("oldFnumber:"+oldFnumber);
		flightService.updateFlight(oldFnumber,flightModel.getFnumber(), flightModel.getFcompany(), flightModel.getFtype(), flightModel.getFplacefrom(), flightModel.getFdestination(), flightModel.getFdeparturedate(), flightModel.getFdeparturetime(), flightModel.getFfalltime(), flightModel.getFprice());
	    return SUCCESS;
	}

	@Resource
	public void setFlightService(FlightService flightService) {
		this.flightService = flightService;
	}
	
	@Override
	public void validate() {
		if(flightModel.getFnumber().equals("")){
			this.addFieldError("FlightNumberError", "航班号不能为空");
		}
		if(flightModel.getFcompany().equals("")){
			this.addFieldError("FlightCompanyError", "航空公司不能为空");
		}
		if(flightModel.getFdeparturedate().equals("")){
			this.addFieldError("FlightDeparturedate","航班起飞日期不能为空");
		}
		if(flightModel.getFdeparturetime().equals("")){
			this.addFieldError("FlightDeparturetimeError", "航班起飞时间不能为空");
		}
		if(flightModel.getFfalltime().equals("")){
			this.addFieldError("FlightFalltimeError", "航班降落时间不能为空");
		}
		if(flightModel.getFplacefrom().equals("")){
			this.addFieldError("FlightPlaceFromError", "航班起飞地点不能为空");
		}
		if(flightModel.getFdestination().equals("")){
			this.addFieldError("FlightDestinationError", "航班降落地点不能为空");
		}
		if(flightModel.getFprice().equals("")){
			this.addFieldError("FlightPriceError", "航班价格不能为空");
		}
	}
}
