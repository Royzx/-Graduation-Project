package com.ticket.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ticket.po.FlightModel;
import com.ticket.service.FlightService;


/**
 * ��ӻ�Ʊ��
 * @author 59215_000
 *
 */
public class Flight_Add_Action extends ActionSupport implements ModelDriven<FlightModel>{

	private static final long serialVersionUID = -3698053586890257282L;

	private FlightModel flightModel = new FlightModel();
	
	private FlightService flightService;
	
	public String addFlight(){
		
		flightService.addFlight(flightModel.getFnumber(), flightModel.getFcompany(), flightModel.getFtype(), flightModel.getFplacefrom(), flightModel.getFdestination(), flightModel.getFdeparturedate(), flightModel.getFdeparturetime(), flightModel.getFfalltime(), flightModel.getFprice());
		return SUCCESS;
		
	}
	
	@Override
	public FlightModel getModel() {
		return flightModel;
	}

	//ע��flightService����
	public void setFlightService(FlightService flightService) {
		this.flightService = flightService;
	}

	//��������У��
	@Override
	public void validate() {
		if(flightService.checkFlightExist(flightModel.getFnumber())){
			this.addFieldError("FlightExistError", "���ʧ�ܣ������Ѵ���");
		}
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
