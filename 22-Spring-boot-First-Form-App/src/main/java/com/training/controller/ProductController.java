package com.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ProductController {

	@GetMapping(value = { "/", "/loadForm" })
	public String loadForm() {
		return "index";
	}

	@PostMapping(value = "/saveProduct")
	public String handleSubmitBtn(HttpServletRequest req, Model model) {
		// logic to save form data
		String pid = req.getParameter("pid");
		String pname = req.getParameter("pname");
		String price = req.getParameter("price");

		System.out.println("product ID:" + pid);
		System.out.println("product Name:" + pname);
		System.out.println("product Price:" + price);
		//logic to save form data
		model.addAttribute("msg","Product Data Saved to Catalog Successfully!!");	 
		return "success";
	}

}
