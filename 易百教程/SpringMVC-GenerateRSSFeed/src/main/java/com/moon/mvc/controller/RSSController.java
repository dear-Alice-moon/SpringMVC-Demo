package com.moon.mvc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.moon.mvc.pojo.RSSMessage;


@Controller
public class RSSController {
	
	
	@RequestMapping(value = "/rssfeed", method = RequestMethod.GET)
	public ModelAndView getFeedInRss() {
		
		List<RSSMessage> items = new ArrayList<RSSMessage>();
		
		RSSMessage content = new RSSMessage();
		content.setTitle("Spring教程");
		content.setUrl("http://www.yiibai/spring");
		content.setSummary("Spring tutorial summary...");
		content.setCreateDate(new Date());
		items.add(content);
		
		
		RSSMessage content2 = new RSSMessage();
		content2.setTitle("SpringMVC教程");
		content2.setUrl("http://www.yiibai/spring_mvc");
		content2.setSummary("SpringMVC tutorial summary...");
		content2.setCreateDate(new Date());
		items.add(content2);
		
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("rssViewer");
		mav.addObject("feedContent", items);
		
		return mav;
	}
	
	
}
