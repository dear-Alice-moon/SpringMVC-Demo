package com.moon.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloWorldController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String sayHello(ModelMap model) {
		
		model.addAttribute("greeting", "Hello World from Spring4 MVC");
		
		return "welcome";
	}
	
	
	@RequestMapping(value = "/helloAgain", method = RequestMethod.GET)
	public String sayHelloAgain(ModelMap model) {
		
		model.addAttribute("greeting", "Hello World Again, from Spring4 MVC");
		
		return "welcome";
	}
	
}
