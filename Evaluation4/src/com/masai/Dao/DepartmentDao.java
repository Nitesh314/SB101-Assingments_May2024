package com.masai.Dao;

import java.util.List;

import com.masai.Beans.Department;
import com.masai.Beans.DepartmentDTO;
import com.masai.exceptions.DepartmentException;

public interface DepartmentDao {
	
	public Department createDepartment(DepartmentDTO dpt)throws DepartmentException;
	
	public List<Department> getAllDep()throws DepartmentException;
	
	public Department updateDptLocation(int did,String Location)throws DepartmentException;
	
	public String deleteDptByDid(int did)throws DepartmentException;

}
