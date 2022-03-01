package com.collection.list.book.model.vo;

public class Book implements Comparable<Book> {
	
	// Field
	private String bNo;		// 도서번호
	private int category;	// 도서분류코드
	private String title;	// 서명
	private String author;	// 저자명
	
	// Constructor
	public Book() {
		super();
	}

	public Book(String bNo, int category, String title, String author) {
		super();
		this.bNo = bNo;
		this.category = category;
		this.title = title;
		this.author = author;
	}
	
	// getter / setter
	public String getbNo() {
		return bNo;
	}

	public void setbNo(String bNo) {
		this.bNo = bNo;
	}
	
	public int getCategory() {
		return category;
	}
	
	public void setCategory(int category) {
		this.category = category;
	}
	
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
	
	@Override
	public String toString() {
		return "Book [bNo=" + bNo + ", category=" + category + ", title=" + title + ", author=" + author + "]";
	}
	
	@Override
	public int compareTo(Book other) {
		return this.getbNo().compareTo(other.getbNo());
	}
}
