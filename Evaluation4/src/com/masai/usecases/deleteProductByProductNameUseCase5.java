package com.masai.usecases;

import java.util.Scanner;

import com.masai.Dao.ProductDao;
import com.masai.Dao.ProductDaoImpl;
import com.masai.exceptions.ProductException;

public class deleteProductByProductNameUseCase5 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the product name for remove the product from store : ");
		String name=sc.next();
		
		ProductDao pDao=new ProductDaoImpl();
		
		try {
			String res= pDao.deleteProductByProductName(name);
			System.out.println(res);
		} catch (ProductException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
