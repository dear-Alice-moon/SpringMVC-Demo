package com.moon.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RedirectExampleController {
	
	@RequestMapping(value = "/redirect02", method = RequestMethod.GET)
	public String authorInfo(Model model) {
		
		System.out.println("------------- 重定向测试成功!  -------------");
		
		return "redirect:/hello";
	}
	
}
