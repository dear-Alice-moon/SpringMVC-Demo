package com.moon.mvc.pojo;

import java.util.Date;

public class RSSMessage {
	
	private String title;
	
	private String url;
	
	private String summary;
	
	private Date createDate;
	
	
	
	
	/**
	  * 重写 toString() 函数 
	 */
	@Override
	public String toString() {
		return "RSSMessage [title=" + title + ", url=" + url + ", summary=" + summary + ", createDate=" + createDate
				+ "]";
	}
	
	/**
	  * 全参构造函数 
	 * 
	 * @param title
	 * @param url
	 * @param summary
	 * @param createDate
	 */
	public RSSMessage(String title, String url, String summary, Date createDate) {
		super();
		this.title = title;
		this.url = url;
		this.summary = summary;
		this.createDate = createDate;
	}
	
	/**
	  * 无参构造函数 
	 */
	public RSSMessage() {
		super();
	}
	
	
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
}
