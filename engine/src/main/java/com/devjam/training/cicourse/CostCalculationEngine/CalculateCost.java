package com.devjam.training.cicourse.CostCalculationEngine;

import java.util.ArrayList;

import com.devjam.training.cicourse.model.Order;

public final class CalculateCost {
	private CalculateCost()
	{
		
	}
	
	public static ArrayList <Double> CalculateCosts(Order orderToCalculate, String state)
	{
		ArrayList <Double> costBreakDown = new ArrayList <Double>();
		costBreakDown.add(DiscountEngine.applyLargestDiscount(orderToCalculate));
		costBreakDown.add(PromotionEngine.applyAllPromotions(orderToCalculate));
		costBreakDown.add(CalculateTax.calculateTaxForOrderInState(orderToCalculate, state));
		return costBreakDown;
		
	}
}
