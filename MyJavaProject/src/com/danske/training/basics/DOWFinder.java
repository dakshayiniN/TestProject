package com.danske.training.basics;
import javax.print.attribute.standard.Fidelity;

public class DOWFinder {
	
	
	String findDOW(int day,int month,int year) {
		
		int totalDays = (year - 1900) * 365;
		totalDays += (year - 1900)/4;
		if(year % 4 == 0 && month <= 2) {
			totalDays--;
		}
		
		switch(month) {
		case 12:
			totalDays += 30;
		case 11:
			totalDays += 31;
		case 10:
			totalDays += 30;
		case 9: 
			totalDays += 31;
		case 8:
			totalDays += 31;
		case 7: 
			totalDays += 30;
		case 6: 
			totalDays += 31;
		case 5:
			totalDays += 30;
		case 4:
			totalDays += 31;
		case 3:
			totalDays += 28;
		case 2:
			totalDays += 31;
		}
		
		totalDays += day;
		
		int dowIndex = totalDays % 7;
		String[] daysOfWeek = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		return daysOfWeek[dowIndex];
	}

	public static void main(String[] args) {
//		findDOW(7,9,2020);
		DOWFinder finder = new DOWFinder();
		int day = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int year = Integer.parseInt(args[2]);
		String dow = finder.findDOW(day,month,year);
		System.out.println(dow);

	}

}
