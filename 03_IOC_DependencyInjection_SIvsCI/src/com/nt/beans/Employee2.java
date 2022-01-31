package com.nt.beans;

public class Employee2 {

	private int eno;
	private String ename;
	private String desg;
	private double sal;

	public Employee2(int eno, String ename, String desg, double sal) {
		System.out.println("Employee2 : four-param constructor");
		this.eno = eno;
		this.ename = ename;
		this.desg = desg;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee2 [eno=" + eno + ", ename=" + ename + ", desg=" + desg + ", sal=" + sal + "]";
	}

}
