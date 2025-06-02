package com.training.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.entity.Employee;

@Repository
public interface EmpRepository extends CrudRepository<Employee, Serializable>{ 
	//findByMethod
	//Abstract Method --method doesn't have a body
	public List<Employee> findByEmpName(String name);
	
	public List<Employee> findByEmpSal(Double sal);
	
	public List<Employee> findByEmpNameAndEmpSal(String name,Double sal);
	
	public List<Employee> findByEmpSalGreaterThan(Double sal);
	
	//In Query Method
	public List<Employee> findByEmpNameIn(List<String> names);
	
	
	//This is called hybernate Query Language
	@Query("select empSal from Employee where empName=:name")
	public List<Double> findEmpSalByEmpName(String name);
	
	
	//Navtive Query -> SQL Query
	@Query(value="select count(*) from emp_tbl" ,nativeQuery = true)
	public Integer getCount();
	

}
