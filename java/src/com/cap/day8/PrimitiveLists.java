package com.cap.day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimitiveLists {

	public static void main(String[] args) {
		
//		Object obj = 34;
//		
//		
//		// Auto boxing of primitives to wrapper types
//		int x = 34;
		Integer y = new Integer(34);
		int z = y;
//		
//		Double d = 34.34;
//		
//		
		
		List<Integer> numberList = new ArrayList<>();
		numberList.add(44);
		numberList.add(35);
		numberList.add(40);
		System.out.println(numberList);
		Collections.sort(numberList);
		
		System.out.println(numberList);
		
		
	}

}
