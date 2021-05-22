package com.moon.mvc.pojo;

public class User {
	
	private Integer id;
	
	private String name;
	
	
	
	/**
	  * 重写 toString() 函数  
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	/**
	  * 全参构造函数  
	 * 
	 * @param id
	 * @param name
	 */
	public User(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	/**
	  * 无参构造函数
	 */
	public User() {
		super();
	}
	
	
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
