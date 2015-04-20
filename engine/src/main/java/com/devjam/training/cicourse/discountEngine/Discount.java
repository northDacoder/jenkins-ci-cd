package com.devjam.training.cicourse.discountEngine;


public class Discount {

	private Double minAmount;
	private Double percentOff;
	
	public Double getMinAmount() {
		return minAmount;
	}
	public void setMinAmount(Double minAmount) throws DiscountException {
		if(minAmount < 0)
			throw new DiscountException("Discount Amount Must Be Postitive");
		this.minAmount = minAmount;
	}
	public Double getPercentOff() {
		return percentOff;
	}
	public void setPercentOff(Double percentOff) throws DiscountException {
		if(percentOff <= 0.0)
			throw new DiscountException("Percent Off Amount Must Be Greater Than Zero");
		this.percentOff = percentOff;
	}
	
}
