package com.exception.number;

import java.util.Scanner;

public class Run {
	
	Scanner sc = new Scanner(System.in);
	NumberProcess process = new NumberProcess();
	
	public static void main(String[] args) {
		Run run = new Run();
		run.test();
	}
	
	public void test() {
		while(true) {
			try {
				System.out.print("정수 1을 입력하세요. >> ");
				int a = sc.nextInt();
				System.out.print("정수 2을 입력하세요. >> ");
				int b = sc.nextInt();
				
				String result = process.checkDouble(a, b) ? "배수다." : "배수가 아니다.";
				System.out.printf("%d는 %d의 %s", a, b, result);
				
				break;
			} catch(Exception e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
	}
}
