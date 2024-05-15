package com.masai.usecases;

import java.util.List;

import com.masai.Beans.Product;
import com.masai.Dao.ProductDao;
import com.masai.Dao.ProductDaoImpl;
import com.masai.exceptions.ProductException;

public class getAllProductsUseCase2 {
	
	public static void main(String[] args) {
		
		ProductDao pDao=new ProductDaoImpl();
		
		try {
			List<Product> pList= pDao.getAllProducts();
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
