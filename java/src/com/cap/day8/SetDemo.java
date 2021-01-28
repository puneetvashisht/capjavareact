package com.cap.day8;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> fruits = new HashSet<>();
		boolean b1 = fruits.add("apple");
		boolean b2 = fruits.add("apple");
		System.out.println(b1);
		System.out.println(b2);
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("mango");
		
		System.out.println(fruits);
		

	}

}
