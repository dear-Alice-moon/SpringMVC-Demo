package com.moon.el.core;

public class Customer {
	
	private Item item;
	
	private String itemName;
	
	
	
	
	/**
	 * 重写 toString() 函数 
	 */
	@Override
	public String toString() {
		return "Customer [item=" + item + ", itemName=" + itemName + "]";
	}
	
	/**
	 * 全参构造函数          
	 * 
	 * @param item
	 * @param itemName
	 */
	public Customer(Item item, String itemName) {
		super();
		this.item = item;
		this.itemName = itemName;
	}
	
	/**
	 * 无参构造函数 
	 */
	public Customer() {
		super();
	}
	
	
	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
}
