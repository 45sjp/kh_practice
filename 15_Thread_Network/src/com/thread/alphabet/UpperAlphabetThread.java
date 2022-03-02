package com.thread.alphabet;

/*
 * 멀티쓰레드 1. 알파벳 대문자
 */
public class UpperAlphabetThread implements Runnable {

	@Override
	public void run() {
		for(char alphabet = 'A'; alphabet <= 'Z'; alphabet++)
			System.out.print(alphabet);
	}

}
