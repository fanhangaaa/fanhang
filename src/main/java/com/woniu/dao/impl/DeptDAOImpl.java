package com.woniu.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.IDeptDAO;
import com.woniu.pojo.Dept;
@Repository
public class DeptDAOImpl implements IDeptDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public DeptDAOImpl() {
		// TODO Auto-generated constructor stub
		System.out.println("DeptDAOImpl.DeptDAOImpl()");
	}
	@Override
	public void save(Dept dept) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(dept);
	}
	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(id);
	}
	

}
