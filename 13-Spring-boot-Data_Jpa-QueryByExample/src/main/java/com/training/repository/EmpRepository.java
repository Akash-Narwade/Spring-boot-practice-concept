package com.training.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.entity.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Serializable>{ 
	//Data type of primary key

}
