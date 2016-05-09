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
			this.addFieldError("FlightNumberError", "����Ų���Ϊ��");
		}
		if(flightModel.getFcompany().equals("")){
			this.addFieldError("FlightCompanyError", "���չ�˾����Ϊ��");
		}
		if(flightModel.getFdeparturedate().equals("")){
			this.addFieldError("FlightDeparturedate","����������ڲ���Ϊ��");
		}
		if(flightModel.getFdeparturetime().equals("")){
			this.addFieldError("FlightDeparturetimeError", "�������ʱ�䲻��Ϊ��");
		}
		if(flightModel.getFfalltime().equals("")){
			this.addFieldError("FlightFalltimeError", "���ཱུ��ʱ�䲻��Ϊ��");
		}
		if(flightModel.getFplacefrom().equals("")){
			this.addFieldError("FlightPlaceFromError", "������ɵص㲻��Ϊ��");
		}
		if(flightModel.getFdestination().equals("")){
			this.addFieldError("FlightDestinationError", "���ཱུ��ص㲻��Ϊ��");
		}
		if(flightModel.getFprice().equals("")){
			this.addFieldError("FlightPriceError", "����۸���Ϊ��");
		}
	}
}
