package com.io.test4.model.vo;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 객체로 사용할 클래스
 */
public class Book implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// Field
	private String title;	// 도서명
	private String author;	// 저자
	private int price;		// 가격
	private Calendar dates;	// 출판날짜
	
	// Constructor
	public Book() {
		super();
	}
	public Book(String title, String author, int price, Calendar dates) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.dates = dates;
	}
	
	// Method
	// getter/setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Calendar getDates() {
		return dates;
	}
	public void setDatas(Calendar dates) {
		this.dates = dates;
	}
	
	// toString
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 출간");
		String pubDate = sdf.format(dates.getTime());
		
		return "Book[" + title + " | " + author + " | "
				+ price + " | " + pubDate + "]";
	}
}
