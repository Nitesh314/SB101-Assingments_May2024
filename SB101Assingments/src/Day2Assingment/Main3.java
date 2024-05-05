package Day2Assingment;

import java.util.Arrays;
import java.util.List;

public class Main3 {
	
	public static void main(String[] args) {
		
		List<String> cities=Arrays.asList("Vasai","Nallasopara","Virar","Mumbai","Andheri","Gorgaoun","Chinchoti");
		
		PrintList p=(c)->System.out.println(c);
		
		p.display(cities);
		
		
	}

}
