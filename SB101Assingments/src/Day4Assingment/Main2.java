package Day4Assingment;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import Day1Assingments.Student;

public class Main2 {
	
	public static void main(String[] args) {
		
//		Q2/- Create a List of 5 Student objects and from that List get the highest marks Student by
//		using Stream API.
		
        List<Student> sList=new ArrayList<>();
		
		sList.add(new Student(1,"Nitesh","Vasai",528));
		sList.add(new Student(5,"Ashish","Virar",550));
		sList.add(new Student(2,"Sandeep","Nsp",650));
		sList.add(new Student(4,"Jadu","Vasai",528));
		sList.add(new Student(3,"Kumar","Nsp",520));
		sList.add(new Student(1,"Nitesh","Vasai",528));
		
	    sList.stream().max((s1,s2)->s1.getMarks()>s2.getMarks()?+1:-1)
	    .stream()
	            .forEach(s->System.out.println("Roll : "+s.getRoll()+"\n"
	            		                       +"Name : "+s.getName()+"\n"
	            		                       +"Address : "+s.getAddress()+"\n"
	            		                       +"Marks : "+s.getMarks()+"\n"
	            		                       +"*************************"));
		
	  
		
	}

}
