package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {

	private Courier courier;

	public Flipkart() {
		System.out.println("Flipkart : 0-param constructor");
	}

	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier = courier;
	}

	public String shopping(String[] items, float[] prices) {
		int orderId = 0;
		float billAmt = 0.0f;
		String msg = null;

		// generate order id
		orderId = new Random().nextInt(10000);
		// calculate bill amount
		for (float p : prices)
			billAmt += p;

		// use courier
		msg = courier.delivery(orderId);
		return "Order for " + Arrays.toString(items) + " with prices " + Arrays.toString(prices) + " bill amt "
				+ billAmt + " " + msg;
	}

}
