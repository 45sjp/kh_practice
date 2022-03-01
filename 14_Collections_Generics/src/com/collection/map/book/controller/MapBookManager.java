package com.collection.map.book.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.collection.list.book.model.vo.Book;
import com.collection.map.book.model.compare.AscTitle;

public class MapBookManager {
	
	// Field
	// 도서번호 K
	private HashMap<String, Book> booksMap;
	
	// Constructor
	public MapBookManager() {
		super();
		booksMap = new HashMap<>();
	}

	public MapBookManager(HashMap<String, Book> booksMap) {
		super();
		this.booksMap = booksMap;
	}
	
	// 맵에 객체 추가, 도서번호를 키로 사용
	public void putBook(Book book) {
		booksMap.put(book.getbNo(), book);
	}
	
	// 맵에서 객체 제거
	public void deleteBook(String key) {
		booksMap.remove(key);
	}
	
	// 서명이 일치하는 객체의 도서번호를 리턴
	// 서명과 일치하는 객체가 맵에 없으면, null 리턴
	// entrySet() 사용
	public String searchBook(String title) {
		Set<Map.Entry<String, Book>> entrySet = booksMap.entrySet();
		for(Map.Entry<String, Book> entry : entrySet) {
			String key = entry.getKey();
			Book value = entry.getValue();
			if(value.getTitle().contains(title))
				return key;
		}
		
		return null;
	}
	
	// 맵 정보 모두 출력
	// keySet() 사용
	public void displayAll() {
		Set<String> keySet = booksMap.keySet();
		for(String key : keySet) {
			System.out.println(booksMap.get(key));
		}
	}
	
	// 해당 서명 순으로 오름차순 정렬해서 객체배열 리턴
	public Book[] sortedBookMap() {
		Book[] br = new Book[booksMap.size()];
		List<Book> booksList = new ArrayList<>(booksMap.values());
		
		Comparator<Book> c = new AscTitle();
		Collections.sort(booksList, c);
		
		for(int i = 0; i < booksMap.size(); i++) {
			br[i] = booksList.get(i);
		}
		
		return br;
	}
	
	// 객체배열 출력, for-each문 사용
	public void printBookMap(Book[] br) {
		for(Book b : br)
			System.out.println(b);
	}
	
	public void printBook(String key) {
		System.out.println(booksMap.get(key));
	}
}
