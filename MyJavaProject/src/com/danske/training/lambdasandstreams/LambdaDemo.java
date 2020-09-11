package com.danske.training.lambdasandstreams;

import java.util.Arrays;

import com.danske.training.basics.ChemicalElement;

public class LambdaDemo {
	
	
	public static <T> T betterElement(T param1,T param2,TwoElementPredicate<T> decider) {
		if(decider.isFirstBetter(param1, param2)) {
			return param1;
		}else {
			return param2;
		}
	}
	
	public static String betterString(String word1,String word2, TwoStringPredicate decider) {
		if(decider.isFirstBetterThanSecond(word1, word2)) {
			return word1;
		}else {
			return word2;
		}
	}
	
	
	
	//Arity : two strings in, int out
	public static int eChecker(String s1,String s2) {
		if(s1.contains("e") && !s2.contains("e")) {
			return -1;
		}else if(s2.contains("e") && !s1.contains("e")) {
			return 1;
		}else {
			return 0;
		}
	}

	public static void main(String[] args) {
		String[] strings = {"this","is","an","array","error","eggs"};
		
//		Arrays.sort(strings, (s1, s2) -> s1.length() - s2.length());
		
//		Arrays.sort(strings, (s1, s2) -> s2.length() - s1.length());
		
//		Arrays.sort(strings, (s1, s2) -> s1.substring(0, 1).compareTo(s2.substring(0, 1)));
		
//		LamdaDemo obj = new LamdaDemo();
		
		//Arrays.sort(strings, (s1, s2) -> obj.eChecker(s1, s2));
//		Arrays.sort(strings, obj::eChecker);
		
		//ClassName::new
		
//		Arrays.sort(strings, LambdaDemo::eChecker);
//		
//		System.out.println(Arrays.asList(strings));
		
		String longer = betterElement("either", "or", (x,y)->x.length() > y.length());
		System.out.println(longer);
		ChemicalElement o = new ChemicalElement(8, "O", "oxygen");
		ChemicalElement k = new ChemicalElement(19, "K", "Pot");
		
		ChemicalElement heavier = betterElement(o, k, (c1,c2) -> c1.getAtomicNumber() > c2.getAtomicNumber());
		System.out.println(heavier);
		
	}

}
