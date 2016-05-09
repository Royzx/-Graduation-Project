package com.ticket.service;

import java.util.List;

import com.ticket.model.UserOrder;

public interface UserOrderService {

	int saveOrder(String uname, String fnumber);

	List<UserOrder> getOrderList(String uname);

	UserOrder findOrder(String uname, String fnumber);

	void deleteOrder(String uname, int orderNum);

	boolean checkFlightExist(String fnumber);
	
}
