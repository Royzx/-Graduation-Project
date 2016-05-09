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

	// ������
	private int orderNum;

	// �û���
	private User user;

	// �û���ʵ����
	private String urealname;

	// �����
	private Flight flight;
	
	//��ɵ�
	private String fplacefrom;
	
	//Ŀ�ĵ�
	private String fdestination;

	// �����������
	private Date fdeparturedate;

	// �������ʱ��
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
