package com.kh.test.condition;

import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.test();
	}
	
	// 사용자에게 입력 받은 문자 하나를 문자타입에 따라 구분해 출력하세요.
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력하세요. : ");
		char inputChar = sc.next().charAt(0);
		String charType = "";
		
		if(inputChar >= 48 && inputChar <= 57) {
			charType = "숫자";
		}
		else if(inputChar >= 65 && inputChar <= 90 || 
				inputChar >= 97 && inputChar <= 122) {
			charType = "알파벳";
		}
		else { 
			charType = "특수문자";
		}
		
		System.out.printf("입력하신 문자 %c 은/는 %s입니다.%n",
							inputChar, charType);
	}
}
