package com.masai.Dao;

import com.masai.Beans.Employee;
import com.masai.Beans.EmployeeDTO;
import com.masai.exceptions.EmployeeExceptions;

public interface EmployeeDao {
	
//	○ Register an Employee without deptId
//	○ Assign a registered Employee to an existing department.
//	○ Login an Employee and display his profile with a Welcome
//	○ Update the existing employee password.
	
	
	public String registerEmployee(EmployeeDTO edto)throws EmployeeExceptions;
	
	public Employee assingEmpToDpt(String dptName,int empId)throws EmployeeExceptions;
	
	public Employee loginEmployee(String userName,String password)throws EmployeeExceptions;
	
	public String updatePassword(int empId,String password)throws EmployeeExceptions;
	

}
