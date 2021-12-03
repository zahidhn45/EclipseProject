package com.xworkz.zomatoapp.dto;

public class FoodItemDTO {
	private int foodId;
	private String foodName;
	private double foodPrice;
	private String foodType;

	public FoodItemDTO(int foodId, String foodName, double foodPrice, String foodType) {
		super();
		this.foodId = foodId;
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.foodType = foodType;
	}

	public FoodItemDTO() {
	}

	public int getFoodId() {
		return foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public double getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(double foodPrice) {
		this.foodPrice = foodPrice;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

}
