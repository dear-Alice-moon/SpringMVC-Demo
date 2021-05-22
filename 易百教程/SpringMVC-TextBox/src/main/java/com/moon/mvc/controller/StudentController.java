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
		return new ModelAndView("student2", "command", new Student());
	}
	
	
	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("SpringWeb")Student student, ModelMap model) {
		
		model.addAttribute("id2", student.getId());
		model.addAttribute("name2", student.getName());
		model.addAttribute("age2", student.getAge());
		
		return "result";
	}
	
}
