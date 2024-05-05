package Day2Assingment;

import java.util.ArrayList;
import java.util.List;

public class Main4 {
	
	public static void main(String[] args) {
		
		List<Products> proList=new ArrayList<>();
		
		proList.add(new Products(1, "PINEAPPLE",5,5000));
		proList.add(new Products(2, "MANGO",12,12000));
		proList.add(new Products(3, "BANANA",4,3000));
		proList.add(new Products(4, "WATERMALEON",20,45000));
		proList.add(new Products(5, "GRAPES",8,3500));
		
		proList.sort((p1,p2)->p1.getPrice()<p2.getPrice()?+1:-1);
		
		proList.forEach((p)->System.out.println("productId : "+p.getProductId()+"\n"
                +"productName : "+p.getProductName()+"\n"
                +"quantity : "+p.getQuantity()+"\n"
                +"price : "+p.getPrice()+"\n"
                +"********************************"));
		
		
		
	}

}
