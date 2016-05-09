package com.ticket.dao;

import java.util.List;

import com.ticket.model.UserOrder;

public interface UserOrderDao {

	int saveOrder(UserOrder order);

	List<UserOrder> getOrderList(String uname);

	UserOrder findOrder(String uname, String fnumber);

	void deleteOrder(String uname, int orderNum);

	List<UserOrder> getOrderListByFnumber(String fnumber);

}
