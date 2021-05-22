package com.moon.el.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.moon.el.core.Customer;
import com.moon.el.core.Item;

/**
 * 使用XML配置测试 Spring EL表达式
 * 
 * @author moon  2019/05/06  17:25  
 *
 */
public class TestRun {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Item item = new Item("张三", 25);
		
		Item itemBean = (Item) context.getBean("itemBean");
		itemBean.setName("李四");
		itemBean.setQty(18);
		
		Customer customer = (Customer) context.getBean("customerBean");
		System.out.println("cunstomer为： " + customer.toString()); // cunstomer为： Customer [item=Item [name=李四, qty=18], itemName=null]
		
		
		System.out.println("----------------------------------- 第二种测试 -----------------------------------");
		
		Customer customer2 = (Customer) context.getBean("customerBean2");
		System.out.println("customer2为： " + customer2.toString());
		
	}
	
}
