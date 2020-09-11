package com.danske.training.basics;

public class LiteralDemo {

		
	public static void main(String[] args) {
//		int i = 10;

		long l = 10;
		
		int i = (int) l;
		
		
		doSomething(10L);

	}

	private static void doSomething(long i) {

		System.out.println("I am an long: " + i);

	}

	private static void doSomething(int i) {

		System.out.println("I am an int: " + i);

	}

}
