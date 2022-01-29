package kh.java.test.array;

import java.util.Scanner;

/*
 * 문자열을 하나 입력 받아 문자배열에 넣고
 * 검색할 문자를 하나 입력 받아 검색 문자가
 * 문자열에 몇 개인지 개수를 출력하는 프로그램을 작성하세요.
 * 
 * 	예) 	입력값 : helloworld
 * 		검색값 : l
 * 		출력 : 입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개 입니다.
 */
public class Test3 {

	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		
		// 문자열 입력 받기
		System.out.printf("문자열을 입력하세요. (예: HELLOWORLD)%n>> ");
		String inputStr = sc.nextLine().toUpperCase();

		// 배열선언 및 할당
		char[] arrChar = new char[inputStr.length()];
		
		// 검색할 문자 입력 받기
		System.out.printf("검색하실 문자를 입력하세요. (예: H)%n>> ");
		char searchChar = sc.next().toUpperCase().charAt(0); // 문자
		
		// 문자 갯수 구하기
		int count = 0;
		
		for(int i = 0; i < arrChar.length; i++) {
			if(inputStr.charAt(i) == searchChar)
				count++;
		}
		
		// 출력
		System.out.printf("----------------%n"
						+ "입력값 : %s%n"
						+ "검색값 : %c%n"
						+ "출력 : 입력하신 문자열 [%s]에서 검색한 문자 [%c]는 [%d]개입니다.",
							inputStr, searchChar, inputStr, searchChar, count);
	}
}
