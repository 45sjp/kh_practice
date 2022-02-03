package com.kh.test.nested.loop;

import java.util.Scanner;

/*
 * 정수를 하나 입력 받아, 그 수가 양수일 때만 입력된 수를
   줄 수로 적용하여 다음과 같이 출력되게 하는 프로그램을 만들어보자.
   
	출력예)
	정수 입력 : 5
	
	     *
	     **
	     ***
	     ****
	     *****
	      ****
	       ***
	        **
	         *

 */
public class Test3 {

	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력해주세요. >> ");
		int pNum = sc.nextInt();
		
		/*	
		 * 상단부 출력
	     	*
	     	**
	     	***
	     	****
	     	*****
	     */
		for(int i = 0; i < pNum; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 * 하단부 출력
		 	 ****
		 	  ***
		 	   **
		 	   	*
		 */			
		for(int i = 0; i < pNum - 1; i++) {
			
			// 공백 출력
			for(int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			
			// 별 출력
			for(int j = pNum - 1; j > i; j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
