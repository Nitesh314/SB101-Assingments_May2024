package com.masai.usecases;

import java.util.Scanner;

import com.masai.Beans.Department;
import com.masai.Dao.DepartmentDao;
import com.masai.Dao.DepartmentDaoImpl;
import com.masai.exceptions.DepartmentException;

public class updateDptLocationUseCase3 {
	
	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the department Id : ");
		int did= sc.nextInt();

		System.out.print("Enter the department Location : ");
		String location=sc.next();
		
		DepartmentDao dDao=new DepartmentDaoImpl();
		
		try {
			Department dpt= dDao.updateDptLocation(did, location);
			
			System.out.println("\n"+"Location updated "+"\n"+"department id : "+dpt.getDid()+"\n"
					+"department name : "+dpt.getdName()+"\n"
					+"department location : "+dpt.getLocation());
			
		} catch (DepartmentException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
