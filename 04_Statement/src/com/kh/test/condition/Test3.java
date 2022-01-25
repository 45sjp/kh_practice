package com.kh.test.condition;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.test();
	}
	
	/* 
	 * 정수 두 개를 입력 받고, 연산자(+,-,*,/)를 입력받은 다음 계산한 뒤
	 * 결과를 출력하는 계산기 프로그램을 만들어보세요.
	 * 
	 * 음수가 입력되거나 +,-,*,/ 이외의 문자가 입력되면
	 * "잘못 입력하셨습니다. 프로그램을 종료합니다."라는 문구가 출력되게 하세요.
	 */
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력하세요. : ");
		int n1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력하세요. : ");
		int n2 = sc.nextInt();
		System.out.print("연산자(+,-,*,/)를 입력하세요. : ");
		char op = sc.next().charAt(0);
		int result = 0;
		
		if(op == '+' || op == '-' || op == '*' || op == '/') {
			if(op == '+') {
				result = n1 + n2;
			}
			else if(op == '-') {
				result = n1 - n2;
			}
			else if(op == '*') {
				result = n1 * n2;
			}
			else if(op == '/') {
				result = n1 / n2;
			}
			
			System.out.printf("%d %c %d = %s%n", n1, op, n2, result);
		}
		else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
	}
}
