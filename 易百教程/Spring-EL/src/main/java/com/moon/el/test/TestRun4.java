package com.moon.el.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.moon.el.core.Customer4;

public class TestRun4 {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans3.xml");
		
		Customer4 customer = (Customer4) context.getBean("customerBean5");
		System.out.println("customer为： " + customer.toString());
	}
	
}
