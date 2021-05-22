package com.moon.el.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.moon.el.core.Customer3;

/**
 * Spring EL Bean引用实例
 * 
 * @author moon  2019/05/06  21:08   
 *
 */
public class TestRun3 {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
		
		Customer3 customer = (Customer3) context.getBean("customerBean4"); 
		
		System.out.println("customer为：" + customer.toString());
		
	}
	
}
