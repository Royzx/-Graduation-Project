package com.ticket.util;


import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Component;

@Component("dateFormat")
public class DateFormat {

	
	public Date dateFormat(String string){
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = simpleDateFormat.parse(string);			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	public Date timeFormat(String string){
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
		Date date = null;
		try {
			date = simpleDateFormat.parse(string);			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
}
