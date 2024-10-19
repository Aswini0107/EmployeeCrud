package com.dev.controller;

import java.util.List;
import com.dev.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.dev.service.*;

@RestController
public class CrudController {

	@Autowired
	private CrudServiceInter crudServiceInter;
	
	@GetMapping("/Employee")
	private List<Employee> allEmployee() {
		return crudServiceInter.allEmployee();

	}
	
	@PostMapping("/addEmployee")
	private String addEmployee(@RequestBody Employee employee) {
		 return crudServiceInter.addEmployee(employee);

	}
	
	@PutMapping("/updateEmployee")
	private List<Employee> updateEmployee(@RequestBody Employee employee) {
		return crudServiceInter.updateEmployee(employee);

	}
	
	@DeleteMapping("/deleteEmployee")
	private String deleteEmp(@RequestBody Employee employee) {
		return crudServiceInter.deleteEmp(employee);

	}
}
