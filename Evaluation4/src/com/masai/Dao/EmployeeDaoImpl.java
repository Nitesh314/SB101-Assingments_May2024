package com.masai.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.masai.Beans.Employee;
import com.masai.Beans.EmployeeDTO;
import com.masai.Utility.DBUtil;
import com.masai.exceptions.EmployeeExceptions;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public String registerEmployee(EmployeeDTO edto) throws EmployeeExceptions {
		String msg="Not Register...";
		
	    try(Connection conn=DBUtil.getConnections()){
	    	
	    	PreparedStatement ps=conn.prepareStatement("insert into employee(empId,ename,address,email,password,salary) values(?,?,?,?,?,?)");
	    	ps.setInt(1,edto.geteId());
	    	ps.setString(2,edto.geteName());
	    	ps.setString(3,edto.getAddress());
	    	ps.setString(4,edto.getEmail());
	    	ps.setString(5,edto.getPassword());
	    	ps.setInt(6,edto.getSalary());
	    	
	    	int x=ps.executeUpdate();
	    	
	    	if(x>0) {
	    		return msg="Register Sucessfully...";
	    	}else {
	    		throw new EmployeeExceptions(msg);
	    	}
	    	
			
		} catch (SQLException e) {
			throw new EmployeeExceptions("sql error..."+e.getMessage());
		}
		
		
	}
//**************************************************************************************************
	@Override
	public Employee assingEmpToDpt(String dptName,int empId) throws EmployeeExceptions {
	
            try(Connection conn=DBUtil.getConnections()){
	    	
	    	PreparedStatement ps=conn.prepareStatement("Select d.did from Department d where d.dname=?");
	    	ps.setString(1, dptName);
	    	
	    	ResultSet rs= ps.executeQuery();
	    	
	    	if(rs.next()) {
	    		int did= rs.getInt("did");
	    	
	    		PreparedStatement ps1=conn.prepareStatement("Update employee set deptId=? where empId=?");
	    		ps1.setInt(1, did);
	    		ps1.setInt(2,empId);
	    		
	    		int x=ps1.executeUpdate();
	    		
	    		if(x>0) {
	    			
	    			PreparedStatement ps2=conn.prepareStatement("select * from employee where empId=?");
	    			ps2.setInt(1,empId);
	    			
	    			ResultSet rs1= ps2.executeQuery();
	    			
	    			if(rs1.next()) {
	    				int mepId= rs1.getInt("empId");
	    				String name=rs1.getString("ename");
	    				String address= rs1.getString("address");
	    				String email=rs1.getString("email");
	    				String password= rs1.getString("password");
	    				int salary=rs1.getInt("salary");
	    				int deptId=rs1.getInt("deptId");
	    				
	    				Employee emp=new Employee(mepId, name, address, email, password, salary, deptId);
	    				
	    				return emp;
	    				
	    			}else {
	    				throw new EmployeeExceptions("Empid not exist...");
	    			}
	    			
	    			
	    		}else {
	    			throw new EmployeeExceptions("Empid not exist...");
	    		}
	    	 
	    	}else {
	    		throw new EmployeeExceptions("did not exist...");
	    	}
	    	
			
		} catch (SQLException e) {
			throw new EmployeeExceptions("sql error..."+e.getMessage());
		}
		
	}
//******************************************************************************************
	@Override
	public Employee loginEmployee(String userName, String password) throws EmployeeExceptions {
		
	 	try(Connection conn= DBUtil.getConnections()){
	 		PreparedStatement ps= conn.prepareStatement("select * from Employee where email=? and password=?");
	 		ps.setString(1, userName);
	 		ps.setString(2, password);
	 		
	 		ResultSet rs= ps.executeQuery();
	 		
	 		if(rs.next()) {
	 			int mepId= rs.getInt("empId");
				String name=rs.getString("ename");
				String address= rs.getString("address");
				String email=rs.getString("email");
				String passwords= rs.getString("password");
				int salary=rs.getInt("salary");
				int deptId=rs.getInt("deptId");
				
				Employee emp=new Employee(mepId, name, address, email, passwords, salary, deptId);
				
				return emp;
				}else {
					throw new EmployeeExceptions("UserName and Password not exist...!!");
				}
	 		
			
		} catch (SQLException e) {
			throw new EmployeeExceptions("Error in mysql..."+e.getMessage());
		}
		
	}
//**********************************************************************************************
	@Override
	public String updatePassword(int empId, String password) throws EmployeeExceptions {
		
		try(Connection conn= DBUtil.getConnections()){
			PreparedStatement ps= conn.prepareStatement("update employee set password=? where empId=?");
			ps.setString(1,password);
			ps.setInt(2,empId);
			
			int x= ps.executeUpdate();
			
			if(x>0) {
				return "Updated successfully...";
			}else {
			   throw new EmployeeExceptions("employee id not exist..!!");
			}
			
		} catch (SQLException e) {
			throw new EmployeeExceptions("Error in mySql..."+e.getMessage());
		}
	}

}
