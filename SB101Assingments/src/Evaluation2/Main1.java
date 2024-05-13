package Evaluation2;

public class Main1 {
	
	public static void main(String[] args) {
		
		A a1=new A();
		B b1=new B();
		
		
		Runnable r=()->a1.funA(b1);
		
		
		Runnable r1=()->b1.funB(a1);
			
		Thread th1=new Thread(r);//it is use for runnable 1
		
		Thread th2=new Thread(r1);//it is use for runnable 2
		
		th1.start();
		th2.start();
		
	}

}
