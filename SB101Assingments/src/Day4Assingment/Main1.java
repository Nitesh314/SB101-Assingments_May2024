package Day4Assingment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main1 {
	
	public static void main(String[] args) {
		
		//1. Create a List of 5 product objects.
		
		List<Products> pList=new ArrayList<>();
		
		pList.add(new Products(1, "PINEAPPLE",5,5000));
		pList.add(new Products(2, "MANGO",12,12000));
		pList.add(new Products(3, "BANANA",4,3000));
		pList.add(new Products(4, "WATERMALEON",20,45000));
		pList.add(new Products(5, "GRAPES",8,3500));
		
//		2. From the product list filter the products whose quantity is more than 10 in a
//		separate List of Products.
		
		List<Products> filterdList= pList.stream().filter(p->p.getQuantity()<10).collect(Collectors.toList());
		
		
//		3. Sort the Filtered List of Products by the price in ascending order.
		
		filterdList.sort((p1,p2)->p1.getPrice()>p2.getPrice()?+1:-1);
		
		
//
//		4. Print all the products one by one from both Lists (original list and Filtered list)
		
		System.out.println("Original list");
		
		pList.forEach(p->System.out.println("Product id :"+p.getProductId()+"\n"
                +"Product name :"+p.getProductName()+"\n"
                +"Product quantity :"+p.getQuantity()+"\n"
                +"Product price :"+p.getPrice()+"\n"
                +"***********************************"));
		
   System.out.println("===========================================================================");
	
   System.out.println("Filtered list");
   
   filterdList.forEach(p->System.out.println("Product id :"+p.getProductId()+"\n"
                +"Product name :"+p.getProductName()+"\n"
                +"Product quantity :"+p.getQuantity()+"\n"
                +"Product price :"+p.getPrice()+"\n"
                +"***********************************"));
		
//
//		Note: for filtering and printing and sorting make use of Stream or Lambda
//		expressions.
//		
		
	}

}
