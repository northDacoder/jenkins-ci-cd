package com.devjam.training.cicourse.model;

import junit.framework.Assert;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class OrderTest {

	@Rule
	public ExpectedException expectedEx = ExpectedException.none();
	
	@Test
	public void addingItemToEmptyOrder() throws ItemException {
		Order orderToTest = new Order();
		Item dummyItem = new Item();
		dummyItem.setDescription("Test Description");
		dummyItem.setPrice(123.45);
		dummyItem.setSku("111-111");
		
		orderToTest.addItem(dummyItem);
		
		Assert.assertEquals(1,  orderToTest.numberOfItems());
	}
	
	@Test
	public void canHaveTwoOfSameItemsInOrder() throws ItemException {
		Order orderToTest = new Order();
		Item dummyItem = new Item();
		dummyItem.setDescription("Test Description");
		dummyItem.setPrice(123.45);
		dummyItem.setSku("111-111");
		
		orderToTest.addItem(dummyItem);
		orderToTest.addItem(dummyItem);
		
		Assert.assertEquals(2,  orderToTest.numberOfItems());
	}

	@Test
	public void removingItemThatDoesNotExistThrowsException() throws OrderException, ItemException {
		String skuToRemove = "123-ABC";
		expectedEx.expect(OrderException.class);
		expectedEx.expectMessage("Item: " + skuToRemove + " Does Not Exist In Order");
		
		Order orderToTest = new Order();
		Item doesntExist = new Item();
		doesntExist.setDescription("Test Description");
		doesntExist.setPrice(123.45);
		doesntExist.setSku(skuToRemove);
		
		orderToTest.addItem(new Item());
		orderToTest.removeItem(doesntExist);
	}

}
