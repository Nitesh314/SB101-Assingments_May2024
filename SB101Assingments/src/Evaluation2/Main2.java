package Evaluation2;



public class Main2 {
	   int product = 1; // Shared resource
	    private final Object lock = new Object(); // Lock object for synchronization

	    public static void main(String[] args) {
	        Main2 main2 = new Main2();

	        // Runnable for calculating the product
	        Runnable r = main2.getRes();

	        // Thread for calculating the product
	        Thread calcThread = new Thread(r);
	        calcThread.start();

	        synchronized(main2.lock) {
	            try {
	                main2.lock.wait(); // Main thread waits for the notification
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }

	        // Main thread prints the calculated product after being notified
	        System.out.println("Product of 1 to 10 is: " + main2.product);
	        System.out.println("End of the main thread");
	    }

	    public Runnable getRes() {
	        return () -> {
	            synchronized (lock) {
	                product = 1;
	                for (int i = 1; i <= 10; i++) {
	                    product *= i;
	                }
	                lock.notify(); // Worker thread notifies the main thread
	            }
	        };
	    }
}
