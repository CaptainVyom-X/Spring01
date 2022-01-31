package com.nt.factory;

import com.nt.comp.BlueDart;
import com.nt.comp.Courier;
import com.nt.comp.DTDC;
import com.nt.comp.FedEx;
import com.nt.comp.Flipkart;

public class FlipkartFactory {

	// Static Factory Method having Factory Pattern logic
	public static Flipkart getInstance(String courierType) {
		Courier courier = null;
		Flipkart fkart = null;

		// create dependent class object
		if (courierType.equalsIgnoreCase("bdart"))
			courier = new BlueDart();
		else if (courierType.equalsIgnoreCase("dtdc"))
			courier = new DTDC();
		else if (courierType.equalsIgnoreCase("fedEx"))
			courier = new FedEx();
		else
			throw new IllegalArgumentException("Invalid Courier Type");

		// create taret class object
		fkart = new Flipkart();

		// assign dependent class object to target class object
		fkart.setCourier(courier);

		return fkart;
	}

}
