package com.dev.dao;

import java.util.LinkedList;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dev.model.Employee;

@Repository
public class CrudDao implements CrudDaoInter{


	private static final String SELECT_EMP_SQL="select * from employeedet";
   	
	private static final String INSERT_EMP_SQL="insert into employeedet values(?,?,?)";
	
	private static final String UPDATE_EMP_SQL="update employeedet set name=?,address=? where id=?";
	
	private static final String DELETE_EMP_SQL="delete from employeedet where id=? ";
	@Autowired
	private JdbcTemplate jdbcTemplate;


	@Override
	public List<Employee> allEmployee() {
		List<Employee> query = jdbcTemplate.query(SELECT_EMP_SQL,new BeanPropertyRowMapper<Employee>(Employee.class));
		return query;
	}


	@Override
	public String addEmployee(Employee employee) {
		int update = jdbcTemplate.update(INSERT_EMP_SQL, new Object[] {employee.getId(),employee.getName(),employee.getAddress()});
		return update==1 ? "Inserted Succefully" : "Failed to inserted";
	}


	@Override
	public List<Employee> updateEmployee(Employee employee) {
		 int status = jdbcTemplate.update(UPDATE_EMP_SQL, new Object[] {employee.getName(),employee.getAddress(),employee.getId()});
		return allEmployee();
	}


	@Override
	public String deleteEmp(Employee employee) {
		   int status = jdbcTemplate.update(DELETE_EMP_SQL, new Object[] {employee.getId()});
		return status==1 ? "Delete Succefully" : "Failed to delete";
	}


	
	

	
	
}
 