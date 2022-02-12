package com.oop.person.model;

public class Person {
	private String name;	// 이름
	private int age;		// 나이
	private double height;	// 키
	private double weight;	// 몸무게
	private long asset;		// 재산
	
	public Person() {}
	public Person(String name, int age, double height,
					double weight, long asset) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.asset = asset;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	public void setAsset(long asset) {
		this.asset = asset;
	}
	public long getAsset() {
		return asset;
	}
	
	public String information() {
		return name + "\t" + age + "\t" + height + "\t" + weight + "\t" + asset;
	}
}
