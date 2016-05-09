package com.ticket.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ticket.dao.FlightDao;
import com.ticket.model.Flight;
/**
 * 机票数据处理类
 * @author 59215_000
 *
 */
@Repository("flightDao")
public class FlightDaoImpl implements FlightDao {

	private HibernateTemplate hibernateTemplate;
	
	
	@Override
	public Flight findFlight(String fnumber) {
		Flight flight = new Flight();
		flight = hibernateTemplate.get(Flight.class, fnumber);
		return flight;
	}

	@Override
	public void addFlight(Flight flight) {
		hibernateTemplate.save(flight);
	}
	
	@Override
	public boolean checkFlightExist(String fnumber) {
		@SuppressWarnings("unchecked")
		List<Flight> flights =  (List<Flight>) hibernateTemplate.find(" from Flight f where f.fnumber = '"+ fnumber +"'");
		if(flights.size() != 0){
			return true;
		}
		return false;
	}
	
	//获得hibernate模板
	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void updateFlight(String oldFnumber, String fnumber,
			String fcompany, String ftype, String fplacefrom,
			String fdestination, String fdeparturedate, String fdeparturetime,
			String ffalltime, String fprice) {
		System.out.println(".....");
		hibernateTemplate.bulkUpdate("update Flight set fnumber = '" + fnumber +"' ,"
				+ " fcompany       = '" + fcompany +"',"
				+ " ftype          = '" + ftype +"',"
				+ " fplacefrom     = '" + fplacefrom +"',"
				+ " fdestination   = '" + fdestination +"',"
				+ " fdeparturedate = '" + fdeparturedate +"',"
				+ " fdeparturetime = '" + fdeparturetime +"',"
				+ " ffalltime      = '" + ffalltime +"',"
				+ " fprice         = '" + fprice +"'"
				+ " where fnumber  = '" +oldFnumber+"'");
	}

	public void deleteFlight(String fnumber) {
		Flight flight = hibernateTemplate.load(Flight.class, fnumber);
		hibernateTemplate.delete(flight);
	}

}
