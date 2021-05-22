package com.moon.mvc.pojo;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

public class Student {
	
	private Integer id;
	
	@Range(min = 1, max = 150)
	private Integer age;
	
	@NotEmpty
	private String name;
	
	/**
	  * 重写 toString() 函数 
	 */
	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	
	/**
	  * 全参构造函数 
	 * 
	 * @param id
	 * @param age
	 * @param name
	 */
	public Student(Integer id, Integer age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	
	/**
	  * 无参构造函数  
	 */
	public Student() {
		super();
	}
	
	
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
