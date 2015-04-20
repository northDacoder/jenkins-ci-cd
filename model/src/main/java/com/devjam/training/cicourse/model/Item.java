package com.devjam.training.cicourse.model;

public class Item {
	private Double price;
	private String sku;
	private String description;
	
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) throws ItemException {
		if(price < 0)
			throw new ItemException("Item Amount Must Be Postitive");
		this.price = price;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
