package JdbcApp3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	
//	● Write a JDBC application to insert details of Employee by taking the input 
//	  from the User.
//
//	● Write a JDBC application to insert details of Employee by taking the input from 
//	  the User.
//
//	● Write a JDBC application to get all the Employee details who work in the 
//	  “Account” department.
//
//	● Write a JDBC application to delete the Dependent based on did, by taking the 
//	  input from the user.
//
//	● Write a JDBC application to get the Department details of those employees who 
//	  live in Mumbai.
	
	Scanner sc=new Scanner(System.in);
	
	Employee emp=null;
	Department dpt=null;
	
	public String insertEmpDetails() {
		
		String message="Not inserted";
		
		System.out.println("enter the employee id : ");
        int empId=sc.nextInt();
        
        System.out.println("enter the employee name : ");
        String name=sc.next();
        
        System.out.println("enter the employee address : ");
        String address=sc.next();
        
        System.out.println("enter the employee mobile : ");
        String mobile=sc.next();
        
        System.out.println("enter the employee deptId : ");
        int deptId=sc.nextInt();
        
        emp=new Employee(empId, name, address, mobile, deptId);
        
        Connection conn= DBUtil.getConnections();
        
        try(PreparedStatement ps=conn.prepareStatement("insert into Employee Values(?,?,?,?,?)")) {
			
        	//Binding the value;
        	
        	ps.setInt(1,empId);
        	ps.setString(2,name);
        	ps.setString(3, address);
        	ps.setString(4, mobile);
        	ps.setInt(5, deptId);
        	
        	int x=ps.executeUpdate();
            
        	if(x>0) {
        		message="Inserted Succecfully...!!";
        	}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return message;
	}
	
	
	public static void main(String[] args) {
		 
		Main main=new Main();
		
		String res= main.insertEmpDetails();
		
		System.out.println(res);
		
		
	}

}
