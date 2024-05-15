package com.masai.Usecases;

import java.util.Scanner;

import com.masai.Dao.DepartmentDao;
import com.masai.Dao.DepartmentDaoImpl;
import com.masai.Exceptions.DepartmentExceptions;

public class DeleteDepartmentUsingDptIdUsecase3 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
			
		System.out.println("Enter the department id for delete the department  details :");
		int dptId=sc.nextInt();
		
		DepartmentDao dDao=new DepartmentDaoImpl();
		
		try {
			String res=dDao.deleteTheDeptUsingDid(dptId);
			
			System.out.println(res);
		} catch (DepartmentExceptions e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
