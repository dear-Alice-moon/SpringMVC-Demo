package com.moon.el.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("itemBean3")
public class Item2 {
	
	@Value("云中鹤")
	private String name;
	
	@Value("17")
	private Integer qty;
	
	
	/**
	 * 重写 toString() 函数  
	 */
	@Override
	public String toString() {
		return "Item [name=" + name + ", qty=" + qty + "]";
	}
	
	/**
	 * 全参构造函数 
	 * 
	 * @param name
	 * @param qty
	 */
	public Item2(String name, Integer qty) {
		super();
		this.name = name;
		this.qty = qty;
	}

	/**
	  * 无参构造函数
	 */
	public Item2() {
		super();
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

}
