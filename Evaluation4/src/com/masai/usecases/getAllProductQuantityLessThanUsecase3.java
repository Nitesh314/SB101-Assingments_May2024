package com.masai.usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.Beans.Product;
import com.masai.Dao.ProductDao;
import com.masai.Dao.ProductDaoImpl;
import com.masai.exceptions.ProductException;

public class getAllProductQuantityLessThanUsecase3 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the product quantity to get less than quantity products : ");
		int quantity= sc.nextInt();
		
		
		
        ProductDao pDao=new ProductDaoImpl();
		
		try {
			List<Product> pList= pDao.getAllProductQuantityLessThan(quantity);
			pList.forEach(p->System.out.println("product id : "+p.getProductId()+"\n"+
			                                    "product name : "+p.getName()+"\n"+
					                            "product price : "+p.getPrice()+"\n"+
			                                    "product quantity : "+p.getQuantity()+"\n"+
					                            "****************************************"+"\n"));
			
			
		} catch (ProductException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
