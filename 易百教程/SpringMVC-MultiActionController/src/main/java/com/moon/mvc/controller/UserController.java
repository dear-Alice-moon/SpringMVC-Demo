package com.moon.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class UserController extends MultiActionController {
	
	
	public ModelAndView home(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView model = new ModelAndView("home");
		model.addObject("message", "Home");
		return model;
	}
	
	
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView model = new ModelAndView("user");
		model.addObject("message", "点击Add()函数后，跳转到 user.jsp 页面。");
		return model;
	}
	
	
	public ModelAndView remove(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView model = new ModelAndView("user");
		model.addObject("message", "点击Remove()函数后，跳转到 user.jsp 页面。");
		
		return model;
	}
	
	
}
