package com.ticket.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ticket.dao.UserOrderDao;
import com.ticket.model.UserOrder;

@Repository("UserOrderDao")
public class UserOrderDaoImpl implements UserOrderDao {

	private HibernateTemplate hibernateTemplate;
	
	@SuppressWarnings("unchecked")
	public UserOrder findOrder(String uname, String fnumber) {
		List<UserOrder> orderList = (List<UserOrder>) hibernateTemplate.find("from UserOrder uo where uo.user.uname = '"+ uname +"' and uo.flight.fnumber = '"+fnumber+"'");
		if(orderList.size() == 0)
		{
			return null;
		}
		return orderList.get(0);
	}
	
	public int saveOrder(UserOrder order) {
		hibernateTemplate.save(order);
		return 0;
	}
	
	@SuppressWarnings("unchecked")
	public List<UserOrder> getOrderListByFnumber(String fnumber) {
		List<UserOrder> orderList = new ArrayList<UserOrder>();
	    orderList = (List<UserOrder>) hibernateTemplate.find("from UserOrder uo where uo.flight.fnumber = '"+ fnumber +"'");
		return orderList;
	}
	
	public void deleteOrder(String uname, int orderNum) {
		UserOrder order = new UserOrder();
		order = hibernateTemplate.load(UserOrder.class, orderNum);
		System.out.println(order);
		hibernateTemplate.delete(order);
	}
	
	@SuppressWarnings("unchecked")
	public List<UserOrder> getOrderList(String uname) {
		List<UserOrder> orderList = (List<UserOrder>) hibernateTemplate.find("from UserOrder uo where uo.user.uname = '"+ uname +"'");
		return orderList;
	}

	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	

	




}
