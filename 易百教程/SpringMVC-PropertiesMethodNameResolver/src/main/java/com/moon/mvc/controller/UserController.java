package com.moon.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class UserController	extends MultiActionController {
	
	
	public ModelAndView home(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView model = new ModelAndView("user");
		model.addObject("message", "主页面的(Home方法)");
		
		return model;
	}
	
	
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView model = new ModelAndView("user");
		model.addObject("message", "添加(add方法)");
		
		return model;
	}
	
	
	public ModelAndView remove(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView model = new ModelAndView("user");
		model.addObject("message", "删除(Remove方法)");
		
		return model;
	}
	
}
