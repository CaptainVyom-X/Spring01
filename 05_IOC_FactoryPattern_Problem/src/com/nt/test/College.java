package com.nt.test;

import com.nt.comp.Food;
import com.nt.comp.Student;

public class College {

	public static void main(String[] args) {
		Food food = null;
		Student student = null;
		
		//College needs Student
		
		// create dependent class object
		food = new Food();
		
		// create target class object
		student = new Student(food);
		
		// invoke b.logic
		System.out.println(student.work());
	}

}
