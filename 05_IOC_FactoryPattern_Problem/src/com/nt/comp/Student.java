package com.nt.comp;

public class Student extends Person {

	private String course;
	private float fee;
	private Food food;

	public Student(Food food) {
		System.out.println("Student : one-param constructor");
		this.food = food;
	}

	public String work() {
		return "Student is studing by " + food;
	}

}
