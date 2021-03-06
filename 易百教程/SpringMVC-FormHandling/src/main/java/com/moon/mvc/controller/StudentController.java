package com.moon.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.moon.mvc.pojo.Student;


@Controller
public class StudentController {
	
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public ModelAndView student() {
		
		return new ModelAndView("student", "command", new Student());
		// return new ModelAndView("Test", "command", new Student());  // 该ModelAndView(...)函数中，第一个参数用来指定跳转到那一个jsp页面的jsp页面文件名.
	}
	
	
	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("SpringWeb") Student student, ModelMap model) {
		
		model.addAttribute("name", student.getName());
		model.addAttribute("age", student.getAge()); 
		model.addAttribute("id", student.getId());
		
		return "result";
	}
	
	
}
