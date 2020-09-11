package com.danske.training.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	
	
	public static void myAlgo(List<String> l) {
		l.add(0,"abc");
		String some = l.get(0);
		
		// so on ................
		
		Iterator<String> it = l.iterator();
		
		while(it.hasNext()) {
			String s = it.next();
			
			//do something with s
		}
		
		for(String s : l) {
			//do something with s
		}
		
//		for(int i = 0 ; i < l.size() ; i++) {
//			String s = l.get(i);
//			// do something
//		}
		
	}
	
	public static void main(String[] args) {
		List<String> someList = new LinkedList<>();
		
		someList.add("first");
		someList.add("second");
		someList.add("3");
		
		myAlgo(someList);
		
		Integer i;
		
		System.out.println(someList.size());
		
		String s = someList.get(0);
		
		String iObj = someList.get(2);
		
		Object o = s;
		
		System.out.println(o);
		
		/*
		 * for(int i = 0; i < l.size() ; i++) { System.out.println(l.get(i)); }
		 */
	}

}
