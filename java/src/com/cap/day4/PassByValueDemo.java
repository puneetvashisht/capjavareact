package com.cap.day4;

class Number{
	int value;
	public Number(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Number [value=" + value + "]";
	}
	
	
}

public class PassByValueDemo {
	
//	String a = "test";
//	String b = a;
	
//	primitives
//	public static void printNumber(int a) {
//		a= 4;
//		System.out.println("printNumber: " + a);
//	}
//	reference
	public static void printNumber(Number a) {
		a.value= 4;
		System.out.println("printNumber: " + a);
	}
	

	public static void main(String[] args) {
		Number x = new Number(5);
		printNumber(x);
		System.out.println("main: " + x);

	}

}
