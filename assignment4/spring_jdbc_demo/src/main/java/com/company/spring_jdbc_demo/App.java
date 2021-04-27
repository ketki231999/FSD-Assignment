package com.company.spring_jdbc_demo;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.spring_jdbc_demo.dao.EmployeeDaoImpl;
import com.company.spring_jdbc_demo.entities.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	  
       
     

    	System.out.println("Application started...");
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
       
        EmployeeDaoImpl daoImpl = context.getBean("empDao", EmployeeDaoImpl.class);
        
             
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please select any one options");
        System.out.println("**************");
        System.out.println("Press 1: Insert");
        System.out.println("Press 2: Update");
        System.out.println("Press 3: Delete");
        System.out.println("Press 4: Get");
        System.out.println("**************");
        
        int option = sc.nextInt();
        switch (option){
            case 1: {
            	   System.out.print("Enter employee id");
                   int id = sc.nextInt();
                   
                   System.out.print("Enter employee name");
                   String name = sc.next();
                   
                   System.out.print("Enter employee email");
                   String email = sc.next();
                   
                   Employee emp = new Employee(id,name,email);
                   int result4 = daoImpl.add(emp);
                   System.out.println("("+result4+") rows inserted......");
                break;
            }
            case 2: {
            	
            	 System.out.print("Enter employee name");
            	    String name1 = sc.next();
            	    
            	    System.out.print("Enter employee email");
            	    String email1 = sc.next();
            	    
            	    
            	     Employee emp1 = new Employee();
            	     emp1.setEmail(email1);
            	     emp1.setName(name1);
            	     
            	    int result2 = daoImpl.updateEmployee(emp1);
            	     System.out.println("("+result2+") rows updated..");
            	     
                break;
            }
            
            case 3: {
            	
            	System.out.println("Enter employee id");
            	int id3 = sc.nextInt();
            	Employee employee3 = new Employee();
                employee3.setId(id3); 
                
               int result3 = daoImpl.deleteEmployee(id3);
               System.out.println("("+result3+") rows deleted......");
                break;
            }
            
            
            
            case 4: {
            	daoImpl.getAllEmployes();
                break;
            }
            default: {
                System.out.println("Incorrect options");
            }
        }
        
        
        
        //ADD METHOD
       
//        Employee employee = new Employee();
//        employee.setEmail("s@gmail.com");
//        employee.setName("mark");
//        employee.setId(10);
        
        
//        int result = daoImpl.addEmployee(employee);
//        System.out.println("("+result+") rows inserted......");
        
        
        
        
        // UPDATE METHOD
        
 //       Employee employee2 = new Employee();
//        employee2.setName("ketki"); 
//        employee2.setEmail("ketki@gmail.com");
//        
//        int result2 = daoImpl.updateEmployee(employee2);
//        System.out.println("("+result2+") rows updated..");
        
        
        
        //DELETE METHOD
//        
        
//        Employee employee3 = new Employee();
//        employee3.setId(8); 
//        
//        int result3 = daoImpl.deleteEmployee(8);
//        System.out.println("("+result3+") rows deleted......");
        
        
        
        //GET EMPLOYEE BY ID
//        
//        Employee employee2 = new Employee();
//        daoImpl.getEmployee(23);
        
        
        //GET ALL DATA
        
//         daoImpl.getAllEmployes();
        
        

    
    }

	

	

	private static void insert() {
		// TODO Auto-generated method stub
		
	}
	private static void update() {
		// TODO Auto-generated method stub
		
	}
	private static void delete() {
		// TODO Auto-generated method stub
		
	}
	private static void get() {
		// TODO Auto-generated method stub


		
	}
	

//return null;
}

