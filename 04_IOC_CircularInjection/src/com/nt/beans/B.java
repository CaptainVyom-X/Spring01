package com.nt.beans;

public class B {

	private A a;

	public B() {
		System.out.println("B : 0-param constructor");
	}

	public B(A a) {
		System.out.println("B : one-param constructor");
		this.a = a;
	}

	public void setA(A a) {
		System.out.println("B.setA()");
		this.a = a;
	}

	@Override
	public String toString() {
		return "from B";
	}

}
