package com.yash.tdddemo;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yash.tdddemo.util.StringCalculator;

public class StringCalculatorTest {
	
	private String ANY_NUMBER_AS_STRING="110,20";

	@Test
	public void testCalculate_GivenEmptyString_ShouldRetutn0AsInteger() {
		StringCalculator stringCalculator = new StringCalculator();
		int result = stringCalculator.calculate("");
		assertEquals(0, result);
	}
	
	@Test
	public void testCalculate_given10StringAsinputOutputShouldAs10Integer(){
		StringCalculator calulatorObj = new StringCalculator();
		int result = calulatorObj.calculate("10");
		assertEquals(10, result);
	}
	
	@Test
	public void testCalculate_given20StringAsinputOutputShouldAs20Integer(){
		StringCalculator calulatorObj = new StringCalculator();
		int result = calulatorObj.calculate("20");
		assertEquals(20, result);
	}
	
	@Test
	public void testCalculate_givenUserInputAsStringOutputShouldSumInteger(){
		StringCalculator calulatorObj = new StringCalculator();
		int result = calulatorObj.calculate(ANY_NUMBER_AS_STRING);
		assertEquals(130, result);
	}
}
