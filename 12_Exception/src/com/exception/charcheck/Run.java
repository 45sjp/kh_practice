package com.exception.charcheck;

import java.util.Scanner;

public class Run {
	
	Scanner sc = new Scanner(System.in);
	CharacterProcess process = new CharacterProcess();
	
	public static void main(String[] args) {
		Run run = new Run();
		run.test1();
	}
	
	public void test1() {
		while(true) {
			try {
				System.out.print("문자열을 입력하세요. >> ");
				String s = sc.nextLine();
				System.out.printf("입력하신 문자열의 영문자 개수는 %d개입니다.", process.countAlpha(s));
				break;
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
