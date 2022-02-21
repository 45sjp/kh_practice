package com.exception.number;

public class NumberProcess {
	
	public boolean checkDouble(int a, int b) {
		
		if((a <= 0 || a > 100) || (b <= 0 || b > 100)) {
			throw new NumberRangeException("1부터 100 사이의 값이 아닙니다.");
		}
		else {
			if(a % b == 0)
				return true;
			else
				return false;
		}
	}
}
