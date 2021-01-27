package com.cap.day7;

import java.util.Arrays;

public class ReverseArray {
	
	public static void main(String[] args) {
		int arr[] = {34,2,23,33};
		
		int resultArr[] = new int[arr.length];
		
		int i = 0;
		
		for(int item: arr) {
			StringBuilder builder = new StringBuilder(item + "");
			int reversedValue = Integer.parseInt(builder.reverse().toString());
			System.out.println(reversedValue);
			
			resultArr[i] = reversedValue;
			i++;
			
		}
		
		Arrays.sort(resultArr);
		
		for(int j : resultArr) {
			System.out.println(j);
		}
		
	}

}
