package com.woniu.pojo;


public class Dept implements java.io.Serializable {

	private Integer deptno;
	private String dname;
	private String loc;

	public Dept() {
	}

	public Dept(Integer deptno) {
		this.deptno = deptno;
	}

	public Dept(Integer deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public Integer getDeptno() {
		return this.deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return this.loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}

}
