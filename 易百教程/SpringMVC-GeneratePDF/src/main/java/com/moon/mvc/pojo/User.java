package com.moon.mvc.pojo;

public class User {
	
	private Integer id;
	
	private String name;
	
	private Integer age;
	
	
	
	/**
	 * 重写toString() 函数  
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	/**
	  * 全参构造函数 
	 * @param id
	 * @param name
	 * @param age
	 */
	public User(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
}
