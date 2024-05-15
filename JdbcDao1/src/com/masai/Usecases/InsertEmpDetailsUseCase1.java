package com.masai.Usecases;

import java.util.Scanner;

import com.masai.Dao.EmployeeDao;
import com.masai.Dao.EmployeeDaoImpl;
import com.masai.Exceptions.EmployeeExceptions;
import com.masai.Modol.Employee;

public class InsertEmpDetailsUseCase1 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        
		System.out.println("Enter the employee id : ");
	    int empid= sc.nextInt();
	    
	    System.out.println("Enter the employee name : ");
	    String eName= sc.next();
		
	    System.out.println("Enter the employee address : ");
	    String address= sc.next();
		
	    System.out.println("Enter the employee mobile no : ");
	    String mobileNo= sc.next();
		
	    System.out.println("Enter the Department id : ");
	    int deptId= sc.nextInt();
	    
	    Employee enmp=new Employee(empid, eName, address, mobileNo, deptId);
	    
	    EmployeeDao empDao= new EmployeeDaoImpl();
	    
	    try {
			String res =empDao.insertTheEmployeeDetails(enmp);
			System.out.println(res);
		} catch (EmployeeExceptions e) {
			System.out.println(e.getMessage());
		}
		
	}

}
