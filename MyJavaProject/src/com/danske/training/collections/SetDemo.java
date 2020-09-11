package com.danske.training.collections;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> words = new TreeSet<>();
		Scanner kb = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter a word: ");
			String aWord = kb.nextLine();
			if(!words.add(aWord)) {
				System.out.println("That is a duplicate!");
			}
			if(words.size() == 10) {
				break;
			}
		}
		System.out.println("Here are all the words..");
		for(String aWord : words) {
			System.out.println(aWord);
		}
	}

}
