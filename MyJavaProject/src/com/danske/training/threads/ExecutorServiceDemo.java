package com.danske.training.threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo {
	
	/*
	 * public static void doSomethingInParallel() { for(int i = 0; i < 100; i++) {
	 * System.out.println(Thread.currentThread().getName()+" --- > "+i); } }
	 */

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService threadPool = Executors.newFixedThreadPool(4);
		
		ASampleTask aTask = new ASampleTask();
		System.out.println("About to execute a task using pool...");
		threadPool.execute(aTask);
		
		ATaskWithResult taskWithResult = new ATaskWithResult();
		Future<Long> asyncResult = threadPool.submit(taskWithResult);
		
		System.out.println(asyncResult.isDone());
		
//		threadPool.execute(ExecutorServiceDemo::doSomethingInParallel);
		for(int i=0;i<100;i++) {
			System.out.println(Thread.currentThread().getName()+" --- > "+i);
		}
		
		Long result = asyncResult.get();
		System.out.println("Async result ---> "+result);
		threadPool.shutdown();
	}

}
