package com.moon.mvc.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.moon.mvc.pojo.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping(value = "{name}", method = RequestMethod.GET)
	@ResponseBody
	public User getUser(@PathVariable String name) {
		
		User user = new User();
		user.setId(1);
		user.setName(name);
		user.setCreateDate(new Date());
		
		return user;
	}
	
	
}	
