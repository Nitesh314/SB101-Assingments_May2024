package com.masai.usecases;

import java.util.List;

import com.masai.Beans.Department;
import com.masai.Dao.DepartmentDao;
import com.masai.Dao.DepartmentDaoImpl;
import com.masai.exceptions.DepartmentException;

public class getAllDeptUseCase2 {
	
	public static void main(String[] args) {
		
		DepartmentDao dDao=new DepartmentDaoImpl();
		
		try {
			List<Department> dList= dDao.getAllDep();
			
			dList.forEach(d->System.out.println("department id : "+d.getDid()+"\n"
					+"department name : "+d.getdName()+"\n"
					+"department location : "+d.getLocation()+"\n"
					+"*****************************************"));
			
			
		} catch (DepartmentException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
