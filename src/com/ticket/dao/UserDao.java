package com.ticket.dao;

import java.util.List;

import com.ticket.model.Flight;
import com.ticket.model.User;

public interface UserDao {

    public User ulogin(String uname , String upassword);
    
    public User findUser(String uname);

	public void saveUser(String uname, String urealname ,String upassword, String uemail,
			String uphone );

	public boolean checkUserExist(String uname);

	public List<Flight> queryFlight(Flight flight);
	
	public List<Flight> queryFlight();
	
}
