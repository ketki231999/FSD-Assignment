package com.company.spring_orm_hibernate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.spring_orm_hibernate.dao.EmployeeDao;
import com.company.spring_orm_hibernate.entities.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        EmployeeDao dao = context.getBean("employeeDao", EmployeeDao.class);
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true) {
        	System.out.println("__________________________________");
        	System.out.println("PRESS 1: Add Employee");
        	System.out.println("PRESS 2: get all Employees");
        	System.out.println("PRESS 3: get all Employees by id");
        	System.out.println("PRESS 4: delete Employee");
        	System.out.println("PRESS 5: update Employee");
        	System.out.println("PRESS 6: exit");
        	System.out.println("__________________________________");
        	
       
        
        
        try {
        	int input = Integer.parseInt(br.readLine());
        	
        	switch(input) {
        	case 1:
        		//ADD Employees
        		
        		System.out.println("Enter employee id");
        		int id = Integer.parseInt(br.readLine());
        		

        		System.out.println("Enter employee name");
        		String name = br.readLine();
        		
        		System.out.println("Enter employee email");
        		String email = br.readLine();
        		
        		
        		 Employee emp = new Employee();
	              emp.setId(id);
	              emp.setName(name);
	              emp.setEmail(email);
	               
	              int result =  dao.addEmployee(emp);
	              System.out.println("employee added successfully");	
        		
        	break;
        	
        	
        	case 2:
        		//get all employee
        		
        		List<Employee> employees = dao.getAllEmployees();
        		for(Employee employee: employees) {
        			 System.out.println(employee);	
        		}
        		
        		break;
        		
        	case 3:
        		
        	//get employee by id
        		System.out.println("Enter employee id");
        		int id4 = Integer.parseInt(br.readLine());
        		Employee emp4= dao.getEmployeeById(id4);
        		System.out.println(emp4);
        		
        		break;
        	
        	
        	case 4:
        		
        		//delete
        		System.out.println("enter id");
        	int id2 = Integer.parseInt(br.readLine());
        	Employee emp2 = new Employee();
        	emp2.setId(id2);
        	dao.deleteEmployee(id2);
        	break;
        	
        	
        	
        	case 5:
        	
        		//update employee
        		
        		
            System.out.println("Enter employee id");
    	    int id1 = Integer.parseInt(br.readLine());
    		
        	System.out.println("Enter employee name");
    		String name1 = br.readLine();
    		
    		System.out.println("Enter employee email");
    		String email1 = br.readLine();
    		
    		
    		 Employee updateEmployee = new Employee();
    		 updateEmployee.setId(id1);
    		 updateEmployee.setName(name1);
    		 updateEmployee.setEmail(email1);
               
             dao.updateEmployee(updateEmployee);
             System.out.println("employee added successfully");
        		
        		break;
        		
        	case 6: 
        		
        		System.out.println(" Exit ");
        		break;
        	
        		 
        	default:
        		
        		System.out.println("wrong option");
        		
        		break;
        		
        	}
        	
        
        		
        	
        } catch (Exception e) {
        	System.out.println("Invalid Selection");	
        }
        
    }     
        
//        
//        Employee emp = new Employee();
//        emp.setId(24);
//        emp.setName("watson");
//        emp.setEmail("w@gmail.com");
//        
//        int result =  dao.addEmployee(emp);
//        System.out.println("("+result+") rows inserted...");
        
    }   
          
    }

