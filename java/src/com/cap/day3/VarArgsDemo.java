package com.cap.day3;

import java.util.Arrays;

public class VarArgsDemo {
	
	
//	static int sum(int a , int b, int c) {
//		return a + b + c;
//	}
//	
//	static int sum(int a , int b) {
//		return a + b;
//	}
	
	static int sum( int ...numbers ) {
//		System.out.println(numbers[0]);
		int total = 0;
		for(int n: numbers) {
			total = total + n;
		}
		return total;
	}
	
	public static void main(String... args) {
		
		int values[] = {3,4};
		int res = sum(values);
		
		int arr[] = {3,1,45,5,34};
		
		Arrays.sort(arr);
		
		
		for(int a : arr) {
			System.out.println(a);
		}
		
		int result = sum(2,3);
		System.out.println(result);
		
		result = sum(2,3, 4);
		System.out.println(result);
		
		result = sum(1,2,3,4);
		System.out.println(result);
	}

}
