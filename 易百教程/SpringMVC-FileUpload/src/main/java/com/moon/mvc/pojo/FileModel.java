package com.moon.mvc.pojo;

import org.springframework.web.multipart.MultipartFile;

public class FileModel {
	
	private MultipartFile file;
	
	
	/**
	  * 重写 toString() 函数 
	 */
	@Override
	public String toString() {
		return "FileModel [file=" + file + "]";
	}
	
	/**
	  * 全参构造函数 
	 * 
	 * @param file
	 */
	public FileModel(MultipartFile file) {
		super();
		this.file = file;
	}
	
	/**
	  * 无参构造函数 
	 */
	public FileModel() {
		super();
	}
	
	
	
	
	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}
	
}
