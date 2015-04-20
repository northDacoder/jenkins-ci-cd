package com.devjam.training.cicourse.CostCalculationEngine;

import java.util.ArrayList;

import com.devjam.training.cicourse.discountEngine.Discount;
import com.devjam.training.cicourse.model.Order;

public class DiscountEngine {
	
	private static ArrayList<Discount> allDiscounts = new ArrayList<Discount>();
	
	public static Double applyLargestDiscount(Order orderToCalculate) {
		Double largestDiscountAmount = 0.0;
		for (Discount oneDiscount: allDiscounts)
		{
			Double thisDiscountAmount = calculateDiscountAmount(oneDiscount, orderToCalculate); 
			if(thisDiscountAmount > largestDiscountAmount)
				largestDiscountAmount = thisDiscountAmount;
		}
		return largestDiscountAmount;
	}
	
	private static Double calculateDiscountAmount(Discount oneDiscount,
			Order orderToCalculate) {
		if(oneDiscount.getMinAmount() >  orderToCalculate.getOrderSubTotal())
				return oneDiscount.getPercentOff() * orderToCalculate.getOrderSubTotal();
		return 0.0;	}

	public void expireDiscount(Discount toExpire) throws DiscountEngineException
	{
		if(allDiscounts.contains(toExpire))
			allDiscounts.remove(toExpire);
		else
			throw new DiscountEngineException("Discount Not Found");
	}


}
