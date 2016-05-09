package com.ticket.action;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;
import com.ticket.service.UserOrderService;

public class UserOrder_DeleteOrder_Action extends ActionSupport{

	private static final long serialVersionUID = -7291403964306903380L;

	private String uname;
	
	private int orderNum;
	
	private UserOrderService orderService;
	
	public String deleteOrder(){
		
		orderService.deleteOrder(uname,orderNum);
		return SUCCESS;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	@Resource
	public void setOrderService(UserOrderService orderService) {
		this.orderService = orderService;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	
	
}
