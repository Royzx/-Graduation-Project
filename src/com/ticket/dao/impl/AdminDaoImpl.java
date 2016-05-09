package com.ticket.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ticket.dao.AdminDao;
import com.ticket.model.Admin;

@Repository("adminDao")
public class AdminDaoImpl implements AdminDao {

	private HibernateTemplate hibernateTemplate;
	
	@Override
	public Admin alogin(String aname, String apassword) {
		@SuppressWarnings("unchecked")
		List<Admin> admins = (List<Admin>)hibernateTemplate.find("from Admin a where a.aname = '"+ aname +"' and a.apassword = '"+apassword+"'  " );
		if(admins.size() != 0){
			return admins.get(0);
		}
		else{
			return null;
		}
	}

    
	//获取事务模板
	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


}
