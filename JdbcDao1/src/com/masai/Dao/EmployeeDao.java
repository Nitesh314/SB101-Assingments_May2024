package com.masai.Dao;

import java.util.List;

import com.masai.Exceptions.EmployeeExceptions;
import com.masai.Modol.Employee;

public interface EmployeeDao {
	
//	 Write a JDBC application to insert details of Employee by taking the input 
//	  from the User.
//
//	● Write a JDBC application to insert details of Employee by taking the input from 
//	  the User.
//
//	● Write a JDBC application to get all the Employee details who work in the 
//	  “Account” department.
//

	
	public String insertTheEmployeeDetails(Employee emp)throws EmployeeExceptions;
	
	public List<Employee> getAllEmpFromAccount()throws EmployeeExceptions;
	
	

}
