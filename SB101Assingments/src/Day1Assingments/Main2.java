package Day1Assingments;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main2 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Set<Employee> emp=new TreeSet<>((e1,e2)->e1.getEmpId()>e2.getEmpId()?+1:-1);
		
		emp.add(new Employee(101,"Nitesh","Vasai",50000));
		emp.add(new Employee(105,"Ashish","Nsp",70000));
		emp.add(new Employee(106,"Ankit","Varodra",80000));
		emp.add(new Employee(102,"Rahul","Nsp",55000));
		emp.add(new Employee(104,"Kumar","Virar",60000));
		emp.add(new Employee(103,"Jadu","Vasai",50000));
		
		System.out.println("Enter 1 for sorting their empId "+
		                  "\n"+"Enter 2 for the sorting their Address"+"\n"
				          +"Enter 3 for the sorting their Salary if Salary is same then sort their name...");
		
		int choise=sc.nextInt();
		
		switch (choise) {
		case 1:
			for(Employee em:emp) {
				System.out.println("EmpId : "+em.getEmpId()+"\n"+"Name : "+em.getEmpName()+"\n"+"Address : "+em.getAddress()+"\n"+"Salary : "+em.getSalary()+"\n"+"******************") ;
			}
			break;
	
		case 2:
			Set<Employee> sortByAddress=new TreeSet<>(Comparator.comparing(Employee::getAddress));	
			
			sortByAddress.addAll(emp);
			
			for(Employee em:sortByAddress) {
				System.out.println("EmpId : "+em.getEmpId()+"\n"+"Name : "+em.getEmpName()+"\n"+"Address : "+em.getAddress()+"\n"+"Salary : "+em.getSalary()+"\n"+"******************") ;
			}
				
		break;
		case 3: 
			Set<Employee> sortBySalary=new TreeSet<>((e1,e2)->e1.getSalary()>e2.getSalary()?+1:e1.getSalary()==e2.getSalary()?e1.getEmpName().compareTo(e2.getEmpName()):-1);
			sortBySalary.addAll(emp);
			
			for(Employee em:sortBySalary) {
				System.out.println("EmpId : "+em.getEmpId()+"\n"+"Name : "+em.getEmpName()+"\n"+"Address : "+em.getAddress()+"\n"+"Salary : "+em.getSalary()+"\n"+"******************") ;
			}
			break;
			
		default:
			System.out.println("Unexpected value: " + choise);

}
	}

}
