package com.ticket.action;


import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ticket.service.AdminService;

/**
 * 管理登录的action类
 * @author 59215_000
 */
public class Admin_Login_Action extends ActionSupport {

	private static final long serialVersionUID = -3794500448447615969L;
    //管理员用户名
	private String aname;
	//管理员密码
	private String apassword;
	
	private AdminService adminService;

	//调用adminservice的alogin方法，判断是否登录成功，不成功则重新登录
	public String login(){
		if(adminService.alogin(aname , apassword)!= null){
			Map<String, Object> session =  ActionContext.getContext().getSession();
			session.put("aname", aname);
			return SUCCESS;
		}else{
			this.addFieldError("aErrorMsg","账户或密码错误！");
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

	//获得adminservice接口的实现类对象
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}

	
}
