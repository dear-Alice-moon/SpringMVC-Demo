package com.moon.el.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.moon.el.core.Customer2;

/**
 * 使用注解方式测试 Spring EL表达式 
 * 
 * @author moon  2019/05/06  17:28  
 *
 */
public class TestRun2 {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
		
		Customer2 customer2 = (Customer2) context.getBean("customerBean3");
		System.out.println("customer2为： " + customer2.toString());
		
	}
	
}
