package kh.java.test.array;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Test4 t4 = new Test4();
		t4.test1();
		t4.test2();
	}
	
	/*
	 * 사용자의 전화번호를 입력받고, 11자리의 문자형배열에 저장한 후, 가운데 4자리를 *로 가리기
	 * 단, 원본 배열값은 변경 없이 배열 복사본으로 변경하세요.
	 * 
	 * 		힌트) 복사방법
	 * 			- for문 이용 1:1대입
	 * 			- System.arraycopy() 메소드 이용
	 * 			- clone() 메소드 이용
	 */
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("전화번호를 공백 없이 입력하세요. (예: 01012341234)%n>> ");
		String phoneNum = sc.nextLine();
		
		// 전화번호 배열 선언
		char[] numArr = new char[11];
		
		// 전화번호 배열 저장
		for(int i = 0; i < phoneNum.length(); i++) {
			numArr[i] = phoneNum.charAt(i);
		}
		
		// 전화번호 배열 복사
		char[] copyNumArr = numArr.clone();
		
		// 전화번호 가운데 4자리 바꾸기
		for(int j = 0; j < copyNumArr.length; j++) {
			if(j > 2 && j < 7) {
				copyNumArr[j] = '*';
			}
		}
		
		// 출력
		System.out.println("----------------");
		System.out.print("변경 전 : ");
		for(int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i]);
		}
		
		System.out.println(); // 개행
		
		System.out.print("변경 후 : ");
		for(int j = 0; j < copyNumArr.length; j++) {
			System.out.print(copyNumArr[j]);
		}
		
		System.out.println();
	}
	
	/*
	 * 위 문제를 배열복사 없이 문자열 차원에 가운데 4자리를 교체해보자.
	 * java.lang.String.substring(beginIndex, endIndex) 메소드 찾아볼 것!
	 * 문자열은 직접 수정이 불가하므로, 특정 자리의 문자열을 가져와 처리해야 한다.
	 */
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("전화번호를 공백 없이 입력하세요. (예: 01012341234)%n>> ");
		String phoneNum = sc.nextLine();
		
		String maskNum = phoneNum.substring(0, 3)
						+ "****"
						+ phoneNum.substring(7, 11);
		System.out.println(maskNum);
	}
}
