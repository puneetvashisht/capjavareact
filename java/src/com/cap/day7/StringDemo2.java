package com.cap.day7;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String s = "23";
		
		try {
			int j = Integer.parseInt(s);
			System.out.println(j + "");
			
		}
		catch(NumberFormatException nfe) {
			nfe.printStackTrace();
		}
		
		
		
		
		//mutable and single threaded solution
		StringBuilder sb = new StringBuilder("");
		
		//mutable and multiple threads solution
//		StringBuffer
		for(int i=0; i<1000; i++) {
			
			//too many objects created
//			s = s + i;
			sb.append(i);
			
			
		}
		
		System.out.println(sb.toString());
		
	}

}
