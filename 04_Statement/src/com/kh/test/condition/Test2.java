package com.kh.test.condition;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.rpsGame();
	}
	
	/* 
	 * 가위 바위 보 중 하나를 선택하여 승패를 결정하는 게임
	 * if문 활용(||, && 연산자를 적절히 활용)
	 */
	public void rpsGame() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===가위 바위 보 게임 ===");
		System.out.print("숫자를 선택하세요(1.가위/2.바위/3.보) : ");
		int userNum = sc.nextInt();
		int comNum = (int)(Math.random() * 3) + 1;
		
		System.out.println("======== 결과 ========");
		System.out.printf("당신은 %d을(를) 냈습니다.%n", userNum);
		System.out.printf("컴퓨터는 %d을(를) 냈습니다.%n", comNum);
		System.out.println("=====================");
		
		String result = 
				userNum == comNum ?
						"당신이 이겼습니다. ㅠ.ㅠ" :
							"컴퓨터가 이겼습니다. ^.^";
		
		System.out.println(result);			
	}
}
