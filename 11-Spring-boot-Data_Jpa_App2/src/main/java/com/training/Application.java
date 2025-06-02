package com.training;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.training.entity.Employee;
import com.training.entity.Product;
import com.training.repository.EmpRepository;
import com.training.repository.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		// concept1 --> findByXXX
		// Employee --> save
		EmpRepository empRepository = context.getBean(EmpRepository.class);
		System.out.println(empRepository.getClass().getName());

//		List<Employee> findByEmpName = empRepository.findByEmpName("Pawan");
//		System.out.println(findByEmpName);
//
//		List<Employee> findByEmpSal = empRepository.findByEmpSal(10000.00);
//		System.out.println(findByEmpSal);

		List<Employee> findByEmpNameAndEmpSal = empRepository.findByEmpNameAndEmpSal("Akash Narwade", 10000.00);
		System.out.println(findByEmpNameAndEmpSal);

		List<Employee> findByEmpSalGreaterThan = empRepository.findByEmpSalGreaterThan(10000.00);
		System.out.println(findByEmpSalGreaterThan);
		findByEmpSalGreaterThan.forEach(emp -> {
			System.out.println(emp);
		});
		System.out.println("========================================");
		
		List<Employee> findByEmpNameIn= empRepository.findByEmpNameIn(Arrays.asList("Akash Narwade","Pawann","Aniket")); 
		findByEmpNameIn.forEach(emp->{
			System.out.println(emp);
		});	
		System.out.println("===================END=====================");
		
		List<Double> salary =empRepository.findEmpSalByEmpName("Akash Narwade");
		salary.forEach(sal->{
			System.out.println(sal);
		});

		
	}

}
 