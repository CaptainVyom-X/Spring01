package com.nt.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.nt.comp.Courier;
import com.nt.comp.Flipkart;

public class FlipkartFactory {

	private static Properties props;

	static {
		InputStream is = null;
		try {
			is = new FileInputStream("src/com/nt/commons/inputs.properties");
			// load properties file content into Properties collection
			props = new Properties();
			props.load(is);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} // catch
	}// static

	// Static Factory Method having Factory Pattern logic
	public static Flipkart getInstance() {
		String courierClassName = null;
		Class clazz = null;
		Constructor[] cons = null;
		Courier courier = null;
		Flipkart fkart = null;
		try {
			// get courier type class name
			courierClassName = props.getProperty("courier.type");
			// load courier type class
			clazz = Class.forName(courierClassName);
			courier = (Courier) clazz.newInstance();// deprecated since Java9
			// get all constructors of the class
			cons = clazz.getDeclaredConstructors();
			// create dependent class object
			courier = (Courier) cons[0].newInstance();
			// create target class object
			fkart = new Flipkart();
			// assign dependent class object to target class object
			fkart.setCourier(courier);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} // catch
		return fkart;
	}// getInstance()

}// class
