package com.ticket.service;

import com.ticket.model.Flight;

public interface FlightService {

	public Flight addFlight(String fnumber,String fcompany,String ftype,String fplacefrom,String fdestination,
			String fdeparturedate,String fdeparturetime,String ffalltime,String fprice);

	public boolean checkFlightExist(String fnumber);

	public Flight queryFlightByFnumber(String fnumber);

	public void updateFlight(String oldFnumber,String fnumber, String fcompany, String ftype,
			String fplacefrom, String fdestination, String fdeparturedate,
			String fdeparturetime, String ffalltime, String fprice);

	public void deleteFlight(String fnumber);
}
