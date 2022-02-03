package com.kh.test.nested.loop;

import java.util.Scanner;

/*
 * 정수를 하나 입력 받아, 그 수가 양수일 때만 입력된 수를
   행수로 적용하여 다음과 같이 출력되게 하는 프로그램을 만들어보자.
	
	출력예)
	정수 입력 : 5
	*****
	****
	***
	**
	*

	출력예)
	정수 입력 : 0
	양수가 아닙니다.

 */
public class Test2 {

	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력해주세요. >> ");
		int pNum = sc.nextInt();
		
		if(pNum > 0) {
			for(int i = 0; i < pNum; i++) {
				for(int j = pNum; j > i; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else
			System.out.println("양수가 아닙니다.");
		
//		if(pNum > 0) {
//			for(int i = pNum; i > 0; i--) {
//				for(int j = i; j > 0; j--) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//		} else
//			System.out.println("양수가 아닙니다.");
	}
}
