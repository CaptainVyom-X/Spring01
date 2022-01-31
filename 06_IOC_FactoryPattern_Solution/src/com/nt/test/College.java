package com.nt.test;

import com.nt.comp.Student;
import com.nt.factory.PersonFactory;

public class College {

	public static void main(String[] args) {
		Student student = null;

		// College needs Student

		// get target class object
		student = (Student) PersonFactory.getPerson("stud");

		// invoke b.logic
		System.out.println(student.work());
	}

}
