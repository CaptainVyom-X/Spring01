package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.CustomerVO;

public class RealTimeDITest {
	public static void main(String[] args) {
		CustomerVO vo = null;
		Scanner scan = null;
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		MainController controller = null;
		String result = null;
		try {
			// create VO
			vo = new CustomerVO();
			// create Scanner connecting to console
			scan = new Scanner(System.in);
			// gather inputs & set to VO object
			System.out.println("Enter Customer Name : ");
			vo.setCustomerName(scan.nextLine());
			System.out.println("Enter Customer Address : ");
			vo.setCustomerAddr(scan.nextLine());
			System.out.println("Enter Principal Amt : ");
			vo.setPrincipalAmt(scan.nextLine());
			System.out.println("Enter Interest Amt : ");
			vo.setRateOfInterest(scan.nextLine());
			System.out.println("Enter Time (in months) : ");
			vo.setTime(scan.nextLine());
			// create ioc container
			factory = new DefaultListableBeanFactory();
			reader = new XmlBeanDefinitionReader(factory);
			reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
			// get controller class object
			controller = factory.getBean("ctrl", MainController.class);
			// invoke method
			result = controller.processCustomer(vo);
			System.out.println(result);
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Internal Error. Try Again" + e.getMessage());
		}
	}// main(-)

}// class
