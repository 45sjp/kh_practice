package com.io.test4.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.io.test4.model.vo.Book;

/*
 * 객체입출력 처리용 클래스
 */
public class BookManager {
	
	Scanner sc = new Scanner(System.in);
	
	public BookManager() {
		super();
	}
	
	/*
	 * 구현내용
		1. Book 객체 배열 선언, 5개 초기화함 // 샘플데이터 임의 작성
		2. "books.dat" 파일에 객체 기록 저장함
		3. try with resource 문 사용할 것
		4. "books.dat에 저장 완료!" 출력
	 */
	public void fileSave() {
		Book[] books = new Book[5];
		books[0] = new Book("불편한 편의점", "김호연", 14000, new GregorianCalendar(2021, 04, 20));
		books[1] = new Book("달러구트 꿈 백화점", "이미예", 24000, new GregorianCalendar(2021, 12, 25));
		books[2] = new Book("디 에센셜 헤르만 헤세", "헤르만 헤세", 17000, new GregorianCalendar(2022, 02, 11));
		books[3] = new Book("어서 오세요, 휴남동 서점입니다", "황보름", 15000, new GregorianCalendar(2022, 01, 17));
		books[4] = new Book("센 강의 이름 모를 여인", "기욤 뮈소", 16000, new GregorianCalendar(2022, 01, 19));
		
		String fileName = "books.dat";
		try(ObjectOutputStream oos = 
				new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))) {
			oos.writeObject(books);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("books.dat에 저장 완료!\n");
	}
	
	/*
	 * 구현내용
		1. Book 객체 배열 선언
		2. "books.dat" 파일에서 데이터 읽어서 배열에 저장함
		3. 객체 정보를 화면에 출력함
		4. try with resource 문 사용할 것
		5. "books.dat 읽기 완료!" 출력
	 */
	public void fileRead() {
		Book[] bookArr = new Book[5];
		String fileName = "books.dat";
		try(ObjectInputStream ois = 
				new ObjectInputStream(new BufferedInputStream(new FileInputStream(fileName)))) {
			bookArr = (Book[]) ois.readObject();
			
			for(Book book : bookArr)
				System.out.println(book);
				
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("books.dat 읽기 완료!");
	}
}
