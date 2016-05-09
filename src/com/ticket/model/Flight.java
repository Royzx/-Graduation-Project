package com.ticket.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Flight implements Serializable{
    
	private static final long serialVersionUID = 2869953535567521826L;
	//航班号
	private String fnumber;
	//航空公司
	private String fcompany;
	//航班机型
	private String ftype;
	//航班起飞地
	private String fplacefrom;
	//航班目的地
	private String fdestination;
	//航班起飞日期
	private Date   fdeparturedate;
	//航班起飞时间
	private Date   fdeparturetime;
	//航班降落时间
	private Date   ffalltime;
	//机票价格
	private int    fprice;
	
	@Id
	public String getFnumber() {
		return fnumber;
	}
	public void setFnumber(String fnumber) {
		this.fnumber = fnumber;
	}
	public String getFcompany() {
		return fcompany;
	}
	public void setFcompany(String fcompany) {
		this.fcompany = fcompany;
	}
	public String getFtype() {
		return ftype;
	}
	public void setFtype(String ftype) {
		this.ftype = ftype;
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
	public Date getFdeparturedate() {
		return fdeparturedate;
	}
	public void setFdeparturedate(Date fdeparturedate) {
		this.fdeparturedate = fdeparturedate;
	}
	public Date getFdeparturetime() {
		return fdeparturetime;
	}
	public void setFdeparturetime(Date fdeparturetime) {
		this.fdeparturetime = fdeparturetime;
	}
	public Date getFfalltime() {
		return ffalltime;
	}
	public void setFfalltime(Date ffalltime) {
		this.ffalltime = ffalltime;
	}
	public int getFprice() {
		return fprice;
	}
	public void setFprice(int fprice) {
		this.fprice = fprice;
	}
	
	
}
