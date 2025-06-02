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

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmpRepository empRepository = context.getBean(EmpRepository.class);

		// Concept -> Query By Example
		Employee employee = new Employee();

		// id emp_id selected
		employee.setEmpId(101);

		// if emp_Name is selected
		employee.setEmpName("Pawan");

		// if emp_Name is selected
		employee.setEmpSal(23000.00);

		Example<Employee> empExmpl = Example.of(employee);

		List<Employee> findAll = empRepository.findAll(empExmpl);

		for (Employee e : findAll) {
			System.out.println(e);
		}

	}

}
