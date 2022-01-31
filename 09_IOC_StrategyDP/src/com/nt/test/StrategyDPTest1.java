package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comp.Flipkart;

public class StrategyDPTest1 {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		Flipkart fkart = null;
		String msg = null;

		// create IOC container
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		// get target class object
		fkart = factory.getBean("fk", Flipkart.class);
		
		// invoke b.method
		msg = fkart.shopping(new String[] { "EarBuds", "HeadPhones", "MobileCharger" },
				new float[] { 2000.0f, 1500.0f, 1000.0f });
		System.out.println(msg);
	}// main(-)

}// class
