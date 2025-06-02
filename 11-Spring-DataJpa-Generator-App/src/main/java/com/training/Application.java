package com.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.training.entities.Student;
import com.training.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args); 
		
		StudentRepository bean = context.getBean(StudentRepository.class); 
		
		Student student =new Student();
		student.setStudentName("Smith");
		student.setStudentEmail("smith@gmail.com");
		student.setStudentAge(28);
		
		Student savedEntity = bean.save(student); 
		System.out.println(savedEntity);
	}

}
