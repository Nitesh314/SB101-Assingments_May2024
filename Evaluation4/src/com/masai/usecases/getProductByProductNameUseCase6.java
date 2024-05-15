package com.masai.usecases;

import java.util.Scanner;

import com.masai.Beans.Product;
import com.masai.Dao.ProductDao;
import com.masai.Dao.ProductDaoImpl;
import com.masai.exceptions.ProductException;

public class getProductByProductNameUseCase6 {
	
	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the product name : ");
		String name=sc.next();
		
		ProductDao pDao=new ProductDaoImpl();
		
		try {
			Product p= pDao.getProductByProductName(name);
			
			System.out.println("product id : "+p.getProductId()+"\n"+
                    "product name : "+p.getName()+"\n"+
                    "product price : "+p.getPrice()+"\n"+
                    "product quantity : "+p.getQuantity());
			
		} catch (ProductException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
