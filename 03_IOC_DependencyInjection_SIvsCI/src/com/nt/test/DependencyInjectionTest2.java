package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Employee1;
import com.nt.beans.Employee2;

public class DependencyInjectionTest2 {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		Employee1 emp1 = null;
		Employee2 emp2 = null;

		// create ioc container
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		// get target class Employee1 object
		emp1 = (Employee1) factory.getBean("e1");
		System.out.println(emp1);
		System.out.println("------------------------");
		
		// get target class Employee2 object
		emp2 = (Employee2) factory.getBean("e2");
		System.out.println(emp2);
	}// main(-)

}// class
