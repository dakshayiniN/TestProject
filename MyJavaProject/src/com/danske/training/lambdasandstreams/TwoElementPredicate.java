package com.danske.training.lambdasandstreams;

@FunctionalInterface
public interface TwoElementPredicate<T> {
	
	public boolean isFirstBetter(T o1,T o2);

}
