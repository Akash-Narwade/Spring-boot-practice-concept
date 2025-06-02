package com.training;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;

import com.training.entity.Employee;
import com.training.repository.EmpRepository;
import com.training.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmployeeService employeeService = context.getBean(EmployeeService.class);
		employeeService.saveData();
		context.close();


	}

}
