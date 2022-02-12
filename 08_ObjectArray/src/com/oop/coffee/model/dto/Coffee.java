package com.oop.coffee.model.dto;

public class Coffee {
	private String origin;		// 원산지
	private String coffeeName;	// 커피명
	
	public Coffee() {}
	public Coffee(String origin, String coffeeName) {
		this.origin = origin;
		this.coffeeName = coffeeName;
	}
	
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getOrigin() {
		return origin;
	}
	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}
	public String getCoffeeName() {
		return coffeeName;
	}
	
	public String getCoffeeInfo() {
		return origin + "\t\t" + coffeeName;
	}
}
