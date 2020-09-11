package com.danske.training.interfaces;

public class DynArrayStack implements Stack{

	private Object[] contents;
	private int top = -1;
	
	public DynArrayStack() {
		contents = new Object[10];
	}
	
	@Override
	public void push(Object anElement) {
		//top = top + 1;
		
		if(top == contents.length -1) {
			Object[] newContents = new Object[contents.length + contents.length ];
			System.arraycopy(contents, 0, newContents, 0, contents.length);
			this.contents = newContents;
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
