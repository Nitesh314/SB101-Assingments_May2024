package com.masai.Usecases;

import java.util.List;

import com.masai.Dao.EmployeeDao;
import com.masai.Dao.EmployeeDaoImpl;
import com.masai.Exceptions.EmployeeExceptions;
import com.masai.Modol.Employee;

public class getAllEmpDetailsBelongToAccountDptUseCase2 {
	
	public static void main(String[] args) {
		
		EmployeeDao empDao=new EmployeeDaoImpl();
		
		try {
			List<Employee> eList=  empDao.getAllEmpFromAccount();
			
			for(Employee emp:eList) {
				System.out.println("Employee Id : "+emp.getEmpId()+"\n"+
						"Employee Name : "+emp.getEname()+"\n"+
						"Employee address : "+emp.getAddress()+"\n"+
						"Employee mobile : "+emp.getMobile()+"\n"+
						"Employee department id : "+emp.getDeptid()+"\n"+
						"********************************************");
			}
			
		} catch (EmployeeExceptions e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
