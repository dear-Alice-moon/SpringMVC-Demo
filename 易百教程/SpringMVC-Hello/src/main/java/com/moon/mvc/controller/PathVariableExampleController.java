package com.moon.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PathVariableExampleController {
	
	@RequestMapping("/web/fe/{sitePrefix}/{language}/document/{id}/{naturalText}")
	public String documentView(Model model,
				@PathVariable(value = "sitePrefix") String sitePrefix,
				@PathVariable(value = "language") String language,
				@PathVariable(value = "id") Long id,
				@PathVariable(value = "naturalText") String naturalText) {
		
		model.addAttribute("sitePrefix", sitePrefix);
		model.addAttribute("language", language);
		model.addAttribute("id", id);
		model.addAttribute("naturalText", naturalText);
		
		String documentName = "Java tutorial for Beginners";
		
		if (id == 8108L) {
			documentName = "SpringMVC for Beginners";
		}
		
		model.addAttribute("documentName", documentName);
		
		System.out.println("----------------- @PathVariable注解测试成功  -----------------");
		
		return "documentView";
	}
	
	
	
	
}
