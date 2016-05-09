package com.ticket.action;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ticket.model.UserOrder;
import com.ticket.service.UserOrderService;

public class UserOrder_SaveOrder_Action extends ActionSupport{
	
	private static final long serialVersionUID = -762475273722313924L;

	private String fnumber;
	
	private UserOrderService orderService;
	
	public String saveOrder()
	{
		System.out.println(fnumber);
		Map<String, Object> session =  ActionContext.getContext().getSession();
		
		String uname = (String) session.get("uname");
		System.out.println(uname);
		
		UserOrder order = orderService.findOrder(uname,fnumber);
		
		if(null == order){
		
			System.out.println("½øÈë");
			int iReturn = orderService.saveOrder(uname,fnumber);
		    if(iReturn != 1){
		    	return ERROR;
		    }
		}
		List<UserOrder> orderList = orderService.getOrderList(uname);
		ActionContext.getContext().getSession().put("orderList", orderList);
		return SUCCESS;
	}

	public String getFnumber() {
		return fnumber;
	}

	public void setFnumber(String fnumber) {
		this.fnumber = fnumber;
	}

	@Resource
	public void setOrderService(UserOrderService orderService) {
		this.orderService = orderService;
	}

}
