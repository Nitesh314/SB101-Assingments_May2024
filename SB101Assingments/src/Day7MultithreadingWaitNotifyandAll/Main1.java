package Day7MultithreadingWaitNotifyandAll;

public class Main1 {
	
	//Q1)Make a thread that will calculate a product of 1 to 10 and another thread (main
//	thread) will print the calculated value of the first thread.
//	Note: make use of the wait and notify method.
	
	public static void main(String[] args) {
		
		Thread1 th1=new Thread1(1);
		
		Thread th=new Thread(th1);
		
		th.start();
		
		try {
			th.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		synchronized (th1) {
			
			System.out.println("printing the product of 1 to 10");
			
			try {
				th1.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(th1.pro);
			
		}
		
	}
	
	

}
