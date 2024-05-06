package Day3Assingment;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main2 {
	
	public static void main(String[] args) {
		
//		Predicate
//		Supplier
//		Consumer
//		Function
		
		//using predicate
		Predicate<Integer> pr=(p)->p>500;
		
		System.out.println(pr.test(550));
		
		
		//using supplier
		Supplier<String> sup=()->"hello ji....";
		
		System.out.println(sup.get());
		
		//using consumer
		Consumer<Integer> con=c->System.out.println(c);
		con.accept(1000);
		
		//using Function<t R>
		Function<String,Integer> fun=s->Integer.parseInt(s);
		
		System.out.println(fun.apply("1000")+200);
		
	}

}
