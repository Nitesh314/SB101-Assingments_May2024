package Day7MultithreadingWaitNotifyandAll;

import java.util.concurrent.Callable;

public class Thread6 implements Callable<Integer>{
	
//	Q6/- Create a ThreadPool of 3 threads, submit the 6 tasks using Callable, and
//	from each task check whether the supplied number is Odd or even, if the number
//	is Odd return “Odd Number” and if the number is even then return “Even
//	Number”.
//	Note: Supply the number to the Callable task through the constructor of the
//	Callable task class.
	
	int num;
	
	public Thread6(int num) {
	super();
	this.num = num;
  }



	@Override
	public Integer call() throws Exception {
		
		if(num%2==0) {
			System.out.println("Even Number :"+num);
		}else {
			System.out.println("Odd Number :"+num);
		}
		
		
		return null;
	}

}
