package com.oop.person.controller;

import java.util.Scanner;

import com.oop.person.model.Person;

public class PersonController {
	private Scanner sc = new Scanner(System.in);
	private static final int LENGTH = 5;
	private Person[] persons = new Person[LENGTH];
	private int index = 0;
	
	private double sumAge;
	private double sumHeight;
	private double sumWeight;
	private long sumAsset;
	
	private double avgAge;
	private double avgHeight;
	private double avgWeight;
	private long avgAsset;
	
	public void insertData() {
		while(true) {
			Person p = new Person();
			System.out.println("===== 멤버 정보 입력 =====");
			System.out.print("1. 이름 입력 : ");
			p.setName(sc.next());
			System.out.print("2. 나이 입력 : ");
			p.setAge(sc.nextInt());
			System.out.print("3. 키 입력 : ");
			p.setHeight(sc.nextDouble());
			System.out.print("4. 몸무게 입력 : ");
			p.setWeight(sc.nextDouble());
			System.out.print("5. 재산 입력 : ");
			p.setAsset(sc.nextLong());
			System.out.println("========================");
			persons[index++] = p;
				
			if(index < LENGTH) {
				System.out.print("> 더 입력하시겠습니까?(y/n) : ");
				char ch = sc.next().toLowerCase().charAt(0);
				System.out.println();
				if(ch == 'n')
					break;
			}
			else
				break;
		}
		System.out.println("> 정보 입력이 완료되었습니다.\n");
	}
	
	public void printDate() {
		int i = 0;
		
		String top = "--------------- 멤버 정보 ---------------\n"
					+ "이름\t나이\t키\t몸무게\t재산\n"
					+ "--------------------------------------";
		
		String bottom = "---------------------------------------";
		
		System.out.println(top);
		
		for(i = 0; i < index; i++) {
			Person s = persons[i];
			System.out.println(s.information());
			
			sumAge += persons[i].getAge();
			sumHeight += persons[i].getHeight();
			sumWeight += persons[i].getWeight();
			sumAsset += persons[i].getAsset();
		}
		
		System.out.println(bottom);
	}
	
	public void avgData() {
		avgAge = sumAge / index;
		avgHeight = sumHeight / index;
		avgWeight = sumWeight / index;
		avgAsset = sumAsset / index;
		
		System.out.printf("%s명의 평균 결과 >%n"
						+ "나이 평균 : %.1f 세%n"
						+ "키 평균 : %.1f cm%n"
						+ "몸무게 평균 : %1f kg%n"
						+ "재산 평균 : %d 원%n",
							index, avgAge, avgHeight, avgWeight, avgAsset);
	}
}
