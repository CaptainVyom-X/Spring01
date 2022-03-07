package com.nt.sdp;

public class Printer {

	// 2-static reference variable
	private static Printer INSTANCE;

	// 1-private constructor
	private Printer() {
		System.out.println("Printer : 0-param constructor");
	}

	// 3-public static factory method
	public static Printer getPrinter() {
		if (INSTANCE == null)
			INSTANCE = new Printer();
		return INSTANCE;
	}

	// b.method
	public void print(String msg) {
		System.out.println(msg);
	}

}// class
