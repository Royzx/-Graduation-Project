package com.ticket.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ticket.dao.AdminDao;
import com.ticket.model.Admin;
import com.ticket.service.AdminService;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

	private AdminDao adminDao;
	
	public Admin alogin(String aname, String apassword) {
		//调用adminimpl的alogin方法
		return adminDao.alogin(aname, apassword);
	}

	//设值注入admindaoimpl
	@Resource
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}



}
