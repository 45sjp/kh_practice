package com.kh.test.loop;

/*
 * 3명의 회원정보를 입력 받아 저장하고 출력하는 프로그램을 만드세요.
 * 입력 : 이름, 나이, 주소, 키, 몸무게, 연락처
 */
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Test5 t5 = new Test5();
		t5.test();
	}
	
	public void test() {
		// 사용자에게 입력값 받기(회원 수)
		Scanner sc = new Scanner(System.in);
		System.out.print("회원 수를 입력하세요. : ");
		int memCnt = sc.nextInt();
		
		// memCnt 크기의 배열 할당
		String[] name = new String[memCnt];
		int[] age = new int[memCnt];
		String[] addr = new String[memCnt];
		double[] height = new double[memCnt];
		double[] weight = new double[memCnt];
		String[] phoneNum = new String[memCnt];
		
		sc.nextLine(); // 버퍼 초기화(next -> nextline)
		
		// for문 이용하여 회원정보 입력
		for(int i = 0; i < memCnt; i++) {
			System.out.print((i + 1) + "번 회원 이름 입력 : ");
			name[i] = sc.nextLine();
			
			System.out.print((i + 1) + "번 회원 나이 입력 : ");
			age[i] = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print((i + 1) + "번 회원 주소 입력 : ");
			addr[i] = sc.nextLine();
			
			System.out.print((i + 1) + "번 회원 키 입력 : ");
			height[i] = sc.nextDouble();
			
			System.out.print((i + 1) + "번 회원 몸무게 입력 : ");
			weight[i] = sc.nextDouble();
			
			sc.nextLine();
			
			System.out.print((i + 1) + "번 회원 연락처 입력 : ");
			phoneNum[i] = sc.nextLine();
		}
		
		System.out.println();
		
		// 출력
		System.out.println("===================== 저장회원 =====================");
		for(int i = 0; i < memCnt; i++) {
			System.out.printf("%d %s %d세 %s %.1fcm %.1fkg %s%n",
								(i + 1), name[i], age[i], addr[i],
								height[i], weight[i], phoneNum[i]);
		}
		System.out.println("==================================================");
		
		//기능추가1
		
		// 변수 선언
		int sumAge = 0;
		double sumHeight = 0;
		double sumWeight = 0;
		
		// 회원 합산
		for(int i = 0; i < memCnt; i++) {
			sumAge += age[i];
			sumHeight += height[i];
			sumWeight += weight[i];
		}
		
		// 회원 평균
		int avgAge = sumAge / memCnt;
		double avgHeight = sumHeight / memCnt;
		double avgWeight = sumWeight / memCnt;
		
		System.out.printf("평균 나이 : %d세 / 평균 키 : %.1fcm / 평균 몸무게 : %.1fkg",
							avgAge, avgHeight, avgWeight);
	}
}
