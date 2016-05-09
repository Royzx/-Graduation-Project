package com.ticket.service.impl;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ticket.model.Admin;
import com.ticket.service.AdminService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class AdminServiceImplTest{

	private AdminService adminService;
	
	@Test
	public void test(){
		//调用adminimpl的alogin方法
		Admin a =  adminService.alogin("admin","admin");
		System.out.println(a);
	}

	@Resource
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}


}
