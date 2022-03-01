package com.collection.map.book;

import java.util.Scanner;

import com.collection.list.book.model.vo.Book;
import com.collection.map.book.controller.MapBookManager;

public class TestBookManager {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		TestBookManager.menu();
	}
	
	public static void menu() {
		MapBookManager manager = new MapBookManager();
		String title = null;

		String menu = "*** 도서 관리 프로그램 ***\r\n"
					+ "1. 새 도서 추가\r\n"
					+ "2. 도서정보 정렬 후 출력\r\n"
					+ "3. 도서 삭제\r\n"
					+ "4. 도서 검색 출력\r\n"
					+ "5. 전체 출력\r\n"
					+ "6. 끝내기\r\n"
					+ "**********************\r\n"
					+ ">> 입력 : ";
		
		while(true) {
			System.out.print(menu);
			String choice = sc.next();
			
			switch(choice) {
			case "1":
				manager.putBook(inputBook()); 
				break;
			case "2":
				Book[] br = manager.sortedBookMap();
				manager.printBookMap(br);
				break;
			case "3":
				title = manager.searchBook(inputBookTitle());
				if(title != null) {
					manager.deleteBook(title);
					System.out.println("도서가 삭제되었습니다.");
				} else
					System.out.println("검색하신 도서를 찾을 수 없습니다.");
				break;
			case "4":
				title = manager.searchBook(inputBookTitle());
				if(title != null)
					manager.printBook(title);
				else
					System.out.println("검색하신 도서를 찾을 수 없습니다.");
				break;
			case "5":
				manager.displayAll();
				break;
			case "6":
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	
	// Book 객체의 필드값을 키보드로 입력받아 초기화하고 객체 리턴
	public static Book inputBook() {
		System.out.print("도서번호 입력 : ");
		String bNo = sc.next();
	
		System.out.print("도서분류코드 입력(1.인문/2.자연과학/3.의료/4.기타) : ");
		int category = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("서명 입력 : ");
		String title = sc.nextLine();
		
		System.out.print("저자명 입력 : ");
		String author = sc.nextLine();
		
		return new Book(bNo, category, title, author);
	}
	
	// 삭제 또는 검색을 위한 도서 타이틀을 키보드로 입력받아 리턴
	public static String inputBookTitle() {
		sc.nextLine();
		System.out.print("서명 입력 : ");
		String title = sc.nextLine();
		return title;
	}
}