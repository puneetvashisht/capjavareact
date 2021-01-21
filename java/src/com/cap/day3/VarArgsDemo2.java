package com.cap.day3;

import java.util.Arrays;

public class VarArgsDemo2 {
	
	
	public static void printFirstLetter(String... names) {
		
		for(String name: names) {
			System.out.println(name.charAt(0));
		}
		
//		System.out.println(s1.charAt(0));
	}

	public static void main(String[] args) {
		
		String name1 = new String("Ravi");
		String name2 = null;
		
		System.out.println(name2);
		
		String names[] = {"Ravi", "Amit",  "Arijit"};
		
		int result = Arrays.binarySearch(names, "Arijit");
		System.out.println("Result: " + result);
		
//		printFirstLetter(names);

	}

}
