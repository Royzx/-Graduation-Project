package com.ticket.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class User_Logout_Action extends ActionSupport{

	private static final long serialVersionUID = 1841400262937678021L;

	public String logout()
	{
		Map<String, Object> session =  ActionContext.getContext().getSession();
		session.remove("uname");
		return SUCCESS;
	}
}
