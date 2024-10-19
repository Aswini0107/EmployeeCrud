package com.dev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.dao.CrudDaoInter;
import com.dev.model.Employee;

@Service
public class CrudService implements CrudServiceInter {
	
	@Autowired
	private CrudDaoInter crudDaoInter;

	@Override
	public List<Employee> allEmployee() {
		 
		return crudDaoInter.allEmployee();
	}

	@Override
	public String addEmployee(Employee employee) {
		
		return crudDaoInter.addEmployee(employee);
	}

	@Override
	public List<Employee> updateEmployee(Employee employee) {
		
		return crudDaoInter.updateEmployee(employee);
	}

	@Override
	public String deleteEmp(Employee employee) {
		
		return crudDaoInter.deleteEmp(employee);
	}

	

}
