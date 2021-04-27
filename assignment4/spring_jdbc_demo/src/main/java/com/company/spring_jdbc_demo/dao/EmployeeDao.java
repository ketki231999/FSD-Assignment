package com.company.spring_jdbc_demo.dao;

import java.util.List;

import com.company.spring_jdbc_demo.entities.Employee;

public interface EmployeeDao {

	
	
	public int addEmployee(Employee employee);
	public int updateEmployee(Employee employee);
	public int deleteEmployee(int id);
	public Employee getEmployee(int id);
	public List<Employee> getAllEmployes();
	
	
}
