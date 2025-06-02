package com.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.training.entity.Address;
import com.training.entity.Employee;
import com.training.repository.AddresRepository;
import com.training.repository.EmpRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmpRepository empRepo;
	
	@Autowired
	private AddresRepository addrRepo;
	
	@Transactional(rollbackFor =Exception.class) 
	public void saveData() {
		Employee emp = new Employee();
		emp.setEmpId(203);
		emp.setEmpName("Ketan");
		emp.setEmpSal(2500.00);
		empRepo.save(emp);
		
		int i =10/0;
		
		Address address = new Address();
		address.setAddrId(503);
		address.setEmpId(203);
		address.setCity("Pune");
		address.setState("MH");
		address.setCountry("India");
		addrRepo.save(address);
	}
}
