package com.collection.map.book.model.compare;

import java.util.Comparator;

import com.collection.list.book.model.vo.Book;

/*
 * 정렬 처리를 위한 클래스
 * 	- 서명 기준 오름차순 정렬용
 */
public class AscTitle implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getTitle().compareTo(o2.getTitle());
	}

}
