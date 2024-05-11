package Day7MultithreadingWaitNotifyandAll;

public class Thread1 implements Runnable {
	
	int pro;
	
	

	public Thread1(int pro) {
		super();
		this.pro = pro;
	}



	@Override
	public void run() {
		
		synchronized (this) {
			System.out.println("printing the product of 1 to 10");
			
			for(int i=1;i<=10;i++) {
				pro*=i;
			}
			this.notify();
		}
	}

}
