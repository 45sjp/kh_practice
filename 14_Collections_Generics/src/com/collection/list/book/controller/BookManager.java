package com.collection.list.book.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.collection.list.book.model.compare.AscCategory;
import com.collection.list.book.model.vo.Book;

/*
 * 관리용 클래스
 */
public class BookManager {
	
	// Field
	private List<Book> bookList;
	
	// Constructor
	public BookManager() {
		super();
		bookList = new ArrayList<>();
	}
	
	public BookManager(ArrayList<Book> bookList) {
		super();
		this.bookList = bookList;
	}
	
	// 리스트에 객체 추가
	public void addBook(Book book) {
		bookList.add(book);
	}
	
	// 리스트에서 객체 제거
	public void deleteBook(int index) {
		bookList.remove(index);
	}
	
	// 도서명이 일치하는 객체를 찾아 해당 인덱스를 리턴
	// 도서명이 일치하는 객체가 리스트에 없으면, -1 리턴
	public int searchBook(String title) {
		for(int i = 0; i < bookList.size(); i++) {
			if(title.equals(bookList.get(i).getTitle()))
				return i;
		}
		return -1;
	}
	
	// 인덱스 위치의 객체 정보 출력
	public void printBook(int index) {
		System.out.println(bookList.get(index));
	}
	
	// 목록 정보 모두 출력
	public void printAll() {
		for(int i = 0; i < bookList.size(); i++) {
		System.out.println(bookList.get(i).toString());
		}
	}
	
	// 해당 카테고리 오름차순 정렬해서 객체배열 리턴함
	public Book[] sortedBookList() {
		Book[] br = new Book[bookList.size()];
		
		Comparator<Book> c = new AscCategory();
		Collections.sort(bookList, c);
		
		for(int i = 0; i < bookList.size(); i++) {
			br[i] = bookList.get(i);
		}
		
		return br;
	}
	
	// 객체배열 출력, for-each문 사용
	public void printBookList(Book[] br) {
		for(Book b : br)
			System.out.println(b);
	}
}
