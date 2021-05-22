package com.moon.mvc.pojo;

import java.util.Arrays;

public class User {
	
	private String username;
	
	private String password;
	
	private String address;
	
	private boolean receivePaper;
	
	private String[] favoriteFrameworks;
	
	
	
	
	/**
	 * 重写 toString() 函数  
	 */
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", address=" + address + ", receivePaper="
				+ receivePaper + ", favoriteFrameworks=" + Arrays.toString(favoriteFrameworks) + "]";
	}
	
	/**
	 * 全参构造函数   
	 * 
	 * @param username
	 * @param password
	 * @param address
	 * @param receivePaper
	 * @param favoriteFrameworks
	 */
	public User(String username, String password, String address, boolean receivePaper, String[] favoriteFrameworks) {
		super();
		this.username = username;
		this.password = password;
		this.address = address;
		this.receivePaper = receivePaper;
		this.favoriteFrameworks = favoriteFrameworks;
	}
	
	/**
	 * 重写 toString() 函数  
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isReceivePaper() {
		return receivePaper;
	}

	public void setReceivePaper(boolean receivePaper) {
		this.receivePaper = receivePaper;
	}

	public String[] getFavoriteFrameworks() {
		return favoriteFrameworks;
	}

	public void setFavoriteFrameworks(String[] favoriteFrameworks) {
		this.favoriteFrameworks = favoriteFrameworks;
	}
	
	
}
