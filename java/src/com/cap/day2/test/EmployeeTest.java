package com.cap.day2.test;

import java.util.Date;

import com.cap.day2.Employee;

import static java.lang.Math.*;
//import static java.lang.Math.floor;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp;
		
		String s = "nice sunny morning!!";
		
		// instance method.. only available with objects
		Date today = new Date();
		System.out.println(today.getHours());
		
		// static method... can be directly invoked with class name
		System.out.println(ceil(4.6));
		System.out.println(floor(4.6));
		
		System.out.println(today);

	}

}
