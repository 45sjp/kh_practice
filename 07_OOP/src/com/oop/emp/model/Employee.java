package com.oop.emp.model;

import java.util.Scanner;

/*
 * 사원정보 관리용 클래스
 * 
 * Field 작성 : 캡슐화 반드시 적용함
 */
public class Employee {
	// 필드
	private int empNo;			// 사번
	private String empName;		// 이름
	private String dept;		// 소속부서
	private String job;			// 직급
	private int age;			// 나이
	private char gender;		// 성별
	private int salary;			// 급여
	private double bonusPoint;	// 보너스포인트
	private String phone;		// 핸드폰
	private String address;		// 주소
	
	// setter
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	// getter
	public int getEmpNo() {
		return empNo;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public String getDept() {
		return dept;
	}
	
	public String getJob() {
		return job;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public double getBonusPoint() {
		return bonusPoint;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	// 키보드 입력용 메소드
	public void empInput() {
		System.out.println("---------- 사원 정보 입력 ----------");
		Scanner sc = new Scanner(System.in);
		System.out.print("사번 : ");
		setEmpNo(sc.nextInt());
		System.out.print("이름 : ");
		setEmpName(sc.next());
		
		sc.nextLine();
		
		System.out.print("소속부서 : ");
		setDept(sc.nextLine());
		System.out.print("직급 : ");
		setJob(sc.nextLine());
		System.out.print("나이 : ");
		setAge(sc.nextInt());
		System.out.print("성별 : ");
		setGender(sc.next().charAt(0));
		System.out.print("급여 : ");
		setSalary(sc.nextInt());
		System.out.print("보너스포인트 : ");
		setBonusPoint(sc.nextDouble());
		
		sc.nextLine();
		
		System.out.print("핸드폰 : ");
		setPhone(sc.nextLine());
		System.out.print("주소 : ");
		setAddress(sc.nextLine());
	}
	
	// 필드 출력용 메소드
	public void empOutput() {
		System.out.println("---------- 사원 정보 출력 ----------");
		System.out.printf("%d\t%s\t%s부\t%s\t%d세\t%c자\t%d원\t%.1f\t%s\t%s%n",
							getEmpNo(), getEmpName(), getDept(),
							getJob(), getAge(), getGender(), getSalary(),
							getBonusPoint(), getPhone(), getAddress());
	}
}
