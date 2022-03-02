package com.thread.alphabet;

/*
 * 멀티쓰레드 2. 알파벳 소문자
 */
public class LowerAlphabetThread implements Runnable {

	@Override
	public void run() {
		for(char alphabet = 'a'; alphabet <= 'z'; alphabet++)
			System.out.print(alphabet);
	}

}
