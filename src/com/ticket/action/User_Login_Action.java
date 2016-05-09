package com.ticket.action;


import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ticket.service.UserService;

public class User_Login_Action extends ActionSupport {

	private static final long serialVersionUID = -824654408912324960L;
    //用户用户名
	private String uname;
	//用户密码
	private String upassword;
	
	private UserService userService;

	//调用adminservice的ulogin方法，判断是否登录成功，不成功则重新登录
	public String login(){
		if(userService.ulogin(uname , upassword)!= null){
			Map<String, Object> session =  ActionContext.getContext().getSession();
			session.put("uname", uname);
			return SUCCESS;
		}else{
			this.addFieldError("aErrorMsg","账户或密码错误！");
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


	//获得Userservice接口的实现类对象
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
}
