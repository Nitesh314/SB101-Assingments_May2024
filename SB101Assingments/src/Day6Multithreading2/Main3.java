package Day6Multithreading2;

public class Main3 {
	
	public static void main(String[] args) {
		
		EvenThread et=new EvenThread();
		
		Thread tr=new Thread(et);
		
		
		
		tr.start();
		
		try {
			tr.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=1;i<=20;i++) {
			if(i%2!=0) {
				System.out.println("Odd : "+i);
			}
		}
	}

}
