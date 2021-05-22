package com.moon.mvc.pojo;

import java.math.BigDecimal;

public class User {
	
	private Long id;
	
	private String name;
	
	private Integer age;
	
	/**
	 * 薪资
	 * 
	 */
	private BigDecimal salary;
	
	
	
	/**
	 * 重写toString()函数 
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
	/**
	 * 全参构造函数
	 * 
	 * @param id
	 * @param name
	 * @param age
	 * @param salary
	 */
	public User(Long id, String name, Integer age, BigDecimal salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	
	/**
	 * 无参构造函数 
	 */
	public User() {
		super();
	}
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
	
	public BigDecimal getSalary() {
		return salary;
	}
	
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	
}
