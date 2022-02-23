package com.io.test4.run;

import com.io.test4.controller.BookManager;

/*
 * 테스트용 클래스
 */
public class TestBookManager {

	public static void main(String[] args) {
		BookManager manager = new BookManager();
		manager.fileSave();
		manager.fileRead();
	}

}
