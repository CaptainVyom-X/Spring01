package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comp.Flipkart;

public class StrategyDPTest {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		Flipkart fkart = null;
		String msg = null;

		// create IOC container
		ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		// get target class object
		fkart = ctx.getBean("fk", Flipkart.class);
		// invoke b.method
		msg = fkart.shopping(new String[] { "EarBuds", "HeadPhones", "MobileCharger" },
				new float[] { 2000.0f, 1500.0f, 1000.0f });
		System.out.println(msg);
		// close ioc container
		((AbstractApplicationContext) ctx).close();
	}// main(-)

}// class
