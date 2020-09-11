package com.danske.training.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.danske.training.basics.ChemicalElement;

public class GenericMethodDemo {
	
	public static <T> void sort(List<T> l,Comparator<T> c) {
		//some impl
	}

	
	public static void main(String[] args) {
		List<String> sList = new ArrayList<>();
		List<ChemicalElement> cList = new ArrayList<>();
		
		sort(sList,new StringLengthComparator());
	}

}
