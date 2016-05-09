package com.ticket.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ticket.dao.UserDao;
import com.ticket.model.Flight;
import com.ticket.model.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	private HibernateTemplate hibernateTemplate;
	
	//查找用户
	public User findUser(String uname) {
		User user = new User();
		user = hibernateTemplate.get(User.class, uname);
		return user;
	}
	
	//用户登录
	@SuppressWarnings("unchecked")
	public User ulogin(String uname, String upassword) {
		List<User> users =  (List<User>) hibernateTemplate.find("from User u where u.uname = '"+ uname +"' and u.upassword = '"+upassword+"'");
		if(users.size() != 0){
			return users.get(0);
		}
		return null;
	}
	
	//用户注册
	public void saveUser(String uname, String urealname,String upassword, String uemail,
			String uphone) {
		User user = new User();
		user.setUname(uname);
		user.setUrealname(urealname);
		user.setUpassword(upassword);
		user.setUemail(uemail);
		user.setUphone(uphone);
		hibernateTemplate.save(user);
	}

	//检查用户是否已经存在
	public boolean checkUserExist(String uname) {
		@SuppressWarnings("unchecked")
		List<User> users =  (List<User>) hibernateTemplate.find("from User u where u.uname = '"+ uname+"'");
		if(users.size() != 0){
			return true;
		}
		return false;
	}
	
	//查询航班
	@SuppressWarnings("unchecked")
	public List<Flight> queryFlight(Flight flight) {
		List<Flight> flightList = new ArrayList<Flight>();
		String fplacefrom       = flight.getFplacefrom();
		String fdestination     = flight.getFdestination();
		Date date               = flight.getFdeparturedate();
		
		StringBuilder str       = new StringBuilder("from Flight f where 1=1 ");
		if(fplacefrom != null && !fplacefrom.equals("")){
			str.append(" and f.fplacefrom = '"+ fplacefrom +"'");
		}
		if(fdestination != null && !fdestination.equals("")){
			str.append(" and f.fdestination = '"+fdestination+"'");
		}
		if(date != null && !date.equals("")){
			str.append(" and f.fdeparturedate = '"+ date +"' ");
		}
		
		flightList = (List<Flight>) hibernateTemplate.find(str.toString());
		return flightList;
	}
	
	//查询所有航班
	@SuppressWarnings("unchecked")
	public List<Flight> queryFlight() {
		List<Flight> flightList = new ArrayList<Flight>();
		flightList              = (List<Flight>) hibernateTemplate.find(" from Flight");
		return flightList;
	}
	
	//获取事务模板
	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	





}
