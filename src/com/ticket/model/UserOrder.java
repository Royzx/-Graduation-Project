package com.ticket.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class UserOrder implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4607713568368721403L;

	// 订单号
	private int orderNum;

	// 用户名
	private User user;

	// 用户真实姓名
	private String urealname;

	// 航班号
	private Flight flight;
	
	//起飞地
	private String fplacefrom;
	
	//目的地
	private String fdestination;

	// 航班起飞日期
	private Date fdeparturedate;

	// 航班起飞时间
	private Date fdeparturetime;

	public Date getFdeparturedate() {
		return fdeparturedate;
	}

	public Date getFdeparturetime() {
		return fdeparturetime;
	}

	@Id
	public int getOrderNum() {
		return orderNum;
	}

	public String getUrealname() {
		return urealname;
	}

	public void setFdeparturedate(Date fdeparturedate) {
		this.fdeparturedate = fdeparturedate;
	}

	public void setFdeparturetime(Date fdeparturetime) {
		this.fdeparturetime = fdeparturetime;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public void setUrealname(String urealname) {
		this.urealname = urealname;
	}

	@ManyToOne
	@JoinColumn(name="uname")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne
	@JoinColumn(name="fnumber")
	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
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
}
