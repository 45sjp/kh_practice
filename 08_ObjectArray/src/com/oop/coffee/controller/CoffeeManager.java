package com.oop.coffee.controller;

import java.util.Scanner;

import com.oop.coffee.model.dto.Coffee;

public class CoffeeManager {
	private Scanner sc = new Scanner(System.in);
	private static final int LENGTH = 3;
	private Coffee[] coffees = new Coffee[LENGTH];
	private int index = 0;
	
	public void insertData() {
		while(true) {
			Coffee co = new Coffee();
			System.out.println("===== 세계 3대 커피 정보 입력 =====");
			System.out.print("1. 원산지 입력 : ");
			co.setOrigin(sc.next());
			System.out.print("2. 커피명 입력 : ");
			co.setCoffeeName(sc.next());
			System.out.println("===============================");
			coffees[index++] = co;
			
			if(index < LENGTH) {
				System.out.print("> 더 입력하시겠습니까?(y/n) : ");
				char yn = sc.next().toLowerCase().charAt(0);
				System.out.println();
				if(yn == 'n')
					break;
			}
			else
				break;
		}
		System.out.println("> 정보 입력이 완료되었습니다.\n");
	}
	
	public void printData() {
		String top = "<세계 3대 커피>\n"
					+ "---------------------------\n"
					+ "원산지	\t커피명\n"
					+ "---------------------------";
		
		String bottom = "---------------------------";
		
		System.out.println(top);
		
		for(int i = 0; i < index; i++) {
			Coffee co = coffees[i];
			System.out.println(co.getCoffeeInfo());
		}
		
		System.out.println(bottom);
	}
}
