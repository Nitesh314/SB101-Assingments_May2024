package Evaluation2;

public class B {
	
	
	public synchronized void funB(A a1) {
		
		System.out.println("Inside the funB of B");
		
		a1.fun1();
		
	}
	
	
     public synchronized void  fun1() {
		System.out.println("Inside the fun1 of B");
	}

}
