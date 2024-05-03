package Day1Assingments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class Main3 {
	
//	Create a List of 5 Student objects with proper details.
//
//	● Remove the duplicate Student object from the List.
//
//	● Sort the List of Students according to their marks, and if the marks are the same then
//	sort them according to their name.
//
//	● Print all the Student details from the List of Student object.

	public static void main(String[] args) {
		
		List<Student> sList=new ArrayList<>();
		
		sList.add(new Student(1,"Nitesh","Vasai",528));
		sList.add(new Student(5,"Ashish","Virar",550));
		sList.add(new Student(2,"Sandeep","Nsp",650));
		sList.add(new Student(4,"Jadu","Vasai",528));
		sList.add(new Student(3,"Kumar","Nsp",520));
		sList.add(new Student(1,"Nitesh","Vasai",528));
		
		//we get unique objects.
		Set<Student> uniqueS=new LinkedHashSet<>(sList);
		
		sList.clear();
		
		//convert objects set to list.
		sList.addAll(uniqueS);
		
		//sorting objects.
		Collections.sort(sList,(s1,s2)->s1.getMarks()==s2.getMarks()?+1:s1.getMarks()<s2.getMarks()?-1:s1.getName().compareTo(s2.getName()));
	
		for(Student s:sList) {
			System.out.println("roll : "+s.getRoll()+"\n"
		                       +"name : "+s.getName()+"\n"
		                       +"address : "+s.getAddress()+"\n"
		                       +"marks : "+s.getMarks()+"\n"
		                       +"******************************");
		}
		
	}
}
