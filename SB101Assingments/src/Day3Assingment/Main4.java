package Day3Assingment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import SortTheMapAccordingTheirValue.Student;

public class Main4 {
	
	public static Map<String, Student> sortMapUsingStudentName(Map<String, Student>originalMap){
		
		List<Map.Entry<String,Student>> sList=new ArrayList<>(originalMap.entrySet());
		
		sList.sort((s1,s2)->s2.getValue().getName().compareTo(s1.getValue().getName()));
		
		Map<String,Student> sortedmap=new LinkedHashMap<>();
		
		for(Map.Entry<String,Student> m:sList) {
			
			sortedmap.put(m.getKey(),m.getValue());
		}
		
		return sortedmap;
		
	}

	public static void main(String[] args) {
		
		
		Map<String,Student> hm=new HashMap<>();
		
		hm.put("Maharashtra",new Student(1,"Nitesh","ns@gmail.com",620));
		hm.put("UttarPradesh",new Student(5,"Ashish","as@gmail.com",820));
		hm.put("Bihr",new Student(3,"Sandeep","san@gmail.com",420));
		hm.put("Gujarat",new Student(4,"Jadu","jad@gmail.com",720));
		hm.put("MadhyaPradesh",new Student(2,"Kumar","kum@gmail.com",820));
		
		
		Map<String,Student> sm= sortMapUsingStudentName(hm);
		
		sm.forEach((c,s)->System.out.println("State : "+c+"\n"
				                             +"Student roll : "+s.getRoll()+"\n"
				                             +"Student name : "+s.getName()+"\n"
				                             +"Student email : "+s.getAddress()+"\n"
				                             +"Student marks : "+s.getMarks()+"\n"
				                             +"***********************************"));

	}

}
