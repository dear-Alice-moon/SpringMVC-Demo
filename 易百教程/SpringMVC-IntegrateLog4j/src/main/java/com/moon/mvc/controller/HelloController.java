package com.moon.mvc.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	private static final Logger logger = Logger.getLogger(HelloController.class);
	
	@RequestMapping(method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		
		logger.info("printHello started!");
		
		if (logger.isDebugEnabled()) {
			logger.debug("Inside: printHello");
		}
		
		// 下行代码会在控制台、log日志中产生一个异常的log日志信息。   @moon  2019/6/21  15:52  
		logger.error("logging a sample exception", new Exception("Testing message!"));
		
		model.addAttribute("message", "Hello SpringMVC Framework!");
		logger.info("printHello ended.");
		
		return "hello";
	}
	
	
}
