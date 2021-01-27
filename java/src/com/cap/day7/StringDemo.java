package com.cap.day7;

public class StringDemo {

	public static void main(String[] args) {
//		String str1 = new String("test");
		String str1 = "test";
		
//		String str2 = new String("test");
		String str2 = "test";
		String s = str1.substring(2);
		
		
		System.out.println(str1);
		// literal syntax
//		String s = "test";
		
		System.out.println(str1.equals(str2));
		
		//reference comparision
		System.out.println(str1 == str2);
		

	}

}
