package com.nt.test;

import com.nt.comp.Employee;
import com.nt.factory.PersonFactory;

public class Company {

	public static void main(String[] args) {
		Employee emp = null;
		
		// Company needs Employee

		// create target class object
		emp = (Employee) PersonFactory.getPerson("emp");

		// invoke b.logic
		System.out.println(emp.work());
	}

}
