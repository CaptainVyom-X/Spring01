package com.nt.beans;

public class A {

	private B b;

	public A() {
		System.out.println("A : 0-param constructor");
	}

	public A(B b) {
		System.out.println("A : one-param constructor");
		this.b = b;
	}

	public void setB(B b) {
		System.out.println("A.setB()");
		this.b = b;
	}

	@Override
	public String toString() {
		return "from A";
	}

}
