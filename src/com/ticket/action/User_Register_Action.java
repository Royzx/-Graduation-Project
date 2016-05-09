package com.ticket.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ticket.service.UserService;
/**
 * �û�ע����
 * @author 59215_000
 *
 */
public class User_Register_Action extends ActionSupport{

	private static final long serialVersionUID = 3422832584416850472L;
    //�û���
	private String uname;
	//�û�����
	private String upassword;
	//�û�ȷ������
	private String upassword1;
	//�û���ʵ����
	private String urealname;
	//�û�����
	private String uemail;
	//�û��ֻ�
	private String uphone;
	
	//��ȡuserservice����
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

    //ͨ����ֵע��userserviceʵ������
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String getUrealname() {
		return urealname;
	}

	public void setUrealname(String urealname) {
		this.urealname = urealname;
	}

	//�����û���ע����֤
	@Override
	public void validate() {
		if(uname.length() < 6){
			this.addFieldError("urnErrorMsg", "�û�����������6λ");
		}
		if (urealname.equals("")) {
			this.addFieldError("urRealNameErrorMeg", "��ʵ��������Ϊ��");
		}
		if(userService.checkUserExist(uname)){
			this.addFieldError("urnExistErrorMsg", "�û����Ѵ���");
		}
		if(upassword.equals("")){
			this.addFieldError("urpErrorMsg", "���벻�ܿ�");
		}
		if(!upassword.equals(upassword1)){
			this.addFieldError("urpErrorMsg", "�������벻��ͬ");
		}
	}
	
	
}
