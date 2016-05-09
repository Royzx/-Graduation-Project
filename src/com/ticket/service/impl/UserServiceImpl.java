package com.ticket.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ticket.dao.UserDao;
import com.ticket.model.Flight;
import com.ticket.model.User;
import com.ticket.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	private UserDao userDao;

	// �û���¼
	public User ulogin(String uname, String upassword) {
		return userDao.ulogin(uname, upassword);
	}

	// �û�ע��
	public void saveUser(String uname, String urealname, String upassword, String uemail,
			String uphone) {
		userDao.saveUser(uname, urealname, upassword, uemail, uphone);
	}

	// ���ע���û��Ƿ����
	public boolean checkUserExist(String uname) {
		return userDao.checkUserExist(uname);
	}

	// ��ѯ����
	public List<Flight> queryFlight(String fplacefrom, String fdestination,
			String fdeparturedate) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;

		Flight flight;
		List<Flight> flightList = new ArrayList<Flight>();
		try {
			flight = new Flight();
			flight.setFplacefrom(fplacefrom);
			flight.setFdestination(fdestination);
			if (fdeparturedate != null && !fdeparturedate.equals("")) {
				date = format.parse(fdeparturedate);
				java.sql.Date sqlDate = new java.sql.Date(date.getTime());
				flight.setFdeparturedate(sqlDate);
			}
			flightList = userDao.queryFlight(flight);
		} catch (ParseException e) {
			e.printStackTrace();
			System.out.println("ʱ��ת��ʧ��");
		}
		return flightList;
	}

	
	
	// ��ֵע��userDao�Ķ���
	@Resource
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
