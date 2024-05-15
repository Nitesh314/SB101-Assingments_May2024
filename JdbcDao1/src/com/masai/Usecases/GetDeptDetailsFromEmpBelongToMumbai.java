package com.masai.Usecases;

import java.util.List;

import com.masai.Dao.DepartmentDao;
import com.masai.Dao.DepartmentDaoImpl;
import com.masai.Exceptions.DepartmentExceptions;
import com.masai.Modol.Department;

public class GetDeptDetailsFromEmpBelongToMumbai {
	
	public static void main(String[] args) {
		
		DepartmentDao dDao=new DepartmentDaoImpl();
		
		try {
			List<Department> dList= dDao.getDptDetailsFromEmpBelongToMumbai();
			for(Department d:dList) {
				System.out.println("Department id :"+d.getDid()+"\n"+
						"Department Name : "+d.getDname()+"\n"+
						"Department address : "+d.getLocation()+"\n"+
						"****************************************");
			}
		} catch (DepartmentExceptions e) {
			System.out.println(e.getMessage());
		}
		
	}

}
