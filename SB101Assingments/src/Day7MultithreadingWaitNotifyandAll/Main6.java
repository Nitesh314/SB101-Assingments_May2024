package Day7MultithreadingWaitNotifyandAll;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main6 {
	
	public static void main(String[] args) {
		
		int arr1[]= {1,2,3,4};
		
		Thread6[] arr= {
				new Thread6(4),
				new Thread6(2),
				new Thread6(3),
				new Thread6(5),
				new Thread6(6),
				new Thread6(1),
				new Thread6(7),
		};
		
		ExecutorService ex=Executors.newFixedThreadPool(3);
		
		for(Thread6 th:arr) {
			ex.submit(th);
		}
		
		System.out.println(ex.toString());
		
		ex.shutdown();
		
	}

}
