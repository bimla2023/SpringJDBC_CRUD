package com.altech.employeeDaoIMPL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.altech.employee.dao.EmployeeDao;
import com.altech.employee.model.Employee;

public class EmployeeDaoIMPL implements EmployeeDao {
	private JdbcTemplate jdbcTemplate;
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate= new JdbcTemplate(dataSource);
		// TODO Auto-generated method stub

	}
	

	public void insert(Employee employee) {
		
		String sql_insert =
				"INSERT INTO EMPLOYEE (EMPLOYEE_ID,EMPLOYEE_NAME,AGE,SALARY) VALUES(?,?,?,?)";
		
		jdbcTemplate.update(sql_insert,new Object[] {employee.getEMPLOYEE_ID(),
				employee.getEMPLOYEE_NAME(),employee.getAGE(),employee.getSALARY()} );
		System.out.println("==Employee record Saved===");
	
	}
	
	public String read(int EMPLOYEE_ID){
		
		String sql_READ = "SELECT EMPLOYEE_NAME FROM EMPLOYEE WHERE EMPLOYEE_ID=?";
		String  name = (String)jdbcTemplate.queryForObject(sql_READ,new Object[] {EMPLOYEE_ID},String.class);
		
		return name;
		 		
	}
	
	public void update(int EMPLOYEE_ID, String EMPLOYEE_NAME){
		String sql_read = "Select * from EMPLOYEE WHERE EMPLOYEE_ID="+EMPLOYEE_ID;
		String sql_update = "UPDATE EMPLOYEE SET EMPLOYEE_NAME =? WHERE EMPLOYEE_ID="+EMPLOYEE_ID;
		Employee employee = new Employee(EMPLOYEE_ID, EMPLOYEE_NAME);
		jdbcTemplate.queryForList(sql_read);
		 if(jdbcTemplate.queryForList(sql_read) != null) {
			 System.out.println("==Record Found ===");
			 jdbcTemplate.update(sql_update,new Object[] {employee.getEMPLOYEE_NAME()} );
			 
		 }
		 else {
			 System.out.println("==Record Not Found ===");
		 }
				
	}
	public void delete(int EMPLOYEE_ID){
		
		String sql_read = "Select * from EMPLOYEE WHERE EMPLOYEE_ID="+EMPLOYEE_ID;
		
		String sql_delete = "DELETE FROM EMPLOYEE WHERE EMPLOYEE_ID="+EMPLOYEE_ID;
		Employee employee = new Employee(EMPLOYEE_ID);
		jdbcTemplate.queryForList(sql_read);
		 if(jdbcTemplate.queryForList(sql_read) != null) {
			 System.out.println("==Record Found ===");
			 jdbcTemplate.execute(sql_delete);
			 
		 }
		 else {
			 System.out.println("==Record Not Found ===");
		 }
				
				
	}



	
}
