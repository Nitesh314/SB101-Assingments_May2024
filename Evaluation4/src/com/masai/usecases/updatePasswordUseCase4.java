package com.masai.usecases;

import java.util.Scanner;

import com.masai.Dao.EmployeeDao;
import com.masai.Dao.EmployeeDaoImpl;
import com.masai.exceptions.EmployeeExceptions;

public class updatePasswordUseCase4 {
	
	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Employee Id :");
    	int eId= sc.nextInt();
    	
    	System.out.print("Enter the new password for updating the old password :");
    	String password= sc.next();
    	
		EmployeeDao eDao=new EmployeeDaoImpl();
		
		try {
			String res= eDao.updatePassword(eId, password);
			
			System.out.println(res);
		} catch (EmployeeExceptions e) {
			System.out.println(e.getMessage());
		}
		
	}

}
