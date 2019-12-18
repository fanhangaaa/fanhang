package com.woniu.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.woniu.pojo.Dept;
import com.woniu.service.IDeptService;
@Controller
public class DeptAction {
	public DeptAction(){
		System.out.println("DeptAction.DeptAction()");
	}
	private Dept dept;
	@Autowired
	private IDeptService deptService;
	
	public void setDeptService(IDeptService deptService) {
		this.deptService = deptService;
	}

	public IDeptService getDeptService() {
		return deptService;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}
	
	public String save(){
		System.out.println(dept);
		deptService.save(dept);
		return "ok";
	}
}
