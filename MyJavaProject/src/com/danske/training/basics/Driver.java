package com.danske.training.basics;

public class Driver {
	
	public void drive(Vehicle v) {
		v.start();
		System.out.println("Taking the vehicle out for a spin...");
		
		if(v instanceof Bus) {
			Bus b = (Bus) v;
			b.shakePeopleUp();
		}
		
		
		v.stop();
	}

}
