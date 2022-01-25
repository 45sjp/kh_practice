package com.kh.function;

import java.util.Scanner;

public class Example {
	
	public void opSample1() {
		// 변수 선언
		int kor;
		int eng;
		int math;
		int sum;
		double avg;
		
		// 사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		
		System.out.print("국어 점수 : ");
		kor = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		eng = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		math = sc.nextInt();
		
		// 세 과목의 합계와 평균 계산
		sum = kor + eng + math;
		avg = sum / 3.0;
		
		// 합격 조건
		String pass = ((kor >= 40 && eng >= 40 && math >= 40) && avg >= 60) ?
						"합격" : "불합격";
		
		// 출력
		System.out.println(pass);
	}
	
	public void opSample2() {
		// 변수 선언
		String studentName;
		int studentGrade;
		int studentClass;
		int studentNo;
		char studentGender;
		double studentScore;
		
		// 사용자 입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생이름 : ");
		studentName = sc.nextLine();
		
		System.out.print("학년 : ");
		studentGrade = sc.nextInt();
		
		System.out.print("반 : ");
		studentClass = sc.nextInt();
		
		System.out.print("번호 : ");
		studentNo = sc.nextInt();
		
		System.out.print("성별(M/F) : ");
		String init = sc.next();
		studentGender = init.charAt(0);
		
		System.out.print("성적 : ");
		studentScore = sc.nextDouble();
		
		// 출력
		System.out.printf("%d학년 %d반 %d번 ", studentGrade, studentClass, studentNo);
		System.out.print(studentGender == 'M' ? "남학생 " : "여학생 ");
		System.out.printf("%s은(는) 성적이 %.2f이다.%n", studentName, studentScore);
	}
	
	public void opSample3() {
		// 정수 변수 선언
		int i;
		
		// 사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		i = sc.nextInt();
		String po = (i > 0) ? "양수다." : "양수가 아니다.";
		
		// 출력
		System.out.println(po);
	}
	
	public void opSample4() {
		// 정수 변수 선언
		int inum;
		
		// 문자열 변수 선언
		String str;
		
		// 사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		inum = sc.nextInt();
		str = (inum % 2 == 0) ? "짝수다." : "홀수다.";
		
		// 출력
		System.out.println(str);
	}
}
