package com.nt.test;

import java.util.Arrays;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Printer;
import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest1 {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		WishMessageGenerator wmg1 = null;
		WishMessageGenerator wmg2 = null;
		Printer p1 = null;
		Printer p2 = null;
		Printer p3 = null;
		// create ioc container
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");

		System.out.println("--IOC Container created--");

		// get target bean class object
		/*wmg1 = factory.getBean("wmg", WishMessageGenerator.class);
		wmg2 = factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println(wmg1.hashCode() + " " + wmg2.hashCode());
		System.out.println("wmg1==wmg2 ? " + (wmg1 == wmg2));
		
		System.out.println("------------------------------");
		p1 = factory.getBean("pt1", Printer.class);
		p2 = factory.getBean("pt1", Printer.class);
		System.out.println(p1.hashCode() + " " + p2.hashCode());
		System.out.println("p1==p2 ? " + (p1 == p2));
		
		p3 = factory.getBean("pt2", Printer.class);
		System.out.println(p3.hashCode());
		
		System.out.println("------------------------------");
		System.out.println("beans count : " + factory.getBeanDefinitionCount());
		System.out.println("all beans IDs : " + Arrays.toString(factory.getBeanDefinitionNames()));
		*/
	}// main(-)

}// class
