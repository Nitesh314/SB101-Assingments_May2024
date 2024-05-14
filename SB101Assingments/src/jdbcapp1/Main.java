package jdbcapp1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the roll : ");
		int roll=sc.nextInt();
		
		System.out.println("Enter the name : ");
		String name =sc.next();
		
		System.out.print("Enter the marks : ");
		int marks=sc.nextInt();
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try(Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sb101New","root","nitesh");) {
			

               
		 PreparedStatement ps =conn.prepareStatement("insert into Student values(?,?,?)");
           
		  ps.setInt(1,roll);
		  ps.setString(2, name);
		  ps.setInt(3, marks);
		  
		  int r=ps.executeUpdate();
		  
		  if(r>0) {
			  System.out.println("Record Inserted Successfully...");
		  }else {
			  System.out.println("not Inserted...!!");
		  }
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
