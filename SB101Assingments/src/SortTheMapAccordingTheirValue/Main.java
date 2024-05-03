package SortTheMapAccordingTheirValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
	
	public Map<String,Student> sortbyValue(HashMap<String,Student> hm){
		
        List<Map.Entry<String,Student>> sList=new LinkedList<>(hm.entrySet());
		
	    Collections.sort(sList,(s1,s2)->s1.getValue().getMarks()<s2.getValue().getMarks()?+1:-1);
	    
	    Map<String,Student> temp=new LinkedHashMap<>();
	    
	    for(Map.Entry<String,Student> s:sList) {
	    	temp.put(s.getKey(),s.getValue());
	    }
		
	    return temp;
	}
	
	
	public static void main(String[] args) {
		
		// sort the marks of student of the state toper.
		
		HashMap<String, Student> hm=new HashMap<>();
		
		hm.put("Maharashtra",new Student(1,"Nitesh","Vasai",620));
		hm.put("UttarPradesh",new Student(5,"Ashish","Jaunpur",820));
		hm.put("Bihr",new Student(3,"Sandeep","Bhagalpur",420));
		hm.put("Gujarat",new Student(4,"Jadu","Varodara",720));
		hm.put("MadhyaPradesh",new Student(2,"Kumar","Bhopal",820));
		
	    
	    //creating the object of Main class for calling the non-static methods.
		
		Main main=new Main();
		
		Map<String,Student> map=main.sortbyValue(hm);
		
		for(Map.Entry<String,Student> s:map.entrySet()) {
	    	System.out.println("State : "+s.getKey()+"\n"+"Student details"+"\n"
	                           +"roll : "+s.getValue().getRoll()+"\n"
	                           +"name : "+s.getValue().getName()+"\n"
	                           +"address : "+s.getValue().getAddress()+"\n"
	                           +"Marks : "+s.getValue().getMarks()+"\n"
	                           +"*********************************");
	    }
	    
	}

}
