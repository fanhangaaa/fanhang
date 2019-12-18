package com.woniu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.IDeptDAO;
import com.woniu.pojo.Dept;
import com.woniu.service.IDeptService;
@Service
@Transactional
public class DeptServiceImpl implements IDeptService {
	public DeptServiceImpl() {
		// TODO Auto-generated constructor stub
		System.out.println("DeptServiceImpl.DeptServiceImpl()");
	}
	@Autowired
	IDeptDAO deptDAO;
	
	public IDeptDAO getDeptDAO() {
		return deptDAO;
	}

	public void setDeptDAO(IDeptDAO deptDAO) {
		this.deptDAO = deptDAO;
	}

	@Override
	public void save(Dept dept) {
		deptDAO.save(dept);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		deptDAO.delete(id);
	}

}
