package com.kh.test.loop;

import java.util.Scanner;

/*
 * 분식집 주문 받는 프로그램을 만들어 보세요.
 */
public class Test8 {

	public static void main(String[] args) {
		Test8 t8 = new Test8();
		t8.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		
		// 메뉴 출력 내용
		String menu = "\t< 메 뉴 >\n"
					+ "김밥류 ===================\n"
					+ "1.원조김밥===========1500원\n"
					+ "2.치즈김밥===========2000원\n"
					+ "3.참치김밥===========2300원\n"
					+ "라면류 ===================\n"
					+ "4.그냥라면===========3000원\n"
					+ "5.치즈라면===========3500원\n"
					+ "6.짬뽕라면===========4000원\n"
					+ "분식류 ===================\n"
					+ "7.떡볶이=============2500원\n"
					+ "8.순대==============2500원\n"
					+ "9.오뎅==============1000원\n"
					+ "기타 ====================\n"
					+ "10.음료수===========1000원\n"
					+ "메뉴 선택 >> ";
		
		// 변수 초기화
		String menuName = ""; // 메뉴 이름
		int price = 0; // 메뉴 가격
		int orderCnt = 0; // 주문 수량
		char addMenu = 'y'; // 추가 주문 여부
		int totalPrice = 0; // 총 주문 금액
		
		do {
			// 메뉴 출력 및 선택
			System.out.print(menu);
			String userChoice = sc.next();
			
			// 사용자 입력값에 따른 메뉴명 및 가격
			switch(userChoice) {
			case "1": menuName = "원조김밥"; price = 1500; break;
			case "2": menuName = "치즈김밥"; price = 2000; break;
			case "3": menuName = "참치김밥"; price = 2300; break;
			case "4": menuName = "그냥라면"; price = 3000; break;
			case "5": menuName = "치즈라면"; price = 3500; break;
			case "6": menuName = "짬뽕라면"; price = 4000; break;
			case "7": menuName = "떡볶이"; price = 2500; break;
			case "8": menuName = "순대"; price = 2500; break;
			case "9": menuName = "오뎅"; price = 1000; break;
			case "10": menuName = "음료수"; price = 1000; break;
			default: System.out.println("잘못 입력하셨습니다. 메뉴를 다시 선택하여 주십시오."); continue;
			}
			
			// 수량 입력
			System.out.print("수량 입력 >> ");
			orderCnt = sc.nextInt();
			totalPrice += (price * orderCnt);
			
			System.out.printf("[%s]을(를) [%d]개 선택하셨습니다.%n", menuName, orderCnt);
			
			// 추가 주문 여부
			System.out.print("추가 주문 하시겠습니까?(y/n) >> ");
			addMenu = sc.next().charAt(0);
			if(addMenu == 'n')
				break;
						
		} while(true);
		
		// 주문 결과
		System.out.printf("%n주문하신 정보는 다음과 같습니다.%n"
							+ "----------------------------%n"
							+ "합계 : %d원", totalPrice);
	}
}
