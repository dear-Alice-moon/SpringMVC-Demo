package com.moon.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index2() {
		return "index";
	}
	
	@RequestMapping(value = "/redirect", method = RequestMethod.GET)
	public String redirect2() {
		return "redirect:finalPage";
	}
	
	@RequestMapping(value = "/finalPage", method = RequestMethod.GET)
	public String finalPage2() {
		return "final";
	}
	
	
}
