package com.moon.mvc.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moon.mvc.pojo.Message;
import com.moon.mvc.pojo.Message2;

@RestController
public class HelloWorldRestController {
	
	
	@RequestMapping("/hello/{player}")
	public Message message(@PathVariable String player) {
		
		Message msg = new Message(player, "Hello " + player);
		
		return msg;
	}
	
	
	@RequestMapping("/hello2/{player}")
	public Message2 message2(@PathVariable String player) {
		
		Message2 msg = new Message2(player, "Hello " + player);
		
		return msg;
	}
	
}
