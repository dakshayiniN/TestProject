package com.danske.training.interfaces;

public class AlgorithmThatUsesStack {
	
	public void fill(Stack s) {
		for(int i=0;i<10;i++) {
			s.push(i);
			System.out.println("Pushed ----> "+i+" into the stack");
		}
	}

}
