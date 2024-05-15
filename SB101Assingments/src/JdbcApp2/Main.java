package JdbcApp2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	
	Scanner sc=new Scanner(System.in);
	
//	● Write a Jdbc application to insert 5 different types of Products by taking input from
//	the User.
//
//	● Write a Jdbc application to insert a new Product without quantity and price by taking
//	input from the user.
//
//	● Write a Jdbc application to update the price and quantity of a product by taking the
//	input from the user.
//
//	● Write a Jdbc application to delete all the Products whose quantity is less than 2
//

	public String submitRecord(Product pro) {
		
		System.out.print("Insert product id : ");
		int pid=sc.nextInt();
		
		System.out.print("Insert product name : ");
		String name=sc.next();
		
		System.out.print("Insert product quantity : ");
		int quantity=sc.nextInt();
		
		System.out.print("Insert product price : ");
		int price=sc.nextInt();
		
		pro.setPid(pid);
		pro.setpName(name);
		pro.setQuantity(quantity);
		pro.setPrice(price);
		
		
		String message="Not inserted...!!";
		
		Connection conn= DBUtil.getConnections();
		
		try(PreparedStatement ps= conn.prepareStatement("insert into product value(?,?,?,?)");) {
			
			ps.setInt(1,pro.getPid());
			ps.setString(2,pro.getpName());
			ps.setInt(3,pro.getQuantity());
			ps.setInt(4,pro.getPrice());
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				message="Inserted successfully..!!";
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		return message;
	}
	//-------------------------------------------------------------
	
public String submitPartialRecord(Product pro) {
		
		System.out.print("Insert product id : ");
		int pid=sc.nextInt();
		
		System.out.print("Insert product name : ");
		String name=sc.next();
		
		
		
		pro.setPid(pid);
		pro.setpName(name);
		
		
		
		String message="Not inserted...!!";
		
		Connection conn= DBUtil.getConnections();
		
		try(PreparedStatement ps= conn.prepareStatement("insert into product(pid,pname) value(?,?)");) {
			
			ps.setInt(1,pro.getPid());
			ps.setString(2,pro.getpName());
			
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				message="Inserted successfully..!!";
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		return message;
	}
	
	public static void main(String[] args) {
		
		Main m=new Main();
		
		//1
//		String res1=m.submitRecord(new Product());
//		System.out.println(res1);
		
		//
		
		String res2=m.submitPartialRecord(new Product());
		System.out.println(res2);
		
	}
	
	
}
