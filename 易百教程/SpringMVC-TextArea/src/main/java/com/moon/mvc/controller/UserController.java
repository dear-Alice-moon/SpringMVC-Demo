package com.moon.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.moon.mvc.pojo.User;

@Controller
public class UserController {
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ModelAndView user() {
		return new ModelAndView("user2", "command", new User());
	}
	
	
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("SpringWeb")User user, ModelMap model) {
		
		model.addAttribute("id2", user.getId());
		model.addAttribute("username2", user.getUsername());
		model.addAttribute("password2", user.getPassword());
		model.addAttribute("address2", user.getAddress());
		
		return "userList";
	}
	
}
