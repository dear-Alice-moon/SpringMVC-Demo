package com.moon.el.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customerBean4")
public class Customer3 {
	
	@Value("#{addressBean}")
	private Address address;
	
	@Value("#{addressBean.country}")
	private String country;
	
	@Value("#{addressBean.getFullAddress('yiibai')}")
	private String fullAddress;
	
	
	
	/**
	 * 重写 toString() 函数  
	 */
	@Override
	public String toString() {
		return "Customer3 [address=" + address + ", country=" + country + ", fullAddress=" + fullAddress + "]";
	}
	
	/**
	 * 全参构造函数 
	 * 
	 * @param address
	 * @param country
	 * @param fullAddress
	 */
	public Customer3(Address address, String country, String fullAddress) {
		super();
		this.address = address;
		this.country = country;
		this.fullAddress = fullAddress;
	}
	
	/**
	 * 无参构造函数  
	 */
	public Customer3() {
		super();
	}
	
	
	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
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
