package com.danske.training.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingDemo {

	public static void main(String[] args) {
		String[] words = {"this","is","an","array","with","bizzare","words","like","xylophone"};
		List<String> wordList = Arrays.asList(words);
		
		Collections.sort(wordList);
		System.out.println(wordList);
		//Collections.sort(wordList, new StringLengthComparator());
		
		
		Collections.sort(wordList, new Comparator<String>() { 
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			};
		} );
		System.out.println(wordList);
	}

}
