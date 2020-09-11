package com.danske.training.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<String,Integer> runsMap = new LinkedHashMap<>();
		runsMap.put("warner", 73);
		runsMap.put("virat", 101);
		runsMap.put("dhoni", 99);
		runsMap.put("samson", 19);
		runsMap.put("rahul",73);
		
		
		Scanner kb = new Scanner(System.in);
		while(true) {
			System.out.println("Enter name: ");
			String name = kb.nextLine();
			
			if(name.equals("quit")) {
				break;
			}
			
			if(runsMap.containsKey(name)) {
				System.out.println("We do have runs for "+name);
				System.out.println("Runs for "+name+" = "+runsMap.get(name));
			}else {
				System.out.println("No info for "+name);
			}
		}
		
		Set<String> keys = runsMap.keySet();
		for(String aKey : keys) {
			System.out.println(aKey +" -----> "+runsMap.get(aKey));
		}
		
	}

}
