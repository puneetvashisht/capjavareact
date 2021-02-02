package com.cap.day11;

public class TestPayments {
	
//	public static void performNEFT() {
//		System.out.println("performing NEFT payment");
//	}
//	
//	public static void performRTGS() {
//		System.out.println("performing RTGS payment");
//	}
	
	public static void main(String[] args) {
		
		Payment payment = new NEFTPayment();
		payment.perform();
		
		Payment payment2 = new RTGSPayment();
		payment2.perform();
		
		// lamda expression must follow the syntax of interface method
		Payment payment3 = ()-> System.out.println("performing UPI payment");
		payment3.perform();
		
		Payment payment4 = ()-> System.out.println("performing cheque payment");
		payment4.perform();
		
		Calc calc = (int x, int y)-> {return (x+y);};
		int result = calc.perform(2,3);
		System.out.println(result);
		
		Calc calc2 = (int x, int y)-> {return (x*y);};
		int result2 = calc2.perform(2,3);
		System.out.println(result2);
	}

}
