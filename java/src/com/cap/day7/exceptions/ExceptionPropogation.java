package com.cap.day7.exceptions;

public class ExceptionPropogation {
	
	public static void m2(int value) throws ArithmeticException{
		int x = 6;
//		try {
			// dangerous or error prone codes
			System.out.println(x/value);
//		}
//		catch(ArithmeticException e) {
//			System.out.println(x/1);
//		}
			
		System.out.println("Inside m2 value: " + value);
		
		
		
	}
	
	
	public static void m1(int value) throws RuntimeException {
		System.out.println("Inside m1 value: " + value);
		m2(value);
	}

	public static void main(String[] args) {
		
//		try {
			m1(0);
//		}
//		catch(ArithmeticException e) {
//			System.out.println("Handling inside main method");
////			m1(2);
//			
//		}
		
		
		System.out.println("Alls well.. that ends well");

	}

}
