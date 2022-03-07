package com.nt.test;

import com.nt.sdp.Printer;

public class SingletonTest {
	public static void main(String[] args) {
		Printer p1 = null;
		Printer p2 = null;
		p1 = Printer.getPrinter();
		p2 = Printer.getPrinter();

		System.out.println("p1==p2? " + (p1 == p2));
		System.out.println(p1.hashCode() + " " + p2.hashCode());
	}
}
