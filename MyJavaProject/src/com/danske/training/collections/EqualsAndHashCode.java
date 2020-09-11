package com.danske.training.collections;

public class EqualsAndHashCode {

	public static void main(String[] args) {
		Object s1 = "abc";
		Object s2 = "abc";
		

		if(s1.equals(s2)) {
			System.out.println(s1.hashCode() == s2.hashCode());
		}
	}

}
