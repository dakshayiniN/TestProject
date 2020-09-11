package com.danske.training.threads;

public class ThreadSubclass extends Thread {
	
	@Override
	public void run() {
		for(int i = 0; i < 100 ; i++) {
			System.out.println("This is Child Thread --- > "+Thread.currentThread().getName()+" "+i);
		}
	}

}
