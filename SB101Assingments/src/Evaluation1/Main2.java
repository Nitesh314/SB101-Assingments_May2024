package Evaluation1;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
	
	public static void main(String[] args) {
		
//		Q2/- Consider the following bean class:
//			Product:
//			productId: int,
//			productName: String
//			price: int
//			quantity: int
//			● Create a List of 6 products (Pen, Pencil, Rubber, Sharpener, Scale, Compass)
//			● Filter the Products whose quantity is less than 2 using Lambda Expression
//			● Sort the List of Products by using the price in descending order.
//			Note: For Sorting make use of Lambda Expression.
//			● Print each element from the List by using Method Reference.
		
		
		List<Products> pList=new ArrayList<>();
		
		pList.add(new Products(1,"Pen",25,650));
		pList.add(new Products(2,"Pencil",15,1050));
		pList.add(new Products(4,"Rubber",1,450));
		pList.add(new Products(5,"Sharpener",50,1650));
		pList.add(new Products(3,"Scale",40,1200));
		pList.add(new Products(6,"Compass",8,550));
		
		//filter
		
		pList.stream().filter(p->p.getQuantity()<2);
		
		//sorting
		
		pList.sort((p1,p2)->p1.getPrice()<p2.getPrice()?+1:-1);
		
		//printing using method reference
		
		pList.forEach(System.out::println);
		
		
	}

}
