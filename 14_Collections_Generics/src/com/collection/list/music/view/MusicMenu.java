package com.collection.list.music.view;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.collection.list.music.manager.MusicManager;
import com.collection.list.music.vo.Music;
import com.collection.list.music.vo.MusicTitleComparator;

/**
 * view단 클래스(사용자가 보게 될 화면 담당)
 * 	- 사용자에게 메뉴 시각화
 * 	- 사용자 입력값 처리
 * 	- manager객체의 메소드를 호출
 * 	- 결과 출력
 */
public class MusicMenu {
	
	private Scanner sc = new Scanner(System.in);
	
	private MusicManager manager = new MusicManager();
	
	private String menu = "================ Music Playlist Menu ================\r\n"
						+ "1. 목록보기\r\n"
						+ "2. 마지막에 음악추가\r\n"
						+ "3. 맨처음에 음악추가\r\n"
						+ "4. 곡삭제\r\n"
						+ "5. 곡변경\r\n"
						+ "6. 곡명검색\r\n"
						+ "7. 가수검색\r\n"
						+ "8. 목록정렬(곡명오름차순)\r\n"
						+ "0. 종료\r\n"
						+ "=====================================================\r\n"
						+ ">> 메뉴선택 : ";
	
	public void mainMenu() {
		while(true) {
			System.out.print(menu);
			String choice = sc.nextLine();
			
			List<Music> musicList = null;
			Music music = null;
			
			boolean result = false;
			String title = null;
			String singer = null;

			switch(choice) {
			case "1": 
				musicList = manager.selectList(); // List<Music> 가져오기
				printList(musicList);			  // List<Music> 호출하기
				break;
			case "2":
				music = inputMusic();
				manager.addList(music);
				break;
			case "3":
				music = inputMusic();
				manager.addAtZero(music);
				break;
			case "4":
				title = inputTitle();
				result = manager.removeMusic(title);
				System.out.println(result? ">> 삭제가 완료되었습니다." :
										   ">> 삭제 실패! 찾으시는 곡이 없습니다.");
				break;
			case "5":
				Music oldMusic = inputMusic();
				Music newMusic = inputMusic();
				result = manager.replaceMusic(oldMusic, newMusic);
				System.out.println(result ? ">> 수정이 완료되었습니다." :
											">> 수정 실패! 찾으시는 곡이 없습니다.");
				break;
			case "6":
				title = inputTitle();
				musicList = manager.searchMusicByTitle(title);
				printList(musicList);
				break;
			case "7":
				singer = inputSinger();
				musicList = manager.searchMusicBySinger(singer);
				printList(musicList);
				break;
			case "8":
				orderMenu();
				break;
			case "0": return; // 현재 메소드를 호출한 곳(main메소드)으로 리턴
			default: System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

	public void printList(List<Music> musicList) {
		System.out.println("====================== 검색 결과 ======================");
		if(!musicList.isEmpty()) {
			for(Music music : musicList) {
				System.out.println(music.getTitle() + " - " + music.getSinger());
			}
		} else
			System.out.println("검색 결과가 없습니다.");
	}
	
	public String inputTitle() {
		System.out.print("곡명 입력 : ");
		String title = sc.nextLine();
		return title;
	}
	
	public String inputSinger() {
		System.out.print("가수 입력 : ");
		String singer = sc.nextLine();
		return singer;
	}
	
	public Music inputMusic() {
		System.out.print("곡명 입력 : ");
		String title = sc.nextLine();
		System.out.print("가수 입력 : ");
		String singer = sc.nextLine();
		return new Music(title, singer);
	}
	
	
	public void orderMenu() {
	  	String orderMenu = "====================== 정렬 메뉴 ======================\r\n"
	  					 + "1. 가수명 오름차순\r\n"
	  					 + "2. 가수명 내림차순\r\n"
	  					 + "3. 곡명 오름차순\r\n"
	  					 + "4. 곡명 내림차순\r\n"
	  					 + "5. 메인메뉴 돌아가기\r\n"
	  					 + "=====================================================\r\n"
	  					 + ">> 메뉴선택 : ";
	  
	  	while(true) {
	  		System.out.print(orderMenu);
	  		String choice = sc.nextLine();
	  		
	  		List<Music> musicList = null;
	  		
	  		switch(choice) {
	  		case "1":
	  			musicList = manager.orderBy(null);
	  			printList(musicList);
	  			break;
	  		case "2":
	  			musicList = manager.orderBy(Collections.reverseOrder());
	  			printList(musicList);
	  			break;
	  		case "3":
	  			musicList = manager.orderBy(new MusicTitleComparator());
	  			printList(musicList);
	  			break;
	  		case "4":
	  			musicList = manager.orderBy(new MusicTitleComparator().reversed());
	  			printList(musicList);
	  			break;
	  		case "5": return;
	  		default: System.out.println("잘못 입력하셨습니다.");
	  		}
	  	}
	}
}
