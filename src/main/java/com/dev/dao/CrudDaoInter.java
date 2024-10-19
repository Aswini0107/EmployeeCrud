package com.dev.dao;

import java.util.List;

import com.dev.model.Employee;

public interface CrudDaoInter {

	List<Employee> allEmployee();
	
	String addEmployee(Employee employee);
	
	List<Employee> updateEmployee(Employee employee);
	
	String deleteEmp(Employee employee);
}
