package Evaluation2;

public class A {
	
	public synchronized void funA(B b1) {
		
		System.out.println("inside the funA of A");
		
		b1.fun1();
		
	}
	
	
     public synchronized void  fun1() {
		
    	 System.out.println("inside fun1 of A");
   
	}

}
