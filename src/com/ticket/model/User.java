package com.ticket.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 实体类User
 * @author 59215_000
 *
 */
@Entity
public class User implements Serializable{
	
	private static final long serialVersionUID = 7571731834922486715L;
	//用户名
	private String uname;
	//用户真实名
	private String urealname;
	//用户密码
	private String upassword;
	//用户邮箱
	private String uemail;
	//用户电话
	private String uphone;
	
    @Id
	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUphone() {
		return uphone;
	}

	public void setUphone(String uphone) {
		this.uphone = uphone;
	}

	public String getUrealname() {
		return urealname;
	}

	public void setUrealname(String urealname) {
		this.urealname = urealname;
	}
}
