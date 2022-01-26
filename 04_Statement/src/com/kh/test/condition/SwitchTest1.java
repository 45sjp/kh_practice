package com.kh.test.condition;

import java.util.Scanner;

/*
 * 수도세를 구하는 프로그램을 작성하세요.(switch문 사용)
 * 사용자에게 사용용도와 물사용량을 입력 받고, 이에 따른 수도세를 계산해 출력하세요.
 * 	- 사용요금: 용도별 가격(1liter)  * 사용량
 *  - 수도세: 사용요금의 5%
 *  - 총사용요금: 사용요금 + 수도세
 *  - 사용용도메뉴에서 1,2,3번이외를 선택시에는
 *    "메뉴번호는 1,2,3만 가능합니다."를 출력하고, 프로그램을 종료합니다.
 */
public class SwitchTest1 {

	public static void main(String[] args) {
		SwitchTest1 st1 = new SwitchTest1();
		st1.waterBillCal();
	}
	
	public void waterBillCal() {
		// 상단부 출력
		String menu = "----------menu----------\n"
					+ "1. 가정용 (50원/liter)\n"
					+ "2. 상업용 (45원/liter)\n"
					+ "3. 공업용 (30원/liter)\n"
					+ "-------------------------";
		System.out.println(menu);
		
		// 사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴번호를 선택하세요. ==> ");
		int choice = sc.nextInt();
		System.out.print("물 사용량을 입력하세요. ==> ");
		double usage = sc.nextDouble();
		
		// 초기화
		String type = "";
		double charge = 0; // 사용요금
		
		// switch문으로 수도세 계산
		switch(choice) {
		case 1: type = "1. 가정용"; charge = usage * 50; break;
		case 2: type = "2. 상업용"; charge = usage * 45; break;
		case 3: type = "3. 공업용"; charge = usage * 30; break;
		default: System.out.println("메뉴번호는 1, 2, 3만 가능합니다."); 
		}
		
		int waterBill = (int)(charge * 0.05); // 수도세
		int totalCharge = (int)(charge + waterBill); // 총사용요금

		// 결과값 출력
		System.out.println("----------<<수도세>>-----------");
		System.out.printf("선택메뉴번호 : %s을 선택하셨습니다.%n"
						+ "사용요금 : %.0f%n"
						+ "수도세 : %d%n"
						+ "총사용요금 : %d원",
						type, charge, waterBill, totalCharge);
	}
}
