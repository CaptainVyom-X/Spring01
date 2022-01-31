package com.nt.test;

import com.nt.comp.Employee;
import com.nt.comp.Food;

public class Company {

	public static void main(String[] args) {
		Food food = null;
		Employee emp = null;

		// Company needs Employee

		// create dependent class object
		food = new Food();

		// create target class object
		emp = new Employee(food);

		// invoke b.logic
		System.out.println(emp.work());
	}

}
