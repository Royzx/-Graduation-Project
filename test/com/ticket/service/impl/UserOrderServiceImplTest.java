package com.ticket.service.impl;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ticket.model.Admin;
import com.ticket.service.AdminService;
import com.ticket.service.UserOrderService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class UserOrderServiceImplTest{

	private UserOrderService userOrderService;
	
	@Test
	public void test(){
		String uname = "user00";
		String fnumber = "f0010";
		userOrderService.saveOrder(uname, fnumber);
	}


	@Resource
	public void setUserOrderService(UserOrderService userOrderService) {
		this.userOrderService = userOrderService;
	}
	


}
