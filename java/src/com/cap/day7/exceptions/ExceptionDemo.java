package com.cap.day7.exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		
//		int x = 12;
		String s = null;
		
		// any errorneous code... put in try block
		try {
			char c = s.charAt(0);
			System.out.println(c);
		}
		catch(NullPointerException ne) {
			System.out.println("A");
		}
//		int result = x/0;
		
		
		System.out.println("Alls well.. that ends well");
		

	}

}
