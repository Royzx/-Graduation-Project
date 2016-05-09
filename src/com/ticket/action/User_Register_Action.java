package com.ticket.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ticket.service.UserService;
/**
 * 用户注册类
 * @author 59215_000
 *
 */
public class User_Register_Action extends ActionSupport{

	private static final long serialVersionUID = 3422832584416850472L;
    //用户名
	private String uname;
	//用户密码
	private String upassword;
	//用户确认密码
	private String upassword1;
	//用户真实姓名
	private String urealname;
	//用户邮箱
	private String uemail;
	//用户手机
	private String uphone;
	
	//获取userservice对象
	private UserService userService;
	
	public String register(){
		System.out.println(urealname);
		userService.saveUser(uname,urealname,upassword,uemail,uphone);
		return SUCCESS;
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
	public String getUpassword1() {
		return upassword1;
	}
	public void setUpassword1(String upassword1) {
		this.upassword1 = upassword1;
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

    //通过设值注入userservice实例对象
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String getUrealname() {
		return urealname;
	}

	public void setUrealname(String urealname) {
		this.urealname = urealname;
	}

	//进行用户名注册验证
	@Override
	public void validate() {
		if(uname.length() < 6){
			this.addFieldError("urnErrorMsg", "用户名不能少于6位");
		}
		if (urealname.equals("")) {
			this.addFieldError("urRealNameErrorMeg", "真实姓名不能为空");
		}
		if(userService.checkUserExist(uname)){
			this.addFieldError("urnExistErrorMsg", "用户名已存在");
		}
		if(upassword.equals("")){
			this.addFieldError("urpErrorMsg", "密码不能空");
		}
		if(!upassword.equals(upassword1)){
			this.addFieldError("urpErrorMsg", "两次密码不相同");
		}
	}
	
	
}
