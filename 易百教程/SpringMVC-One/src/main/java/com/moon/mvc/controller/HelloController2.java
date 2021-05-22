package com.moon.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController2 {
	
	@RequestMapping(value = "/hello2", method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		
		model.addAttribute("message", "Hello two SpringMVC Framework!");
		return "helloView2";  // 返回值为：包含要用于渲染模型的视图的名称
	}
	
}
