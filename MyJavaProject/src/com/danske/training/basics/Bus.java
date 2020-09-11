package com.danske.training.basics;

public class Bus extends Vehicle{
	
	@Override
	public void start() {
		System.out.println("{{{{{{{{{ Bus starting!! }}}}}}}}}");
	}
	
	@Override
	public void stop() {
		System.out.println("{{{{{{{{{ Bus stopping!! }}}}}}}}");
	}
	
	public void shakePeopleUp() {
		System.out.println("((((((((( Shaking!! )))))))))");
	}

}
