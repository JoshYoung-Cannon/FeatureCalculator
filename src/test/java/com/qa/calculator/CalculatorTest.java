package com.qa.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	@Test
	public void squareFourTest() {
		Calculator calc = new Calculator();
		assertEquals(16, calc.square(4));
	}
	
	@Test
	public void squareMinusTenTest() {
		Calculator calc = new Calculator();
		assertEquals(100, calc.square(-10));
	}
	
	@Test
	public void divideTest() {
		Calculator calc = new Calculator();
		assertEquals(10, calc.divide(20, 2));
	}
	
	@Test
	public void divideByZeroTest() {
		Calculator calc = new Calculator();
		assertEquals(4, calc.divide(20, 0));
	}
	
	
}
