package com.kh.test.break_continue;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Test1 tbc = new Test1();
		tbc.test1();
		tbc.test2();
	}
	
	/*
	 * 정수 한 개를 입력 받아,
	 * 1부터 입력 받은 정수까지의 홀수의 곱을 출력하세요.
	 */
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요. >> ");
		int inputNum = sc.nextInt();
		
		int multipleSum = 1; // 홀수곱
		
		int i = 0;
		while(i < inputNum) {
			i++;
			if(i % 2 == 0)
				continue;
			multipleSum *= i;
		}
		System.out.printf("정수 1부터 %d까지의 홀수곱 : %d",
							inputNum, multipleSum);
	}
	
	/*
	 * 사용자로부터 정수를 두 개 입력 받아서,
	 * 작은 정수에서 큰 정수까지 홀수의 합을 구하세요.
	 * Tip. 큰수/작은수에 해당하는 변수를 사용할 것.
	 */
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력하세요. >> ");
		int inputNum1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력하세요. >> ");
		int inputNum2 = sc.nextInt();
		
		// 변수 초기화
		int sNum = 0;	// 작은수
		int bNum = 0;	// 큰수
		int sum = 1;	// 홀수합
		
		if(inputNum1 > inputNum2) {
			sNum = inputNum2;
			bNum = inputNum1;
		}
		else {
			sNum = inputNum1;
			bNum = inputNum2;
		}
		
		int j = sNum;
		while(j <= bNum) {
			j++;
			if(j % 2 == 0)
			continue;
			sum += j;
		}
		System.out.printf("정수 %d부터 %d까지의 홀수합 : %d",
							sNum, bNum, sum);
	}

}
