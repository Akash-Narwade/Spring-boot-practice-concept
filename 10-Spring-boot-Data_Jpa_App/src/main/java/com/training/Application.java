package com.training;

import java.io.Serializable;
import java.util.ArrayList;
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
		
		
		//concept1
		//Employee --> save
		EmpRepository empRepository=context.getBean(EmpRepository.class);
		System.out.println(empRepository.getClass().getName());  
//		Employee emp= new Employee();
//		emp.setEmpId(102);
//		emp.setEmpName("Akash Narwade");
//		emp.setEmpSal(10000.00);
//		empRepository.save(emp);
		
		//concept2 --> saveAll
//		Employee e1= new Employee(103,"Pawan",23000.00);
//		Employee e2= new Employee(104,"Aniket",23000.00);
//		Employee e3= new Employee(105,"Vishal",23000.00);
//		List<Employee> emps=new ArrayList<>();
//		emps.add(e1);
//		emps.add(e2);
//		emps.add(e3);
//		empRepository.saveAll(emps);
		
		//concept3 --> findById
//		Optional<Employee> findById =empRepository.findById(203);
//		if(findById.isPresent()) {
//			System.out.println(findById.get());
//		}else {
//			System.out.println("Record Not Available....");
//		}
		
		//concept4 -->findAllById()
		List<Serializable> empIds=new ArrayList<>();
		empIds.add(102);
		empIds.add(103);
		empIds.add(104);
		/*
		 * empRepository.findAllById(empIds); Iterable<Employee>
		 * emps=empRepository.findAllById(empIds); emps.forEach(emp ->{
		 * System.out.println(emp); });
		 */
		
		//concept5  -->findAll()
//		Iterable<Employee> findAll=empRepository.findAll();
//		findAll.forEach(emp ->{
//			System.out.println(emp);
//		});
		
		//concept6  -->count()
		long count = empRepository.count();
		System.out.println("Total record Available in Table ::" +count);
		
		//concept7  -->existsById()
		boolean isAvailable = empRepository.existsById(103);
		System.out.println("Employee Available ::" +isAvailable);
		
		//concept8  -->deleteById()
		empRepository.deleteById(105);
		
		
		//Product
//		ProductRepository productRepository=context.getBean(ProductRepository.class);
//		System.out.println(productRepository.getClass().getName());
//		Product product =new Product();
//		product.setPid(201);
//		product.setPname("Mouse");
//		product.setPrice(1000.00);
//		productRepository.save(product);
		
		System.out.println("Record Insert Successfully!!");
				
	}

}
