package Evaluation2;

import java.util.concurrent.Callable;

public class Thread3 implements Callable<Integer>{
	
	int pro;
	

	public Thread3(int pro) {
		super();
		this.pro = pro;
	}


	@Override
	public Integer call() throws Exception {
		int product=1;
		for(int i=1;i<=pro;i++) {
			product*=i;
		}
		return product;
	}

}
