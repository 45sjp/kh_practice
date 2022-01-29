package kh.java.test.array;

import java.util.Scanner;

/*
 * 배열의 크기로 홀수인 양의 정수를 입력 받아 배열을 만드세요.
 * 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
 * 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하는 프로그램을 작성하세요.
 * 
 * 		출력예시)
 * 		홀수인 양의 정수를 하나 입력하세요 ==> 7
 * 		[1, 2, 3, 4, 3, 2, 1]
 */
public class Test6 {

	public static void main(String[] args) {
		Test6 t6 = new Test6();
		t6.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("홀수인 양의 정수를 입력하세요. >> ");
		int oddNum = sc.nextInt();
		
		int[] oddNumArr = new int[oddNum];
		
		if(oddNum % 2 != 0) {
			int num = 1;
			
			// 증가
			for(int i = 0; i < (oddNum / 2); i++) {
				oddNumArr[i] = num++;
				System.out.print(oddNumArr[i] + " ");
			}
			
			// 감소
			for(int i = (oddNum / 2); i < oddNum; i++) {
				oddNumArr[i] = num--;
				System.out.print(oddNumArr[i] + " ");
			}
				
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
}
