package com.moon.el.core;

public class Customer4 {
	
	private Address2 address;
	
	private String country;
	
	private String fullAddress;
	
	
	
	/**
	  * 重写 toString() 函数  
	 */
	@Override
	public String toString() {
		return "Customer4 [address=" + address + ", country=" + country + ", fullAddress=" + fullAddress + "]";
	}
	
	/**
	  * 全参构造函数  
	 * 
	 * @param address
	 * @param country
	 * @param fullAddress
	 */
	public Customer4(Address2 address, String country, String fullAddress) {
		super();
		this.address = address;
		this.country = country;
		this.fullAddress = fullAddress;
	}
	
	/**
	  * 无参构造函数 
	 */
	public Customer4() {
		super();
	}
	
	
	
	
	public Address2 getAddress() {
		return address;
	}

	public void setAddress(Address2 address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFullAddress() {
		return fullAddress;
	}

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}
	
}
