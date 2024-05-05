package Day2Assingment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main1 {
	
	public static void main(String[] args) {
		
	  List<String> cities=Arrays.asList("Vasai","Nallasopara","Virar","Mumbai","Andheri","Gorgaoun","Chinchoti");
		
	   Collections.sort(cities,(c1,c2)->c2.compareTo(c1));
	   
	   cities.forEach((s)->System.out.println(s.toUpperCase()));
	   
	}

}
