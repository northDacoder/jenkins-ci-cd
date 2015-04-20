package com.devjam.training.cicourse.discountEngine;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DiscountTest {

	@Rule
	public ExpectedException expectedEx = ExpectedException.none();
	
	@Test
	public void negativeMinAmountThrowsException() throws DiscountException {
		expectedEx.expect(DiscountException.class);
		expectedEx.expectMessage("Discount Amount Must Be Postitive");
		
		Discount negativeDiscountAmount = new Discount();
		negativeDiscountAmount.setMinAmount(-1.0);
	}

	@Test
	public void zeroPercentOffNotAllowed() throws DiscountException{
		expectedEx.expect(DiscountException.class);
		expectedEx.expectMessage("Percent Off Amount Must Be Greater Than Zero");
		
		Discount zeroPercentAmount = new Discount();
		zeroPercentAmount.setPercentOff(0.0);
	}

	@Test
	public void testSetPercentOff() {
		//fail("Not yet implemented");
	}

}
