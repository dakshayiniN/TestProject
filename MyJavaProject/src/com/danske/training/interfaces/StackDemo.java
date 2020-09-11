package com.danske.training.interfaces;

 import com.danske.training.basics.*;
 
public class StackDemo {

	public static void main(String[] args) {
		FixedArrayStack s = new FixedArrayStack(9);
		AlgorithmThatUsesStack algo = new AlgorithmThatUsesStack();
		algo.fill(s);
	}

}
