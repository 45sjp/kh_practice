package com.kh.test.condition;

import java.util.Scanner;


public class Test4 {

	public static void main(String[] args) {
		Test4 t4 = new Test4();
		t4.test();
	}
	
	/*
	 * 1~10 사이의 정수 한 개를 입력 받아 홀수인지 짝수인지 확인하고,
	 * 홀수면 "홀수다.", 짝수면 "짝수다." 출력하세요.
	 * 
	 * 단, 1~10 사이의 정수가 아닌 경우
	 * "반드시 1~10 사이의 정수를 입력해야합니다."를 출력하세요.
	 */
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~10 사이의 정수를 하나 입력하세요. : ");
		int inputNum = sc.nextInt();
		
		if(inputNum >= 1 && inputNum <= 10) {
			if(inputNum % 2 == 0) {
				System.out.println("짝수다.");
			} 
			else {
				System.out.println("홀수다.");
			}
		} 
		else {
			System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
		}
	}
}
