package com.moon.el.core;

public class Item {

	private String name;

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
	public Item(String name, Integer qty) {
		super();
		this.name = name;
		this.qty = qty;
	}

	/**
	  * 无参构造函数
	 */
	public Item() {
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
