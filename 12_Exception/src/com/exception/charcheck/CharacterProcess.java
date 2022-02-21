package com.exception.charcheck;

public class CharacterProcess {
	
	// 기본 생성자
	public CharacterProcess() {}
	
	/*
	 * 전달된 문자열값에서 영문자가 몇 개인지 카운트해서 리턴
	 * 단, 공백문자가 있으면 charCheckException 발생
	 */
	public int countAlpha(String s) {
		char[] arr = s.toCharArray();
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ' ')
				throw new CharCheckException("체크할 문자열 안에 공백을 포함할 수 없습니다.");
			else if(Character.isUpperCase(arr[i]) || Character.isLowerCase(arr[i]))
				count++;
		}
		return count;
	}
	
}
