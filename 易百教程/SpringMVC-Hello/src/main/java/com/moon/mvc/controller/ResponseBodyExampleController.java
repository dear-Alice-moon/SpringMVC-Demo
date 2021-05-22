package com.moon.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResponseBodyExampleController {
	
	
	@RequestMapping(value = "/saveResult", method = RequestMethod.GET)
	@ResponseBody
	public String authorInfo(Model model) {
		
		System.out.println("----------------- @ResponseBody测试成功 -----------------");
		
		return "saved...";
	}
	
}
