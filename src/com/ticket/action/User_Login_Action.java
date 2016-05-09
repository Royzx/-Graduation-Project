package com.ticket.action;


import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ticket.service.UserService;

public class User_Login_Action extends ActionSupport {

	private static final long serialVersionUID = -824654408912324960L;
    //�û��û���
	private String uname;
	//�û�����
	private String upassword;
	
	private UserService userService;

	//����adminservice��ulogin�������ж��Ƿ��¼�ɹ������ɹ������µ�¼
	public String login(){
		if(userService.ulogin(uname , upassword)!= null){
			Map<String, Object> session =  ActionContext.getContext().getSession();
			session.put("uname", uname);
			return SUCCESS;
		}else{
			this.addFieldError("aErrorMsg","�˻����������");
			return INPUT;
		}
	}

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


	//���Userservice�ӿڵ�ʵ�������
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
}
