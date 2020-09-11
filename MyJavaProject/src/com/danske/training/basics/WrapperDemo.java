package com.danske.training.basics;

public class WrapperDemo {

	public static void main(String[] args) {
		int i = 10;
		Integer iObj = new Integer(i);
		
		int value = iObj;//.intValue();
		
		iObj++;
	}

}
