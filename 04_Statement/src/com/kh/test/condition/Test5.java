package com.kh.test.condition;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Test5 t5 = new Test5();
		t5.test();
	}
	
	/*
	 * 키(cm)와 몸무게(kg)을 입력 받고, BMI(체질량지수)를 계산하여 계산된 값에 따라 출력하세요.
	 * 	- 저체중(18.5미만)
	 * 	- 정상체중(18.5이상 23미만)
	 * 	- 과체중(23이상 25미만)
	 * 	- 비만(25이상 30미만)
	 * 	- 고도비만(30이상)
	 * 
	 * BMI 계산식 = 체중(kg) / (신장(m) * 신장(m))
	 * 	- 예) BMI = 67 / (1.7 * 1.7)
	 */
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("키(cm)를 입력하세요. : ");
		double height = sc.nextDouble() / 100;
		System.out.print("몸무게(kg)를 입력하세요. : ");
		double weight = sc.nextDouble();
		
		double bmiCal = weight / (height * height);
		String bmiResult = "";
		
		if(bmiCal < 18.5) {
			bmiResult = "저체중";
		}
		else if(bmiCal >= 18.5 && bmiCal < 23) {
			bmiResult = "정상체중";
		}
		else if(bmiCal >= 23 && bmiCal < 25) {
			bmiResult = "과체중";
		}
		else if(bmiCal >= 25 && bmiCal < 30) {
			bmiResult = "비만";
		}
		else if(bmiCal > 30) {
			bmiResult = "고도비만";
		}
		
		System.out.printf("당신의 BMI(체질량지수)는 %.2f이며, %s입니다.%n",
							bmiCal, bmiResult);
	}
}
