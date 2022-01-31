package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Employee1;
import com.nt.beans.Employee2;

public class DependencyInjectionTest1 {

	public static void main(String[] args) {
		FileSystemResource resource = null;
		BeanFactory factory = null;
		Employee1 emp1 = null;
		Employee2 emp2 = null;

		// locate & hold spring bean cfg file
		resource = new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		// create ioc container
		factory = new XmlBeanFactory(resource);
		// get target class Employee1 object
		emp1 = (Employee1) factory.getBean("e1");
		System.out.println(emp1);
		System.out.println("------------------------");
		// get target class Employee2 object
		emp2 = (Employee2) factory.getBean("e2");
		System.out.println(emp2);
	}// main(-)

}// class
