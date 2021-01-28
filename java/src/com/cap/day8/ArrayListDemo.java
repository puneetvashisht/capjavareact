package com.cap.day8;

import java.util.ArrayList;

import com.cap.day2.Employee;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		String str1 = "s1";
		String str2 = "s2";
		String str3 = "s3";
		
//		String strArray[] = {str1, str2, str3};
		
//		strArray[3] =  "s4";
		
		ArrayList<String> list = new ArrayList<String>();
		list.add(str1);
		list.add(str2);
		list.add(str3);
		list.add("s4");
//		list.add(new Employee());
		System.out.println(list);
		
		
		for(String s : list) {
//			String s = (String)o;
			System.out.println(s.toUpperCase());
		}
		
		
		

	}

}
