package com.kh.test.nested.loop;

import java.util.Scanner;

/*
 * 	정수 하나를 입력 받아, 그 수가 양수일 때만 입력된 수를
    행 수로 적용하여 다음과 같이 출력되게 하는 프로그램을 만들어보자.
	
	출력예)
	정수 하나 입력 : 5
	1
	12
	123
	1234
	12345

	출력예)
	정수 하나 입력 : -5
	양수가 아닙니다.
	
 */
public class Test1 {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력해주세요. >> ");
		int pNum = sc.nextInt();
		
		if(pNum > 0) {
			for(int i = 1; i <= pNum; i++) {
				for(int j = 1; j <= i; j++) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
		} else
			System.out.println("양수가 아닙니다.");
		
//		if(pNum > 0) {
//			for(int i = 0; i < pNum; i++) {
//				for(int j = 0; j <= i; j++) {
//					System.out.print((j + 1) + " ");
//				}
//				System.out.println();
//			}
//		} else
//			System.out.println("양수가 아닙니다.");
	}
}
