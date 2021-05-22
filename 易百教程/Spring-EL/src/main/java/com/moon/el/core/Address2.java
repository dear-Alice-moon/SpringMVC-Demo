package com.moon.el.core;

public class Address2 {
	
	private String street;
	
	private Integer postCode;
	
	private String country;
	
	
	
	public String getFullAddress(String prefix) {
		
		return prefix + " : " + street + " " + postCode + " " + country;
	}
	
	
	/**
	 * 重写 toString() 函数 
	 */
	@Override
	public String toString() {
		return "Address [street=" + street + ", postCode=" + postCode + ", country=" + country + "]";
	}
	
	/**
	 * 全参构造函数  
	 * 
	 * @param street
	 * @param postCode
	 * @param country
	 */
	public Address2(String street, Integer postCode, String country) {
		super();
		this.street = street;
		this.postCode = postCode;
		this.country = country;
	}
	
	/**
	 * 无参构造函数 
	 */
	public Address2() {
		super();
	}
	
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getPostCode() {
		return postCode;
	}

	public void setPostCode(Integer postCode) {
		this.postCode = postCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	} 
	
}
