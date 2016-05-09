package com.ticket.dao;

import com.ticket.model.Flight;


public interface FlightDao {

	public void addFlight(Flight flight);
	
	public boolean checkFlightExist(String fnumber);

	public Flight findFlight(String fnumber);

	public void updateFlight(String oldFnumber, String fnumber,
			String fcompany, String ftype, String fplacefrom,
			String fdestination, String fdeparturedate, String fdeparturetime,
			String ffalltime, String fprice);

	public void deleteFlight(String fnumber);

}
