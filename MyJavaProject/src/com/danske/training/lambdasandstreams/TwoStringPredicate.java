package com.danske.training.lambdasandstreams;

@FunctionalInterface
public interface TwoStringPredicate {
	
	public boolean isFirstBetterThanSecond(String s1,String s2);

}
