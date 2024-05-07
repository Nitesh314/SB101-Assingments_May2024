package Day4Assingment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main3 {
	
	public static void main(String[] args) {
	   
//		Q3/- Create a List of Integers and Map each integer to their square inside another List.
//		Print both the List using Lambda expressions.
		
		List<Integer> list=Arrays.asList(2,4,6,8,10,12,13,14,15);
		
		List<Integer> sqList= list.stream().map(i->(i*i)).collect(Collectors.toList());
		
		System.out.println("Simple list");
		list.forEach(i->System.out.println(i));
		
		System.out.println("Square list of integer");
		sqList.forEach(i->System.out.println(i));
		
		
	}

}
