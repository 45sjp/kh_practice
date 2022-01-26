package com.kh.test.loop;

import java.util.Scanner;

/*
 * 정수를 입력 받아 입력된 값의 구구단 프로그램을 만들어보세요.
 * 단, 1~9까지만 가능하고 이외에 값을 넣으면 "잘못입력하셨습니다. 프로그램종료합니다." 출력
 */
public class Test3 {

	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요. : ");
		int inputNum = sc.nextInt();
		
		if(inputNum > 0 && inputNum < 10) {
			for(int i = 1; i < 10; i++) {
				System.out.printf("%d X %d = %d%n", inputNum, i, inputNum * i);
			}
		}
		else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}		
	}
}
