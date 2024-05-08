package Evaluation1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main1 {
	
	public static void main(String[] args) {
		
//Q1/- Write the implementations of all the following Functional interfaces with examples using
//the Lamda expression.

		List<Student> sList=new ArrayList<>();
		
		sList.add(new Student(1,"Nitesh","n@gmail.com",580));
		sList.add(new Student(2,"Ashish","a@gmail.com",480));
		sList.add(new Student(3,"Sandeep","s@gmail.com",680));
		sList.add(new Student(4,"Jadu","j@gmail.com",480));
		sList.add(new Student(5,"Kumar","k@gmail.com",580));
		
		//Predicate<Student>: if the student's marks is less than 500
		
		sList.stream().filter(s->s.getMarks()<500)
		              .forEach(s->System.out.println("roll : "+s.getRoll()+"\n"
		            		                         +"name : "+s.getName()+"\n"
		            		                         +"email : "+s.getEmail()+"\n"
		            		                         +"marks : "+s.getMarks()+"\n"
		            		                         +"***************************"));
		
		
		
		//Consumer:<Student>: print the student's details
		
		sList.forEach(s->System.out.println("roll : "+s.getRoll()+"\n"
                +"name : "+s.getName()+"\n"
                +"email : "+s.getEmail()+"\n"
                +"marks : "+s.getMarks()+"\n"
                +"***************************"));
		

		//Supplier<Student>: get the Student object with all details(roll, name, marks)
		
		Supplier<Student> sup=()->new Student(1,"PK","a@gmail.com",120);
		
		System.out.println("roll :"+sup.get().getRoll()+"\n"
				           +"name : "+sup.get().getName()+"\n"
				           +"marks :"+sup.get().getMarks()+"\n");
		
		
		//Function<String, Integer>: Get any number in String format and return the number in
		//Integer format
		
		Function<String,Integer> fun=s->Integer.parseInt(s);
		
		System.out.println(fun.apply("133")+20);
		
		
	}

}
