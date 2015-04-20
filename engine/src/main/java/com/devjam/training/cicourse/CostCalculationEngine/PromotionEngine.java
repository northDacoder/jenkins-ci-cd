package com.devjam.training.cicourse.CostCalculationEngine;

import java.util.ArrayList;
import java.util.List;

import com.devjam.training.cicourse.discountEngine.Promotion;
import com.devjam.training.cicourse.model.Item;
import com.devjam.training.cicourse.model.Order;

public class PromotionEngine {
	
	private static List<Promotion> allPromotions= new ArrayList<Promotion>();
	
	public static Double applyAllPromotions(Order orderToCalculate) {
		Double totalPromotionAmount = 0.0;
		for (Promotion onePromotion : allPromotions)
		{
			totalPromotionAmount += calculatePromotionAmount(onePromotion, orderToCalculate); 
		}
		return totalPromotionAmount;
	}
	
	private static Double calculatePromotionAmount(Promotion onePromotion,
			Order orderToCalculate) {
		for(Item oneItem : orderToCalculate.getItemsInOrder())
		{
			if(onePromotion.getSkuForPromotion().equals(oneItem.getSku()))
				return onePromotion.getAmountOfPromotion();
		}
		return 0.0;
	}

	public void expirePromotion(Promotion toExpire) throws PromotionEngineException
	{
		if(allPromotions.contains(toExpire))
			allPromotions.remove(toExpire);
		else
			throw new PromotionEngineException("Discount Not Found");
	}



}
