package com.altech.employee.dao;

import java.util.ArrayList;
import java.util.List;

import com.altech.employee.model.Employee;

public interface EmployeeDao {
	
	public void insert(Employee employee);
	public String read(int eMPLOYEE_ID);
	public void update(int eMPLOYEE_ID, String EMPLOYEE_NAME);
	public void delete(int eMPLOYEE_ID);
	
}
