package com.danske.training.threads;

public class ThreadSubclassDemo {

	public static void main(String[] args) {
		//This style legacy. Don't use this any more
		ThreadSubclass child = new ThreadSubclass();
		
		System.out.println("About to start child thread....");
		
		child.start();
		
		for(int i=0;i<100;i++) {
			System.out.println("This is main thread --- > "+Thread.currentThread().getName()+" "+i);
		}

	}

}
