package com.kh.test.multi.dimentional.array.test;

public class Sample {

	public static void main(String[] args) {
		Sample s = new Sample();
//		s.exercise1();
		s.exercise2();
	}
	
	/*
	  	1. 3행 5열 2차원 배열 선언 및 생성
		2. 1~100 사이의 임의의 정수를 모든 방에 기록함
		3. 열의 값이 5의 배수인 경우만 값(행,열) 출력함
	 */
	public void exercise1() {
		int[][] arr = new int[3][5];
		
		// 2차원 배열에 임의의 정수값 기록
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] = (int)(Math.random() * 100) + 1;
				System.out.printf("(%d,%d) : %d ", i, j, arr[i][j]); // 확인용
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 5의 배수인 값 출력
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				if(arr[i][j] % 5 == 0)
					System.out.printf("(%d,%d) : %d ", i, j, arr[i][j]);
			}
			System.out.println();
		}
	}
	
	/*
	  	1. 3행 4열 2차원 배열 선언 및 생성
		2. 0행 0열부터 2행 2열까지 1부터 100 사이의 임의의 정수값 기록해 넣음
		3. 아래의 내용처럼 처리함
		
		    0열	1열	2열	3열	
		0행	값	값	값 	0행 값들의 합계
		1행	값	값	값	1행 값들의 합계
		2행	값	값	값	2행 값들의 합계
	 */
	public void exercise2() {
		int[][] arr = new int[3][4];
		
		// 2차원 배열에 임의의 정수값 기록하고 합계 구하기
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = 0;
			for(int j = 0; j < (arr[0].length - 1); j++) {
				arr[i][j] = (int)(Math.random() * 100) + 1;
				sum += arr[i][j];
			}
			arr[i][3] = sum;
		}
		
		System.out.println("\t0열\t1열\t2열\t3열");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + "행\t");
			for(int j = 0; j < arr[0].length; j++) {
				
				if(j == arr[0].length) {
					System.out.print(sum);
				} else {
					System.out.print(arr[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}
}
