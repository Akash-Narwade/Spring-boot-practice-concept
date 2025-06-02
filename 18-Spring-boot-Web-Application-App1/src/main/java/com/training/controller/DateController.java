package com.training.controller;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/report")
public class DateController {
	
	@GetMapping("/date")
	public ModelAndView getTodayDate() {
		ModelAndView mav=new ModelAndView();
		Date d= new Date();
		LocalDate ld= LocalDate.now();
		//mav.addObject("msg","Today's date :  "+d);
		mav.addObject("msg","Java8- Local Today's date :  "+ld);
		mav.setViewName("index");;
		return mav;
	}

}
