package com.ticket.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

//实体类Admin
@Entity
public class Admin implements Serializable {
	
	private static final long serialVersionUID = -7119185536092744464L;
	//管理员用户名
	private String aname;
	//管理员真实名
	private String arealname;
	//管理员密码
	private String apassword;
	//管理员邮箱
	private String aemail;
	//管理员电话
	private String aphone;
    
	@Id
	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getApassword() {
		return apassword;
	}

	public void setApassword(String apassword) {
		this.apassword = apassword;
	}

	public String getArealname() {
		return arealname;
	}

	public void setArealname(String arealname) {
		this.arealname = arealname;
	}

	public String getAemail() {
		return aemail;
	}

	public void setAemail(String aemail) {
		this.aemail = aemail;
	}

	public String getAphone() {
		return aphone;
	}

	public void setAphone(String aphone) {
		this.aphone = aphone;
	}
}
