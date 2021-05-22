package com.moon.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		
		model.addAttribute("message", " '/hello'请求， SpringMVC资源绑定视图解析器......");
		
		return "hello2";
		// return "hello3";  // 通过该行代码进行测试，发现 views-test.properties 文件不起作用!    2019/05/31  15:13   
	}
	
	
	@RequestMapping(value = "/hello3", method = RequestMethod.GET)
	public String printHello3(ModelMap model) {
		
		model.addAttribute("message", " '/hello3'请求， SpringMVC资源绑定视图解析器! ");
		
		return "hello3";
	}
	
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String printTest(ModelMap model) {
		
		model.addAttribute("test_message", " '/test'请求，用来测试!");
		
		return "test2";
	}
	
	
}
