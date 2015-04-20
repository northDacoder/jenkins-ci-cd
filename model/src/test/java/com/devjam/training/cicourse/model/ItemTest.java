package com.devjam.training.cicourse.model;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ItemTest {

	@Rule
	public ExpectedException expectedEx = ExpectedException.none();
	
	@Test
	public void negativePricesThrowException() throws ItemException {
		expectedEx.expect(ItemException.class);
		expectedEx.expectMessage("Item Amount Must Be Postitive");
		
		Item negativePriceAmount = new Item();
		negativePriceAmount.setPrice(-1.0);
	}

}
