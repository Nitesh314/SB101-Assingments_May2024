package com.masai.usecases;

import java.util.Scanner;

import com.masai.Beans.Employee;
import com.masai.Dao.EmployeeDao;
import com.masai.Dao.EmployeeDaoImpl;
import com.masai.exceptions.EmployeeExceptions;

public class assingEmpToDptUseCase2 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Employee Id :");
    	int eId= sc.nextInt();
    	
    	System.out.print("Enter the Department Name for assing the employee :");
    	String dName= sc.next();
    	
    	EmployeeDao eDao=new EmployeeDaoImpl();
    	
    	try {
			Employee emp= eDao.assingEmpToDpt(dName,eId);
			
			System.out.println("\n"+"Employee Details with department"+"\n"+"Employee Id  :"+emp.geteId()+"\n"
					+"Employee name : "+emp.geteName()+"\n"
					+"Employee address : "+emp.getAddress()+"\n"
					+"Employee email : "+emp.getEmail()+"\n"
					+"Employee password : "+emp.getPassword()+"\n"
					+"Employee salary : "+emp.getSalary()+"\n"
					+"Employee department Id : "+emp.getDeptId()+"\n");
			
			
		} catch (EmployeeExceptions e) {
			System.out.println(e.getMessage());
		}
	}

}
