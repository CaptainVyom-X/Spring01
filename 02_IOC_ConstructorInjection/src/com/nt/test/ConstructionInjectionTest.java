package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class ConstructionInjectionTest {

	public static void main(String[] args) {
		FileSystemResource resource = null;
		BeanFactory factory = null;
		WishMessageGenerator generator = null;
		String result = null;

		// locate & hold spring bean cfg file
		resource = new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		// create ioc container
		factory = new XmlBeanFactory(resource);
		// get target class obj
		generator = (WishMessageGenerator) factory.getBean("wmg");
		// invoke b.logic
		result = generator.generateWishMessage("Sri Rama");
		System.out.println(result);
	}// main(-)

}// class
