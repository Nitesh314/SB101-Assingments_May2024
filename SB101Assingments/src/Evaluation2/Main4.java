package Evaluation2;

public class Main4 {
	
//	Q4/- Write a multithreading application which should perform the following task:
//		● Start the 3 thread
//		● Give the name of those threads as Kohli, Dhoni, Rohit
//		● Set the max priority to the Dhoni thread.
//		● Kohli thread should print from 1 to 10 number
//		● Dhoni thread should print Addition of first 20 number.
//		● Rohit Thread should print the product of first 10 number.
//		Note: Make sure that first Dhoni thread should print then Rohit Thread and then Kohli
//		Thread.
	
	public static void main(String[] args) {
		
		Runnable r1=()->{
			
			
			
			Thread.currentThread().setName("Kohli");
			
			for(int i=1;i<=10;i++) {
				System.out.println("Kohli : "+i);
			}
			
		};
		
        Runnable r2=()->{
        	Thread.currentThread().setName("Dhoni");
            int sum=0;
            for(int i=1;i<=20;i++) {
            	sum+=i;
            }
            System.out.println("Sum of all Number from Dhoni : "+sum);
        	
		};
		
        Runnable r3=()->{
        	Thread.currentThread().setName("Rohit");
        	
        	int pro=1;
        	
        	for(int i=1;i<=10;i++) {
        		pro*=i;
        	}
        	System.out.println("Product of all Number from Rohit : "+pro);
        	
		};
		
		Thread tr1=new Thread(r1);
		Thread tr2=new Thread(r2);
		Thread tr3=new Thread(r3);
		
		
		
		tr2.setPriority(Thread.MAX_PRIORITY);
		
		try {
			tr2.start();
			tr2.join();
			
			tr3.start();
			tr3.join();
			
			tr1.start();
			tr1.join();
			
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
