package com.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class WelcomeController {
	
	@GetMapping("/welcome")
	public ModelAndView displayWelcomeMsg() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","Welcome To Spring MVC ....!!!");
		//Value should be render in this View file(index)
		mav.setViewName("index");
		return mav;
	}
	
	
	//@GetMapping("/greet")
	@RequestMapping(value="/greet",method=RequestMethod.GET)
	public ModelAndView displayGreetMsg() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","Good Morning....!!!");
		//Value should be render in this View file(index)
		mav.setViewName("index");
		return mav;
	}
}
