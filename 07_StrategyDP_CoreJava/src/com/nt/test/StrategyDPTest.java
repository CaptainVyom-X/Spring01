package com.nt.test;

import com.nt.comp.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		Flipkart fkart = null;
		String msg = null;

		// get target class object injected with dependent class object
		fkart = FlipkartFactory.getInstance("bdart");
		
		// invoke b.logic
		msg = fkart.shopping(new String[] { "EarBuds", "HeadPhones", "MobileCharger" },
				new float[] { 2000.0f, 1500.0f, 1000.0f });
		
		System.out.println(msg);
	}

}
