package com.moon.mvc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		
		User user = new User();
		user.setFavoriteFrameworks(new String[] { "SpringMVC", "Struts2" });
		user.setGender("M");

		ModelAndView modelAndView = new ModelAndView("user2", "command", user);
		
		return modelAndView;
	}
	
	
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("SpringWeb") User user, ModelMap model) {

		model.addAttribute("username", user.getUsername());
		model.addAttribute("password", user.getPassword());
		model.addAttribute("address", user.getAddress());
		model.addAttribute("receivePaper", user.isReceivePaper());
		model.addAttribute("favoriteFrameworks", user.getFavoriteFrameworks());
		model.addAttribute("gender", user.getGender());
		model.addAttribute("favoriteNumber", user.getFavoriteNumber());
		model.addAttribute("country", user.getCountry());
		model.addAttribute("skills", user.getSkills());
		
		return "userList";
	}

	@ModelAttribute("webFrameworkList")
	public List<String> getWebFrameworkList() {

		List<String> webFrameworkList = new ArrayList<String>();
		webFrameworkList.add("SpringMVC");
		webFrameworkList.add("SpringBoot");
		webFrameworkList.add("Struts2");
		webFrameworkList.add("Apache Hadoop");

		return webFrameworkList;
	}

	@ModelAttribute("numbersList")
	public List<String> getNumbersList() {

		List<String> numbersList = new ArrayList<String>();
		numbersList.add("1");
		numbersList.add("2");
		numbersList.add("3");
		numbersList.add("4");

		return numbersList;
	}

	@ModelAttribute("countryList")
	public Map<String, String> getCountryList() {

		Map<String, String> countryList = new HashMap<String, String>();
		countryList.put("US", "United States");
		countryList.put("CH", "China");
		countryList.put("SG", "Singapore");
		countryList.put("MY", "Malaysia");

		return countryList;
	}
	
	
	@ModelAttribute("skillsList")
	public Map<String, String> getSkillsList() {
		
		Map<String, String> skillList = new HashMap<String, String>();
		skillList.put("Hibernate", "Hibernate");
		skillList.put("HTML5", "HTML5");
		skillList.put("Apache Hadoop", "Apache Hadoop");
		skillList.put("KafKa", "KafKa");
		
		return skillList;
	}
	
	
}
