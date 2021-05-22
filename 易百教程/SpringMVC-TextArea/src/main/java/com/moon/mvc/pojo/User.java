package com.moon.mvc.pojo;

public class User {
	
	private Integer id;
	
	private String username;
	
	private String password;
	
	private String address;
	
	
	/**
	  * 重写 toString() 函数 
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", address=" + address + "]";
	}

	/**
	  * 全参构造函数   
	 * 
	 * @param id
	 * @param username
	 * @param password
	 * @param address
	 */
	public User(Integer id, String username, String password, String address) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.address = address;
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
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
