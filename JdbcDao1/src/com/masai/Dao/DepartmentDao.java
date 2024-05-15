package com.masai.Dao;

import java.util.List;

import com.masai.Exceptions.DepartmentExceptions;
import com.masai.Modol.Department;

public interface DepartmentDao {
	
//	● Write a JDBC application to delete the Dependent based on did, by taking the 
//	  input from the user.
//
//	● Write a JDBC application to get the Department details of those employees who 
//	  live in Mumbai.
	
	public String deleteTheDeptUsingDid(int did)throws DepartmentExceptions;
	
	public List<Department> getDptDetailsFromEmpBelongToMumbai()throws DepartmentExceptions;
	

}
