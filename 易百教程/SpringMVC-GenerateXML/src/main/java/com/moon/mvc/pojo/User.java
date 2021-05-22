package com.moon.mvc.pojo;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "user")
public class User {
	
	private Integer id;
	
	private String name;
	
	private Date createDate;
	
	
	
	/**
	 * 重写 toString() 函数  
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", createDate=" + createDate + "]";
	}
	
	/**
	 * 全参构造函数  
	 * 
	 * @param id
	 * @param name
	 * @param createDate
	 */
	public User(Integer id, String name, Date createDate) {
		super();
		this.id = id;
		this.name = name;
		this.createDate = createDate;
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
	
	@XmlElement
	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public Date getCreateDate() {
		return createDate;
	}
	
	@XmlElement
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
}
