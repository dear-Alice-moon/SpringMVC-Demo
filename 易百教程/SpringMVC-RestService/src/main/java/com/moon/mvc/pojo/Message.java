package com.moon.mvc.pojo;

public class Message {
	
	private String name;
	
	private String text;
	
	
	/**
	 * 重写toString()函数
	 */
	@Override
	public String toString() {
		return "Message [name=" + name + ", text=" + text + "]";
	}
	
	
	/**
	 * 全参构造函数
	 * 
	 * @param name
	 * @param text
	 */
	public Message(String name, String text) {
		super();
		this.name = name;
		this.text = text;
	}
	
	
	/**
	 * 无参构造函数
	 */
	public Message() {
		super();
	}
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
}
