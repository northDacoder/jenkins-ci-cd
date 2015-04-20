package com.devjam.training.cicourse.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private List <Item> myItems = new ArrayList <Item> ();;
	
	public void addItem(Item itemToAdd)
	{
		myItems.add(itemToAdd);
	}
	
	public void removeItem(Item itemToRemove) throws OrderException
	{
		if(myItems.contains(itemToRemove))
			myItems.remove(itemToRemove);
		else
			throw new OrderException("Item: " + itemToRemove.getSku() + " Does Not Exist In Order");
	}

	public int numberOfItems() {
		return myItems.size();
	}

	public List <Item> getItemsInOrder() {
		return myItems;
	}

	public Double getOrderSubTotal() {
		double orderSubTotal = 0.0;
		for(Item oneItem: myItems)
			orderSubTotal += oneItem.getPrice();
		return Double.valueOf(orderSubTotal);
	}
	

}
