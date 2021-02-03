package com.cap.day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TestBook {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		
		books.addAll(DataExtractor.getFromAmazon("java"));
		books.addAll(DataExtractor.getFromBarnesAndNoble("java"));
		
		// Imperative
		int count = 0;
		for(Book b: books) {
			System.out.println(b);
			count ++;
			if(count>2) break;
		}
		
		System.out.println( " -----    Declarative syntax   ------ ");
		// Declarative
		
		

		
		boolean anyMatch = books.parallelStream()
		.anyMatch((b) -> b.getRating()> 4.9) ;
		System.out.println("Any books matching rating > 4.8 " + anyMatch);
	
		
//		Optional<Book> bookFound = books.stream()
////		.skip(10)
////		.distinct()
//		.filter((b) -> b.getRating()> 4.8)
//		.findAny();
////		.forEach((b)->System.out.println(b));
//		
//		if(bookFound.isPresent()) {
//			System.out.println(bookFound.get());
//		}
//		else {
//			System.out.println("No matching book Found!!");
//		}

	}

}
