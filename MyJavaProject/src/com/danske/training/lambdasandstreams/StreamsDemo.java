package com.danske.training.lambdasandstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void main(String[] args) {
		String[] strings = {"this","is","an","array","error","eggs"};
		
		//Stream.of(strings).parallel().forEach(s -> System.out.println(s));

		/*
		 * for(String s : strings) { System.out.println(s); }
		 */
		
		//Stream.of(strings).map(s->s.length()).forEach(i -> System.out.println(i));
		List<Integer> iList = Stream.of(strings).map(s->s.length()).collect(Collectors.toList());
		System.out.println(iList.size());
	}

}
