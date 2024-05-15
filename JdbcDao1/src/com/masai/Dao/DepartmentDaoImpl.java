package com.masai.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.masai.Exceptions.DepartmentExceptions;
import com.masai.Exceptions.EmployeeExceptions;
import com.masai.Modol.Department;
import com.masai.Utility.DBUtil;

public class DepartmentDaoImpl implements DepartmentDao {

	@Override
	public String deleteTheDeptUsingDid(int did) throws DepartmentExceptions {
		
		String msg="not Deleted...!!!";
		
		try(Connection conn= DBUtil.getConnections();) {
			
			PreparedStatement ps= conn.prepareStatement("Delete from department where did=?");
			ps.setInt(1, did);
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				msg="Deleted successFully...!!!";
			}else {
				msg="dptId not exist";
			}
			
			
		} catch (Exception e) {
			throw new DepartmentExceptions("Error in deoartment.."+e.getMessage());
		}
		
		
		return msg;
	}

	@Override
	public List<Department> getDptDetailsFromEmpBelongToMumbai() throws DepartmentExceptions {
		List<Department>dList=new ArrayList<>();
		
		try (Connection conn=DBUtil.getConnections()){
			PreparedStatement ps= conn.prepareStatement("select * from department d Inner join Employee e ON d.did=e.deptId where e.address=?");
			ps.setString(1,"Mumbai");
			
			ResultSet rs= ps.executeQuery();
			
		     while(rs.next()) {
		    	 int did= rs.getInt("did");
		    	 String dName= rs.getString("dName");
		    	 String location=rs.getString("location");
		    	 
		    	 Department dpt=new Department(did, dName, location);
		    	 
		    	 dList.add(dpt);
		     }
			
			
		} catch (Exception e) {
			throw new DepartmentExceptions("Error no Department :"+e.getMessage());
		}
		
		return dList;
	}
	
	


}
