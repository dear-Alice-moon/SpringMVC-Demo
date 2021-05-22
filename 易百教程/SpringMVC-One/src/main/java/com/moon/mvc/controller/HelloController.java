package com.moon.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		
		model.addAttribute("message", "Hello SpringMVC Framework!");
		return "helloView";  // 返回值为：包含要用于渲染模型的视图的名称
	}
	
}
