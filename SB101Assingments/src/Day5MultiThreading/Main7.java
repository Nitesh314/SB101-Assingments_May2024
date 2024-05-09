package Day5MultiThreading;

public class Main7 {
	
	public static void main(String[] args) {
//		From the main method set the name of both the thread as Dhoni thread for thread 1
//		And Kohli thread for thread 2,
//		● Set the priority for thread1 as 8 and thread2 as 10.
//		Note: Both threads should run on a single object
		
		ThreadA t1=new ThreadA();
		
		
		Thread tr1=new Thread(t1);
		Thread tr2=new Thread(t1);
		
		Thread.currentThread().setName("MainThread");
		tr1.setName("Dhoni");
		tr2.setName("Kholi");
		tr1.setPriority(8);
		tr2.setPriority(10);
		
		//we start the thread
		
		tr1.start();
		tr2.start();
		
		 for (int i = 0; i < 10; i++) {
	            System.out.println(Thread.currentThread().getName() + " Priority: " + Thread.currentThread().getPriority());
	            
	        }
		
		
	}

}
