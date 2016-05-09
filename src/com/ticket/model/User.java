package com.ticket.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * ʵ����User
 * @author 59215_000
 *
 */
@Entity
public class User implements Serializable{
	
	private static final long serialVersionUID = 7571731834922486715L;
	//�û���
	private String uname;
	//�û���ʵ��
	private String urealname;
	//�û�����
	private String upassword;
	//�û�����
	private String uemail;
	//�û��绰
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
