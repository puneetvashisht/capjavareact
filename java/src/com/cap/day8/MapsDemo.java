package com.cap.day8;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {

	public static void main(String[] args) {
		Map<Integer, String> employeeMap = new HashMap<>();
		employeeMap.put(2, "aman.singh1_da17@gla.ac.in");
		employeeMap.put(3,  "aniket.solanki_cs17@gla.ac.in");
		employeeMap.put(4,  "ankita.maurya_ccv17@gla.ac.in");
		
		System.out.println(employeeMap);
		
		System.out.println(employeeMap.get(2));

	}

}
