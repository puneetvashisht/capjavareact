package com.cap.day8;

import java.util.ArrayList;
import java.util.List;

public class FruitDemo {

	public static void main(String[] args) {
		List<Fruit> fruits = new ArrayList<>();
		fruits.add(new Fruit("apple"));
		fruits.add(new Fruit("mango"));
		fruits.add(new Fruit("banana"));
		
		
	System.out.println(fruits);
	Fruit f = new Fruit("apple");	
	
	System.out.println(f.equals(new Fruit("apple")));
	System.out.println(fruits.contains(f));
	
	
		

	}

}
