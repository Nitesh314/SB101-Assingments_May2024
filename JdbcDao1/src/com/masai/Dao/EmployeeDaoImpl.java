package com.masai.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.Exceptions.EmployeeExceptions;
import com.masai.Modol.Employee;
import com.masai.Utility.DBUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public String insertTheEmployeeDetails(Employee emp) throws EmployeeExceptions {
		String msg="Not Inserted...!";
		
		
		
		try(Connection conn= DBUtil.getConnections()) {
		    PreparedStatement ps =conn.prepareStatement("insert into Employee values(?,?,?,?,?)");
			
		    ps.setInt(1,emp.getEmpId());
		    ps.setString(2,emp.getEname());
		    ps.setString(3,emp.getAddress());
		    ps.setString(4,emp.getMobile());
		    ps.setInt(5,emp.getDeptid());
		    
		    
		    int x= ps.executeUpdate();
	        
		    if(x>0) {
		    	msg="Inserted successfully";
		    }
		    
			
		} catch (SQLException e) {
			throw new EmployeeExceptions("Erroe inserting employee details "+e.getMessage());
		}
		
		
		return msg;
	}

	@Override
	public List<Employee> getAllEmpFromAccount() throws EmployeeExceptions {
		List<Employee> eList=new ArrayList<>();
		
		try(Connection conn=DBUtil.getConnections()) {
			PreparedStatement ps= conn.prepareStatement("Select e.empId,e.ename,e.address,e.mobile,e.deptid from employee e Inner Join department d ON e.deptId=d.did where d.dname=?");
			ps.setString(1,"account");
			
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				
				int empId = rs.getInt("empId");
                String ename = rs.getString("ename");
                String address = rs.getString("address");
                String mobile = rs.getString("mobile");
                int deptid = rs.getInt("deptid");

                Employee emp = new Employee(empId, ename, address, mobile, deptid);
                eList.add(emp);
			    
			}
			
		} catch (SQLException e) {
			throw new EmployeeExceptions("Error No Element "+e.getMessage());
		}
		
		return eList;
	}

}
