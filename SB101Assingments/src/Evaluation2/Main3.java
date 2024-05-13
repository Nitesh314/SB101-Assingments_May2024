package Evaluation2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main3 {
	
//	Q3/- Create a ThreadPool of 3 threads, submit the 6 tasks using Callable, and from each
//	task calculate the product of supplied number from 1 and return the product from each
//	thread. And then print the result.
//	Note: Supply the number to the Callable task through the constructor of the Callable
//	task class.
//	Example if we supply 5 then the product should be (1*2*3*4*5 =120 )
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		Thread3[] arr= {
				new Thread3(5),
				new Thread3(1),
				new Thread3(4),
				new Thread3(3),
				new Thread3(6),
				new Thread3(2),
		};
		
		ExecutorService ex= Executors.newFixedThreadPool(3);
		
		Future<Integer> res;
		
	    for(Thread3 th3:arr) {
	         res= ex.submit(th3);
	         
	         System.out.println("product is : "+res.get());
	    	
	    }
	    
	    
	    
	    ex.shutdown();
		
	}

}
