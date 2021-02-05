package com.cap.day14;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestEmployee {
	static Employee emp;
	
	@BeforeClass
	public static void setUp() {
		System.out.println("before every test case....");
		emp = new Employee(12, "Ravi", 33333.00);
	}
	
	@Test
	public void test() {
		System.out.println("test boolean value");
//		boolean result = emp.isAvailable();
//		assertTrue(result);
//		str1 == str2
				assertEquals(new String("Ravi") , emp.getName());
	}

	@Test
	public void testIncrementSalary() {
		
		
		double incrementValue = 5000.0;
		Double result = emp.incrementSalary(incrementValue);
		assertNotNull(result);
		assertEquals(38333.00, result, 0.000001);	
	}
	
	@Test(expected = RuntimeException.class)
	public void testIncrementSalaryWithNegativeValue() {
		
//		Employee emp = new Employee(12, "Ravi", 33333.00);
		double incrementValue = - 5000.0;
		double result = emp.incrementSalary(incrementValue);
		
	}
	
	@After
	public void tearDown() {
		System.out.println("after every test case....");
//		emp = null;
		
	}

}
