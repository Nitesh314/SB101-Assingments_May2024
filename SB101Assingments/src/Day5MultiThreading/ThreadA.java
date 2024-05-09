package Day5MultiThreading;

public class ThreadA implements Runnable {

	@Override
	public void run() {
		
		for(int i=1;i<=10;i++) {
			
			System.out.println(Thread.currentThread().getName()+" Priority "+Thread.currentThread().getPriority());
		}
		
	}

}
