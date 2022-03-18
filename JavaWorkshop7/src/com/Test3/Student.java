package com.Test3;

/*
 * [문제 3]
 * 다음과 같은 조건을 만족하는 프로그램을 작성하시오.
 * 
 * 3개의 Student 객체를 생성하여 배열에 셋팅한 후
 * 3개의 객체 중 가장 큰 신장과 몸무게, 나이의 평균을 구한다.
 */
public class Student {
	
	private String name;
	private int age;
	private int height;
	private int weight;
	
	public Student() {}

	public Student(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public String studentInfo() {
		return "학생 [이름=" + name + ", 나이=" + age + ", 키=" + height + ", 몸무게=" + weight + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
