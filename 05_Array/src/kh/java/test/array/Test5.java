package kh.java.test.array;

import java.util.Scanner;

/*
 * 주민등록번호 성별자리 이후부터 *로 가리기
 * 단, 원본 배열값은 변경 없이 배열 복사본으로 변경하세요.
 * 
 * 		힌트) 복사방법
 * 			- for문이용 1:1대입
 * 			- System.arraycopy() 메소드 이용
 * 			- clone() 메소드 이용
 */
public class Test5 {

	public static void main(String[] args) {
		Test5 t5 = new Test5();
		t5.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("주민등록번호를 공백 없이 입력하세요.%n>> ");
		String rrn = sc.nextLine();
		
		char[] rrnArr = new char[rrn.length()];
		
		for(int i = 0; i < rrn.length(); i++) {
			rrnArr[i] = rrn.charAt(i);
		}
		
		char[] copyRrnArr = rrnArr.clone();
		for(int j = 0; j < copyRrnArr.length; j++) {
			if(j > 6 && j < 14) {
				copyRrnArr[j] = '*';
			}
		}
		System.out.println("----------------");
		System.out.print("변경 전 : ");
		for(int i = 0; i < rrnArr.length; i++) {
			System.out.print(rrnArr[i]);
		}
		
		System.out.println();
		
		System.out.print("변경 후 : ");
		for(int j = 0; j < copyRrnArr.length; j++) {
			System.out.print(copyRrnArr[j]);
		}
	}
}
