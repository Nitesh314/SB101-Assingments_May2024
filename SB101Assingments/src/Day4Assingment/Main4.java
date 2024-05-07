package Day4Assingment;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import Day1Assingments.Student;

public class Main4 {
	
	public static void main(String[] args) {
		
//Q4/ Create a Set of 5 Student objects and from that set filter those students whose marks is
//less than 500 and put all the filtered Student object inside another Set object.
		
		Set<Student> sSet=new HashSet<>();
		
		sSet.add(new Student(1,"Nitesh","Vasai",528));
		sSet.add(new Student(5,"Ashish","Virar",550));
		sSet.add(new Student(2,"Sandeep","Nsp",350));
		sSet.add(new Student(4,"Jadu","Vasai",128));
		sSet.add(new Student(3,"Kumar","Nsp",420));
		sSet.add(new Student(1,"Nitesh","Vasai",528));
		
	 	Set<Student> filteredSet=sSet.stream().filter(s->s.getMarks()<500).collect(Collectors.toSet());
		
//	 	System.out.println("========= Simple Set ==========");
//	 	
//		sSet.forEach(s->System.out.println("Roll : "+s.getRoll()+"\n"
//                +"Name : "+s.getName()+"\n"
//                +"Address : "+s.getAddress()+"\n"
//                +"Marks : "+s.getMarks()+"\n"
//                +"*************************"));

		System.out.println("========== filteredSet ===============");
		
		filteredSet.forEach(s->System.out.println("Roll : "+s.getRoll()+"\n"
                +"Name : "+s.getName()+"\n"
                +"Address : "+s.getAddress()+"\n"
                +"Marks : "+s.getMarks()+"\n"
                +"*************************"));

		
		
		
	}

}
