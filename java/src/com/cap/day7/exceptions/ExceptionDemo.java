package com.cap.day7.exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		
//		int x = 12;
		String s = "adnb";
		
		// any errorneous code... put in try block
		try {
			char c = s.charAt(0);
			System.out.println(c);
			
			int x  = 12/0;
		}
		
		catch(ArithmeticException ne) {
			System.out.println("A");
			ne.printStackTrace();
		}
		catch(Exception ne) {
			System.out.println("A");
			ne.printStackTrace();
		}
//		int result = x/0;
		
		
		System.out.println("Alls well.. that ends well");
		

	}

}
