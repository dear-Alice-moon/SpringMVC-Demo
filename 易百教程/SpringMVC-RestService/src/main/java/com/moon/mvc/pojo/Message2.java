package com.moon.mvc.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "pizza")
public class Message2 {
	
	private String name;
	
	private String text;
	
	
	
	/**
	 * 重写toString()函数
	 */
	@Override
	public String toString() {
		return "Message2 [name=" + name + ", text=" + text + "]";
	}
	
	/**
	 * 全参构造函数 
	 * 
	 * @param name
	 * @param text
	 */
	public Message2(String name, String text) {
		super();
		this.name = name;
		this.text = text;
	}
	
	/**
	 * 无参构造函数
	 */
	public Message2() {
		super();
	}
	
	
	
	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
}
