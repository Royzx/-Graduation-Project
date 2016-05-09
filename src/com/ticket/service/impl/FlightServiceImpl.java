package com.ticket.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ticket.dao.FlightDao;
import com.ticket.model.Flight;
import com.ticket.service.FlightService;
import com.ticket.util.DateFormat;

@Service("flightService")
public class FlightServiceImpl implements FlightService {

	private DateFormat dateFormat;
	
	private FlightDao flightDao;
	
	public Flight addFlight(String fnumber, String fcompany, String ftype,
			String fplacefrom, String fdestination, String fdeparturedate,
			String fdeparturetime, String ffalltime, String fprice) {
		
		Flight flight = new Flight();
		
		flight.setFnumber(fnumber);
		flight.setFcompany(fcompany);
		flight.setFtype(ftype);
		flight.setFplacefrom(fplacefrom);
		flight.setFdestination(fdestination);
		flight.setFdeparturedate(dateFormat.dateFormat(fdeparturedate));
		flight.setFdeparturetime(dateFormat.timeFormat(fdeparturetime));
		flight.setFfalltime(dateFormat.timeFormat(ffalltime));
		flight.setFprice(Integer.valueOf(fprice));
		
		flightDao.addFlight(flight);
		
		return flight;
	}
	
	
	public Flight queryFlightByFnumber(String fnumber){
		Flight flight = new Flight();
	    flight = flightDao.findFlight(fnumber);
	    return flight;
	}
	
	public void deleteFlight(String fnumber) {
		flightDao.deleteFlight(fnumber);
		
	}
	
	//检查航班号是否已经存在
	@Override
	public boolean checkFlightExist(String fnumber) {
		return flightDao.checkFlightExist(fnumber);
	}

	@Resource
	public void setDateFormat(DateFormat dateFormat) {
		this.dateFormat = dateFormat;
	}

	@Resource
	public void setFlightDao(FlightDao flightDao) {
		this.flightDao = flightDao;
	}


	@Override
	public void updateFlight(String oldFnumber,String fnumber, String fcompany, String ftype,
			String fplacefrom, String fdestination, String fdeparturedate,
			String fdeparturetime, String ffalltime, String fprice) {

		flightDao.updateFlight(oldFnumber, fnumber,  fcompany,  ftype,
				 fplacefrom,  fdestination,  fdeparturedate,
				 fdeparturetime,  ffalltime,  fprice);
		
	}


	

	
}
