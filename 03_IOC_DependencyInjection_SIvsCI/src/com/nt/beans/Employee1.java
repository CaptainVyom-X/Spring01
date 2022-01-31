package com.nt.beans;

public class Employee1 {

	private int eno;
	private String ename;
	private String desg;
	private double sal;

	public Employee1() {
		System.out.println("Employee1 : 0-param constructor");
	}

	public void setEno(int eno) {
		System.out.println("Employee1.setEno()");
		this.eno = eno;
	}

	public void setEname(String ename) {
		System.out.println("Employee1.setEname()");
		this.ename = ename;
	}

	public void setDesg(String desg) {
		System.out.println("Employee1.setDesg()");
		this.desg = desg;
	}

	public void setSal(double sal) {
		System.out.println("Employee1.setSal()");
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee1 [eno=" + eno + ", ename=" + ename + ", desg=" + desg + ", sal=" + sal + "]";
	}

}
