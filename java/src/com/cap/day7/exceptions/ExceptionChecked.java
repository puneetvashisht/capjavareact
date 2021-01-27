package com.cap.day7.exceptions;

public class ExceptionChecked {
	
	// throws - this method in certain cases can throw an Exception
	public static void m2(int value) throws Exception {
		if(value == 0) {
			//throw - exlicitly throwing exception
//			throw new Exception();
		}
		int x = 6;
		System.out.println(x/value);
		System.out.println("Inside m2 value: " + value);
	}
	
	
	public static void m1(int value) throws Exception  {
		System.out.println("Inside m1 value: " + value);
		m2(value);
	}

	public static void main(String[] args) {
		try {
			m1(0);
		}
		catch(Exception e) {
			System.out.println("wrong value passed...");
		}
			
		
		
		System.out.println("Alls well.. that ends well");

	}

}
