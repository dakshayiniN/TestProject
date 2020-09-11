package com.danske.training.interfaces;

public class FixedArrayStack implements Stack{

	private Object[] contents;
	private int top = -1;
	
	public FixedArrayStack(int size) {
		contents = new Object[size];
	}
	
	@Override
	public void push(Object anElement) {
		//top = top + 1;
		if(top == contents.length - 1) {
			throw new StackFullException("Stack already full, size -> "+contents.length);
		}
		contents[++top] = anElement;
	}
	
	@Override
	public Object pop() {
		
		if(top == -1) {
			throw new StackEmptyException("Stack already empty!");
		}
		
		Object toBeReturned = contents[top];
		contents[top] = null;
		top--;
		return toBeReturned;
	}
	
}
