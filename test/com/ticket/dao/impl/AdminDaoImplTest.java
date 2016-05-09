package com.ticket.dao.impl;




import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ticket.dao.AdminDao;
import com.ticket.model.Admin;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class AdminDaoImplTest {
	
	
	//@Resource
	AdminDao adminDao = new AdminDaoImpl();

	//@Test
	public void test() {
		
		Admin admin = adminDao.alogin("admin", "admin");
		System.out.println(admin.getAname()+","+ admin.getApassword());
	}

}
