package com.ticket.action;


import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ticket.service.AdminService;

/**
 * �����¼��action��
 * @author 59215_000
 */
public class Admin_Login_Action extends ActionSupport {

	private static final long serialVersionUID = -3794500448447615969L;
    //����Ա�û���
	private String aname;
	//����Ա����
	private String apassword;
	
	private AdminService adminService;

	//����adminservice��alogin�������ж��Ƿ��¼�ɹ������ɹ������µ�¼
	public String login(){
		if(adminService.alogin(aname , apassword)!= null){
			Map<String, Object> session =  ActionContext.getContext().getSession();
			session.put("aname", aname);
			return SUCCESS;
		}else{
			this.addFieldError("aErrorMsg","�˻����������");
			return INPUT;
		}
	}

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

	//���adminservice�ӿڵ�ʵ�������
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}

	
}
