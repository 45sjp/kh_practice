package com.kh.test;

public class Test2 {
	
	public static void main(String[] args) {
		
		// 홍길동 정보
		String name = "홍길동";
		int age = 22;
		char gender = '남';
		String phoneNum = "01012341234";
		String email = "hgd@naver.com";
		String addr = "경기도 광주시";
		
		// 상단부 출력
		System.out.println("=======================================================================");
		System.out.println("이름\t나이\t성별\t전화번호\t\t이메일\t\t주소");
		System.out.println("=======================================================================");
		
		// 홍길동 정보 출력
		System.out.printf("%s\t%d\t%c\t%s\t%s\t%s\n",name,age,gender,phoneNum,email,addr);
		
		// 홍길순 정보
		name = "홍길순";
		age = 20;
		gender = '여';
		phoneNum = "010123412341";
		email = "hgs@gmail.com";
		addr = "전라남도 광주시	";
		
		// 홍길순 정보 출력
		System.out.printf("%s\t%d\t%c\t%s\t%s\t%s\n",name,age,gender,phoneNum,email,addr);
	}
}
