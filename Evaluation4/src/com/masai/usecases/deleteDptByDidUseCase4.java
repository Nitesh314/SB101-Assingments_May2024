package com.masai.usecases;

import java.util.Scanner;

import com.masai.Dao.DepartmentDao;
import com.masai.Dao.DepartmentDaoImpl;
import com.masai.exceptions.DepartmentException;

public class deleteDptByDidUseCase4 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the department Id : ");
		int did= sc.nextInt();
		
		DepartmentDao dDao=new DepartmentDaoImpl();
		
	 	try {
			String res= dDao.deleteDptByDid(did);
			System.out.println(res);
		} catch (DepartmentException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
