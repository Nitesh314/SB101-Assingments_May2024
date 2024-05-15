package com.masai.usecases;

import java.util.Scanner;


import com.masai.Beans.EmployeeDTO;
import com.masai.Dao.EmployeeDao;
import com.masai.Dao.EmployeeDaoImpl;
import com.masai.exceptions.EmployeeExceptions;

public class registerEmployeeUseCase1 {
	
	public static void main(String[] args) {
    	
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.print("Enter the Employee Id :");
    	int eId= sc.nextInt();
    	
    	System.out.print("Enter the Employee Name :");
    	String name= sc.next();
    	
    	System.out.print("Enter the Employee Address :");
    	String address= sc.next();
    	
    	System.out.print("Enter the Employee Email :");
    	String email= sc.next();
    	
    	System.out.print("Enter the Employee Password :");
    	String password= sc.next();
    	
    	System.out.print("Enter the Employee Salary :");
    	int salary= sc.nextInt();
    	
    	EmployeeDTO edto=new EmployeeDTO(eId, name, address, email, password, salary);
    	
    	EmployeeDao eDao=new EmployeeDaoImpl();
    	
    	try {
			String res= eDao.registerEmployee(edto);
			
			System.out.println(res);
		} catch (EmployeeExceptions e) {
			System.out.println(e.getMessage());
		}
    	
		
	}

}
