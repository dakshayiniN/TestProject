package com.danske.training.exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		int result = method1();

		System.out.println(result);
	}

	private static int method1() {
		Calculator c = new Calculator();
		int result = 0;
		try {
			result = c.calculate(100, 0);
		}catch (ArithmeticException e) {
			System.out.println("Oh, the tragedy!! division by 0!");
			e.printStackTrace();
		}
		return result;
	}

}
