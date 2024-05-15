package com.masai.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.Beans.Department;
import com.masai.Beans.DepartmentDTO;
import com.masai.Utility.DBUtil;
import com.masai.exceptions.DepartmentException;

public class DepartmentDaoImpl implements DepartmentDao  {

	@Override
	public Department createDepartment(DepartmentDTO dto) throws DepartmentException {
		
		try(Connection conn= DBUtil.getConnections()) {
			
			PreparedStatement ps=conn.prepareStatement("insert into department(dname,location) values(?,?)");
			
			ps.setString(1,dto.getdName());
			ps.setString(2,dto.getLocation());
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				
				PreparedStatement ps1=  conn.prepareStatement("select * from Department where dname=?");
				ps1.setString(1,dto.getdName());
				
				ResultSet rs= ps1.executeQuery();
				
				Department dpt=new Department();
				
				if(rs.next()) {
					int did=rs.getInt("did");
					String dname= rs.getString("dname");
					String location= rs.getString("location");
					
					dpt.setDid(did);
					dpt.setdName(dname);
					dpt.setLocation(location);
				}
				
				return dpt;
			}else {
				throw new DepartmentException("Department not created...!");
			}
			
		} catch (SQLException e) {
			throw new DepartmentException("Department not created...!"+e.getMessage());
		}
	
	}
//*******************************************************************************************************
	
	@Override
	public List<Department> getAllDep() throws DepartmentException {
		List<Department> dList=new ArrayList<>();
		
		try(Connection conn= DBUtil.getConnections();) {
			
			PreparedStatement ps= conn.prepareStatement("select * from department");
			
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				int did= rs.getInt("did");
				String dname= rs.getString("dname");
				String location= rs.getString("location");
				
				Department dpt=new Department(did, dname, location);
				
				dList.add(dpt);
			}
			
			if(dList.isEmpty()) {
				throw new DepartmentException("No department...");
			}else {
				return dList;
			}
			
			
		} catch (SQLException e) {
			throw new  DepartmentException("Error in sql..."+e.getMessage());
		}
	}

	@Override
	public Department updateDptLocation(int did,String Location) throws DepartmentException {
		Department dpt=new Department();
		
		try(Connection conn= DBUtil.getConnections()) {
			
			PreparedStatement ps= conn.prepareStatement("update department set location=? where did=?");
			ps.setString(1, Location);
			ps.setInt(2,did);
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				PreparedStatement ps1= conn.prepareStatement("select * from Department where did=?");
				ps1.setInt(1,did);
				
				ResultSet rs= ps1.executeQuery();
				
				if(rs.next()) {
					int did1=rs.getInt("did");
					String dname= rs.getString("dname");
					String location= rs.getString("location");
					
					dpt.setDid(did1);
					dpt.setdName(dname);
					dpt.setLocation(location);
					
					return dpt;
				}else {
					throw new DepartmentException("Not updated...");
				}
				
			}else {
				throw new DepartmentException("Not updated...");
			}
			
		} catch (SQLException e) {
			throw new DepartmentException("erroe..."+e.getMessage());
		}
	
	}

	@Override
	public String deleteDptByDid(int did) throws DepartmentException {
		String msg="Not deleted...";
		
		
		try (Connection conn=DBUtil.getConnections()){
			PreparedStatement ps= conn.prepareStatement("delete from department where did=?");
		    ps.setInt(1, did);
		    
       	    int x=ps.executeUpdate();
       	    
       	    if(x>0) {
       	    	msg="deleted successfully...";
       	    	return msg;
       	    }else {
       	    	return msg;
       	    }
       	    
		}catch (SQLException e) {
			throw new DepartmentException("Error..."+e.getMessage());
		}
	}

}
