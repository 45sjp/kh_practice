package com.io.employee.model.vo;

import java.io.Serializable;

public class Employee implements Serializable {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	// 필드
	private int empNo;
	private String name;
	private char gender;
	private String phone;
	private String dept;
	private int salary;
	private double bonusPct;
	
	// 기본생성자
	public Employee() {
	}
	
	// 4개의 클래스 변수를 받는 생성자
	public Employee(int empNo, String name,
					char gender, String phone) {
		this.empNo = empNo;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
	}
	
	// 7개의 클래스 변수를 받는 생성자
	public Employee(int empNo, String name, char gender, String phone,
					String dept, int salary, double bonusPct) {
		this(empNo, name, gender, phone);
		this.dept = dept;
		this.salary = salary;
		this.bonusPct = bonusPct;
	}
	
	// setter/getter
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public char getGender() {
		return gender;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDept() {
		return dept;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	public void setBonusPct(double bonusPct) {
		this.bonusPct = bonusPct;
	}
	public double getBonusPct() {
		return bonusPct;
	}
	
	// 직원 정보 출력
	public void printEmployee() {
		System.out.printf("%d. %s, %c, %s, %s, %d, %.2f%n",
						empNo, name, gender, phone, dept, salary, bonusPct);
	}
}
