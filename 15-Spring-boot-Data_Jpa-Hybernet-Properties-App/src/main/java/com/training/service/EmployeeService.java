package com.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.training.entity.Employee;
import com.training.repository.EmpRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmpRepository empRepo;
	
	public void saveData() {
		Employee emp = new Employee();
		emp.setEmpId(201);
		emp.setEmpName("Akash");
		emp.setEmpSal(1000.00);
		empRepo.save(emp);
	}
}
