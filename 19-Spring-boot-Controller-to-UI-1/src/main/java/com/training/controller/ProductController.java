package com.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.training.pojo.Product;

@Controller
public class ProductController {
	
	@GetMapping("/productdata")
	public ModelAndView getProductData() {
		ModelAndView mav= new ModelAndView();
		
		Product pobj= new Product();
		pobj.setProductId(101);
		pobj.setProductName("KeyBoard");
		pobj.setProductPrice(1500.00);
		//Adding pobj to Model in key values format
		mav.addObject("product",pobj);
		
		//setting logical name
		mav.setViewName("product-data");
		
		return mav;
	}

}
