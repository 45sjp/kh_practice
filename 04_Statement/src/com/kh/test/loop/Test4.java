package com.kh.test.loop;

import java.util.Scanner;

/*
 * (문자열의 길이를 리턴하는 String의 메소드를 api에서 찾아 사용할 것)
 * 
 * 문자열과 문자열에서 검색될 문자를 입력 받아 문자열에 그 문자가
 * 몇 개였는지 개수를 확인하는 프로그램을 작성하세요.
 * 또, 검색할 문자가 영문자가 아니면 "영문자가 아닙니다." 출력 후 프로그램을 종료하세요.
 */
public class Test4 {

	public static void main(String[] args) {
		Test4 t4 = new Test4();
		t4.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요. : ");
		String inputStr = sc.nextLine();
		System.out.print("검색할 문자를 입력하세요. : ");
		char inputChar = sc.nextLine().charAt(0);
		
		int count = 0;
		
		if(Character.isUpperCase(inputChar) ||
		   Character.isLowerCase(inputChar)) {
			for(int i = 0; i < inputStr.length(); i++) {
				if(inputStr.charAt(i) == inputChar) {
					count++;
				}
			}
			System.out.printf("'%c'가 포함된 갯수 : %d개", inputChar, count);
		}
		else {
			System.out.println("영문자가 아닙니다. 프로그램을 종료합니다.");
		}
	}
}
