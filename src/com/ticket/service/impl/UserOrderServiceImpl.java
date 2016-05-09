package com.ticket.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ticket.dao.FlightDao;
import com.ticket.dao.UserDao;
import com.ticket.dao.UserOrderDao;
import com.ticket.model.Flight;
import com.ticket.model.User;
import com.ticket.model.UserOrder;
import com.ticket.service.UserOrderService;

@Service("userOrderService")
public class UserOrderServiceImpl implements UserOrderService {

	private UserDao userDao;
	
	private FlightDao flightDao;
	
	private UserOrderDao userOrderDao;
	
	public UserOrder findOrder(String uname, String fnumber) {
		UserOrder userOrder = userOrderDao.findOrder(uname,fnumber);
		if(null == userOrder){
			return null;
		}
		return userOrder;
	}

	
	public int saveOrder(String uname, String fnumber) {

		System.out.println(uname);
		User user  = new User();
		user = userDao.findUser(uname);
		if(null == user)
		{
			return 0;
		}
		String urealname = user.getUrealname();
		
		Flight flight = new Flight();
		flight = flightDao.findFlight(fnumber);
		if(null == flight)
		{
			return 0;
		}
		Date date = flight.getFdeparturedate();
		Date time = flight.getFdeparturetime();
		String fplacefrom   = flight.getFplacefrom();
		String fdestination = flight.getFdestination();
		
		UserOrder order = new UserOrder();
		order.setUser(user);
		order.setUrealname(urealname);
		order.setFlight(flight);
		order.setFplacefrom(fplacefrom);
		order.setFdestination(fdestination);
		order.setFdeparturedate(date);
		order.setFdeparturetime(time);
		userOrderDao.saveOrder(order);
		return 1;
	}

	@Override
	public void deleteOrder(String uname, int orderNum) {
		System.out.println("serviceImp:"+uname);
		userOrderDao.deleteOrder(uname, orderNum);
	}

	
	
	public List<UserOrder> getOrderList(String uname) {
		List<UserOrder> orderList = userOrderDao.getOrderList(uname);
		return orderList;
	}
	
	public boolean checkFlightExist(String fnumber) {
		List<UserOrder> orderList = new ArrayList<UserOrder>();
		orderList = userOrderDao.getOrderListByFnumber(fnumber);
		if (orderList.size()!= 0 ) {
			return true;
		}
		return false;
	}
	
	
	@Resource
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Resource
	public void setFlightDao(FlightDao flightDao) {
		this.flightDao = flightDao;
	}

	@Resource
	public void setUserOrderDao(UserOrderDao userOrderDao) {
		this.userOrderDao = userOrderDao;
	}

	



	
	
	

}
