package com.ticket.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Flight implements Serializable{
    
	private static final long serialVersionUID = 2869953535567521826L;
	//�����
	private String fnumber;
	//���չ�˾
	private String fcompany;
	//�������
	private String ftype;
	//������ɵ�
	private String fplacefrom;
	//����Ŀ�ĵ�
	private String fdestination;
	//�����������
	private Date   fdeparturedate;
	//�������ʱ��
	private Date   fdeparturetime;
	//���ཱུ��ʱ��
	private Date   ffalltime;
	//��Ʊ�۸�
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
