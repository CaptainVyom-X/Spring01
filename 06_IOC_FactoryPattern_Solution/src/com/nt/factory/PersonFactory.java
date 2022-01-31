package com.nt.factory;

import com.nt.comp.Employee;
import com.nt.comp.Food;
import com.nt.comp.Person;
import com.nt.comp.Student;

public class PersonFactory {

	// Static Factory Method having logic of Factory Pattern
	public static Person getPerson(String type) {
		Food food = null;
		// create dependent class object
		food = new Food();
		// create target class object
		Person person = null;
		if (type.equalsIgnoreCase("emp"))
			person = new Employee(food);
		else if (type.equalsIgnoreCase("stud"))
			person = new Student(food);
		else
			throw new IllegalArgumentException("Pass valid person type emp/stud");
		return person;
	}

}
