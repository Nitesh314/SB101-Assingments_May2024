package com.masai.usecases;

import java.util.Scanner;

import com.masai.Beans.Employee;
import com.masai.Dao.EmployeeDao;
import com.masai.Dao.EmployeeDaoImpl;
import com.masai.exceptions.EmployeeExceptions;

public class loginEmployeeUseCase3 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		System.out.print("Enter the Employee Email :");
    	String email= sc.next();
    	
    	System.out.print("Enter the Employee Password :");
    	String password= sc.next();
		
    	EmployeeDao eDao=new EmployeeDaoImpl();
    	
    	try {
			Employee emp= eDao.loginEmployee(email, password);
			
			System.out.println("Welcome "+emp.geteName());
			
		} catch (EmployeeExceptions e) {
			System.out.println(e.getMessage());
		}		
	}

}
