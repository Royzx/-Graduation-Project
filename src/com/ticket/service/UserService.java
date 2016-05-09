package com.ticket.service;

import java.util.List;

import com.ticket.model.Flight;
import com.ticket.model.User;

public interface UserService {

	public User ulogin(String uname, String upassword);

	public void saveUser(String uname,String urealname, String upassword, String uemail,
			String uphone );

	public boolean checkUserExist(String uname);

	public List<Flight> queryFlight(String fplacefrom, String fdestination,
			String fdeparturedate);

}
