package com.thread.alphabet;

/*
 * 실행용 클래스
 */
public class AlphabetTest {
	
	public static void main(String[] args) {
		Thread alphabet1 = new Thread(new UpperAlphabetThread(), "알파벳 대문자");
		Thread alphabet2 = new Thread(new LowerAlphabetThread(), "알파벳 소문자");
		alphabet1.start();
		alphabet2.start();
	}
	
}
