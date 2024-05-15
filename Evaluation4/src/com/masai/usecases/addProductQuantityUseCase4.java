package com.masai.usecases;

import java.util.Scanner;
import com.masai.Dao.ProductDao;
import com.masai.Dao.ProductDaoImpl;
import com.masai.exceptions.ProductException;

public class addProductQuantityUseCase4 {
	
	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the product id : ");
		int pId=sc.nextInt();
		
		System.out.print("Enter the product quantity : ");
		int quantity= sc.nextInt();
		
		ProductDao pDao=new ProductDaoImpl();
		
		try {
			
			String res= pDao.addProductQuantity(pId, quantity);
			
			System.out.println(res);
			
		} catch (ProductException e) {
		System.out.println(e.getMessage());
		}
		
	}

}
