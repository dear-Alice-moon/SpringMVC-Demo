package com.moon.mvc.pojo;

public class User {
	
	private String username;
	
	private String password;
	
	
	
	/**
	  * 重写 toString() 函数 
	 */
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	
	/**
	  * 全参构造函数 
	 * 
	 * @param username
	 * @param password
	 */
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	
	/**
	  * 无参构造函数 
	 */
	public User() {
		super();
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
	
}
