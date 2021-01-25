package com.cap.day6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

	public static void main(String[] args) {
		String input = "Shop,Mop,Hopping,Chopping";
		
		
		Pattern pattern = Pattern.compile("hop");
		Matcher matcher = pattern.matcher(input);
		
//		System.out.println(matcher.matches());
		while (matcher.find()){
		    System.out.println(matcher.group() + ": " +matcher.start() + ": " + matcher.end());
		}

	}

}
