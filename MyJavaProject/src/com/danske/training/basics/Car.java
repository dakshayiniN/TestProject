package com.danske.training.basics;

public class Car extends Vehicle {

	@Override
	public void start() {
		super.start();
		System.out.println("[[[[[[[[[[Car starting!!]]]]]]]]]]");
	}
	
	@Override
	public void stop() {
		System.out.println("[[[[[[[[Car stopping!!]]]]]]]]");
	}
}
