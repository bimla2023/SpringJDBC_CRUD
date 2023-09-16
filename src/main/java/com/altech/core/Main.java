package com.altech.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.altech.employee.dao.EmployeeDao;
import com.altech.employee.model.Employee;

public class Main {

	public static void main(String[] args) {
		
		//FOr the Options
		int choice;
		int EMPLOYEE_ID;
		String EMPLOYEE_NAME;
		int AGE;
		int SALARY;
		do {
			System.out.println("Displaying all the menu:");
			System.out.println("1. INSERT");
			System.out.println("2. READ");
			System.out.println("3. UPDATE");
			System.out.println("4. DELETE EMployee Record");
			System.out.println("5. Exit");
			System.out.println("Please enter your choice: ");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			EmployeeDao empDAO =(EmployeeDao) context.getBean("employeeDAO");
			
			switch (choice) {
			  case 1:
				  System.out.println("Insert the EMployee Id");
				  EMPLOYEE_ID = sc.nextInt();
				  System.out.println("Insert the EMployee Name");
				  EMPLOYEE_NAME = sc.next();
				  System.out.println("Insert the EMployee Age");
				  AGE = sc.nextInt();
				  System.out.println("Insert the EMployee Salary");
				  SALARY = sc.nextInt();
				  Employee emp = new Employee(EMPLOYEE_ID,EMPLOYEE_NAME,AGE,SALARY);
				  empDAO.insert(emp);
				  break;
			  case 2:
				  System.out.println("Write the EMployee id you want to read the record");
				  EMPLOYEE_ID = sc.nextInt();
				 
				  String name = empDAO.read(EMPLOYEE_ID);
				  System.out.println("EMployee name : " +name);
				  System.out.println("===Employee name Read===");
				 
				  break;
			  case 3:
				  System.out.println("Write the EMployee id you want to Update the record");
				  EMPLOYEE_ID = sc.nextInt();
				  System.out.println("Write the EMployee Name you want to Update the record");
				  EMPLOYEE_NAME = sc.next();
				  
				  empDAO.update(EMPLOYEE_ID,EMPLOYEE_NAME);
				  System.out.println("==Record updated==");
				  break;
			  case 4:
				  System.out.println("Write the EMployee id you want to Delete the record");
				  EMPLOYEE_ID = sc.nextInt();
				  
				  empDAO.delete(EMPLOYEE_ID);
				  System.out.println("==Record Deleted==");
				  break;
			
			  case 5:
				  System.out.println("==Thanks for saving the data==");
				  System.exit(choice);
			   
			}


			
		}while(choice!=5) ;
	
		
		
		
	
	}

}
