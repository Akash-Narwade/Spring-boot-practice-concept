package com.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.training.bindings.Student;
import com.training.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService StudentService;

	@GetMapping("/loadForm")
	public String loadRegForm(Model model) {
		model.addAttribute("genders", StudentService.getGenders());
		model.addAttribute("courses", StudentService.getCourses());
		model.addAttribute("timings", StudentService.getTimings());

		Student sobj = new Student();
		model.addAttribute("student", sobj);
		return "index";
	}
	
	
	@PostMapping("/saveStudent")
	public String handleRegBtnClick(Student student,Model model) {
		System.out.println(student);
		model.addAttribute("msg","DataSaved SuccessFully");
		return "dashboard";
	}

}
