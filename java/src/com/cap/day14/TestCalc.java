package com.cap.day14;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalc {

	@Test
	public void testCalcAdd() {
		int a = 2, b = 4;			
		int result = Calc.add(a, b);
		//verification 
		assertEquals(6, result);
	}
	
	@Test
	public void testCalcAddWithNegativeValues() {
		int a = -2, b = -4;			
		int result = Calc.add(a, b);
		//verification 
		assertEquals(-6, result);
	}
	
	
	@Test
	public void testCalcDivide() {
		int a = 4, b = 4;			
		double result = Calc.divide(a, b);
		//verification 
		assertEquals(1.0, result, 0.0001);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testCalcDivideByZero() {
		int a = 4, b = 0;			
		double result = Calc.divide(a, b);
		//verification 
//		assertEquals(1.0, result, 0.0001);
	}

}
