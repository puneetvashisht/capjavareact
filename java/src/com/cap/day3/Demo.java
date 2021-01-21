package com.cap.day3;

public class Demo {

	public static void main(String[] args) {
//		int aditi = 90;
//		int aman = 98;
//		int aniket = 95;
		
//		
		String names[] = new String[4];
		names[0] = "Aditi";
		names[1] = "Aman";
		names[2] = "Aniket";
		names[3] = "Priya";
		
		//array
		int scores[] = new int[4];
		
		scores[0] = 90;
		scores[1] = 98;
		scores[2] = 95;
		scores[3] = 92;
		
//		System.out.println(names[2]  + " : " +scores[2]);
		for(int i=0; i< scores.length ; i++) {
//			System.out.println(i);
			System.out.println(names[i]  + " : " +scores[i]);
		}
		
		System.out.println("end");

	}

}
