package com.dev.service;

import java.util.List;
import com.dev.model.*;

public interface CrudServiceInter {
	
	List<Employee> allEmployee();

	String addEmployee(Employee employee);
	
	List<Employee> updateEmployee(Employee employee);
	
	String deleteEmp(Employee employee);
}
