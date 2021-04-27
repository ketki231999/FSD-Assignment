package com.company.spring_jdbc_demo.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.company.spring_jdbc_demo.entities.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	

	public int addEmployee(Employee employee) {
		String query = "insert into employee (id, name, email) values (?,?,?)";
        int result =  jdbcTemplate.update(query,employee.getId(), employee.getName(), employee.getEmail());
        return result;
	}

	public int updateEmployee(Employee employee2) {
		// TODO Auto-generated method stub
		
		String query = "Update employee set email = ? where name = ?";
        int result2 =  jdbcTemplate.update(query, employee2.getEmail() ,employee2.getName());
         return result2;
		
	}

	public int deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
		String query = "Delete from employee where id = ?";
        int result3 =  jdbcTemplate.update(query,id);
         return result3;
		
	}

	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		
		String query = "select * from employee where id = "+id;
		 List<Map<String, Object>> employee2= jdbcTemplate.queryForList(query);
	        System.out.println("Get Employee by its ID");
	           System.out.println(employee2);
		
		
		return null;
	}

	public List<Employee> getAllEmployes() {
		// TODO Auto-generated method stub
		 String query="select * from employee";
	        List<Map<String, Object>> employee1= jdbcTemplate.queryForList(query);
	        System.out.println("All Employee data");
	       System.out.println(employee1);
		
		return null;
	}
	
	public int add(Employee emp) {
		String query = "insert into employee (id, name, email) values (?,?,?)";
        int result =  jdbcTemplate.update(query,emp.getId(), emp.getName(), emp.getEmail());
        return result;
	}
	
	

	
	

}
