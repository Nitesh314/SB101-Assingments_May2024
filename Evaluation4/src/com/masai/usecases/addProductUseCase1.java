package com.masai.usecases;

import java.util.Scanner;

import com.masai.Beans.Product;
import com.masai.Dao.ProductDao;
import com.masai.Dao.ProductDaoImpl;
import com.masai.exceptions.ProductException;

public class addProductUseCase1 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the product id : ");
		int pId=sc.nextInt();
		
		System.out.print("Enter the product name : ");
		String name=sc.next();
		
		System.out.print("Enter the product price : ");
		int price= sc.nextInt();
		
		System.out.print("Enter the product quantity : ");
		int quantity= sc.nextInt();
		
		Product pro=new Product(pId, name, price, quantity);
		
		ProductDao pDao=new ProductDaoImpl();
		
		try {
			String res= pDao.addProduct(pro);
			System.out.println(res);
		} catch (ProductException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
