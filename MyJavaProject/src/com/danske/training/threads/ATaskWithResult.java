package com.danske.training.threads;

import java.util.concurrent.Callable;

public class ATaskWithResult implements Callable<Long>{
	
	@Override
	public Long call() throws Exception {
		long sum = 0;
		for(int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+" callable --->"+i);
			sum += i;
		}
		return sum;
	}

}
