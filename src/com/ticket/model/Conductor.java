package com.ticket.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * 实体类售票员
 * @author 59215_000
 *
 */
@Entity
public class Conductor implements Serializable {

	private static final long serialVersionUID = 33503995579718650L;
	//售票员用户名
	private String cname;
	//售票员真实名
	private String crealname;
	//售票员密码
	private String cpassword;
	//售票员邮箱
	private String cemail;
	//售票员电话
	private String cphone;
    @Id
	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCpassword() {
		return cpassword;
	}

	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}

	public String getCrealname() {
		return crealname;
	}

	public void setCrealname(String crealname) {
		this.crealname = crealname;
	}

	public String getCemail() {
		return cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

	public String getCphone() {
		return cphone;
	}

	public void setCphone(String cphone) {
		this.cphone = cphone;
	}
}
