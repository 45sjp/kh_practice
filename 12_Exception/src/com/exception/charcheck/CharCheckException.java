package com.exception.charcheck;

/*
 * 사용자 정의 예외클래스
 */
public class CharCheckException extends RuntimeException {

	public CharCheckException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CharCheckException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public CharCheckException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public CharCheckException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public CharCheckException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
