package com.ticket.action;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ticket.model.UserOrder;
import com.ticket.service.UserOrderService;

public class UserOrder_GetOrderList_Action extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8142477826569817500L;
	
	private UserOrderService orderService;

	public String getOrderList(){
        
		Map<String, Object> session =  ActionContext.getContext().getSession();
		String uname = (String) session.get("uname");
		System.out.println(uname);
		List<UserOrder> orderList = orderService.getOrderList(uname);
		ActionContext.getContext().getSession().remove("orderList");
		ActionContext.getContext().getSession().put("orderList", orderList);
		return SUCCESS;
	}
	
	
	@Resource
	public void setOrderService(UserOrderService orderService) {
		this.orderService = orderService;
	}
}
