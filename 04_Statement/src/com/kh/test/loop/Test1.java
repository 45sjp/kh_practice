package com.kh.test.loop;

import java.util.Scanner;

/*
 * 	1부터 사용자로부터 입력 받은 정수까지 존재하는 짝수의 합을 출력하세요.(for문 활용)
 */
public class Test1 {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요. : ");
		int inputNum = sc.nextInt();
		
		int sum = 0; // 초기화
		
		for(int i = 1; i <= inputNum; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}	
		System.out.println("합계 : " + sum);
	}
}
