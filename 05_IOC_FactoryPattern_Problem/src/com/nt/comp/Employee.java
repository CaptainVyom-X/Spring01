package com.nt.comp;

public class Employee extends Person {

	private String desg;
	private float salary;
	private Food food;

	public Employee(Food food) {
		System.out.println("Employee : one-param constructor");
		this.food = food;
	}

	public String work() {
		return "Employee is working by " + food;
	}

}
