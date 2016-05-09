package com.ticket.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ticket.po.FlightModel;
import com.ticket.service.FlightService;


/**
 * 添加机票类
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

	//注入flightService对象
	public void setFlightService(FlightService flightService) {
		this.flightService = flightService;
	}

	//进行数据校验
	@Override
	public void validate() {
		if(flightService.checkFlightExist(flightModel.getFnumber())){
			this.addFieldError("FlightExistError", "添加失败，航班已存在");
		}
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
