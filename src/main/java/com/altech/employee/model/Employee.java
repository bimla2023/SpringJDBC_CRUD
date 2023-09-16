package com.altech.employee.model;

public class Employee {

	private int EMPLOYEE_ID;
	private String EMPLOYEE_NAME;
	private int AGE;
	private int SALARY;
	
	
	public Employee(int eMPLOYEE_ID, String eMPLOYEE_NAME, int aGE, int sALARY) {
		super();
		EMPLOYEE_ID = eMPLOYEE_ID;
		EMPLOYEE_NAME = eMPLOYEE_NAME;
		AGE = aGE;
		SALARY = sALARY;
	}
	public Employee(int eMPLOYEE_ID) {
		super();
		EMPLOYEE_ID = eMPLOYEE_ID;
		
	}
	public Employee(int eMPLOYEE_ID,String eMPLOYEE_NAME ) {
		super();
		EMPLOYEE_ID = eMPLOYEE_ID;
		EMPLOYEE_NAME = eMPLOYEE_NAME;
		
		
	}
	public int getEMPLOYEE_ID() {
		return EMPLOYEE_ID;
	}
	public void setEMPLOYEE_ID(int eMPLOYEE_ID) {
		EMPLOYEE_ID = eMPLOYEE_ID;
	}
	public String getEMPLOYEE_NAME() {
		return EMPLOYEE_NAME;
	}
	public void setEMPLOYEE_NAME(String eMPLOYEE_NAME) {
		EMPLOYEE_NAME = eMPLOYEE_NAME;
	}
	public int getAGE() {
		return AGE;
	}
	public void setAGE(int aGE) {
		AGE = aGE;
	}
	public int getSALARY() {
		return SALARY;
	}
	public void setSALARY(int sALARY) {
		SALARY = sALARY;
	}
	
	
	
	
	
	
}
