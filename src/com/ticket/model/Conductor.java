package com.ticket.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * ʵ������ƱԱ
 * @author 59215_000
 *
 */
@Entity
public class Conductor implements Serializable {

	private static final long serialVersionUID = 33503995579718650L;
	//��ƱԱ�û���
	private String cname;
	//��ƱԱ��ʵ��
	private String crealname;
	//��ƱԱ����
	private String cpassword;
	//��ƱԱ����
	private String cemail;
	//��ƱԱ�绰
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
