package com.moon.el.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customerBean3")
public class Customer2 {
	
	@Value("#{itemBean3}")
	private Item2 item;
	
	@Value("#{itemBean3.name}")
	private String itemName;
	
	
	
	
	@Override
	public String toString() {
		return "Customer2 [item=" + item + ", itemName=" + itemName + "]";
	}

	/**
	 * 全参构造函数  
	 * 
	 * @param item
	 * @param itemName
	 */
	public Customer2(Item2 item, String itemName) {
		super();
		this.item = item;
		this.itemName = itemName;
	}

	/**
	 * 无参构造函数  
	 */
	public Customer2() {
		super();
	}
	
	
	public Item2 getItem() {
		return item;
	}
	
	public void setItem(Item2 item) {
		this.item = item;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
}
