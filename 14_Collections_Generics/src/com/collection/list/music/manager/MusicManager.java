package com.collection.list.music.manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.collection.list.music.vo.Music;

/**
 * Music관리자 클래스
 */
public class MusicManager {

	private List<Music> musicList = new ArrayList<>();
	
	public MusicManager() {};
	{
		 musicList.add(new Music("내가", "도끼"));
		 musicList.add(new Music("Easy on Me", "Adele"));
		 musicList.add(new Music("Die For You", "The Weeknd"));
		 musicList.add(new Music("INVU", "태연"));
		 musicList.add(new Music("신호등", "이무진"));
	}
	
	// 1. 음악리스트 리턴
	public List<Music> selectList() {
		return this.musicList;
	}
	
	// 2. 마지막에 음악추가 : 사용자로부터 곡명과 가수를 입력받아 리스트에 저장
	public void addList(Music m) {
		musicList.add(m);
	}
	
	// 3. 맨처음에 음악추가 : 리스트 최상위(0번지)에 음악 추가
	public void addAtZero(Music m) {
		musicList.add(0, m);
	}
	
	// 4. 특정곡 삭제 : 제목을 전달받아 검색 후, 최초로 검색된 음악 삭제
	public boolean removeMusic(String title) {
		for(int i = 0; i < musicList.size(); i++) {
			if(title.equals(musicList.get(i).getTitle())) {
				musicList.remove(i);
			}
		}
		return true;
	}
	
	// 5. 특정곡 변경 : 이전 음악객체, 새 음악객체를 전달해서 교체
	public boolean replaceMusic(Music oldMusic, Music newMusic) {
		for(int i = 0; i < musicList.size(); i++) {
			if(oldMusic.equals(musicList.get(i))) {
				musicList.set(i, newMusic);
			}
		}
		return true;
	}
	
	// 6. 특정곡이 있는지 검사
	// 곡명 일부로 검색해서 해당 곡이 있다면, 곡 정보를 출력하고,
	// 없다면 "검색결과가 없습니다." 출력 (복수 개의 결과 나올 수 있음)
	public List<Music> searchMusicByTitle(String title) {
		List<Music> searchList = new ArrayList<>();
		for(int i = 0; i < musicList.size(); i++) {
			if(musicList.get(i).getTitle().contains(title)) {
				searchList.add(musicList.get(i));
			}
		}
		return searchList;
	}
	
	// 7. 가수로 검색 : 복수 개의 결과 나올 수 있음
	public List<Music> searchMusicBySinger(String singer) {
		List<Music> searchList = new ArrayList<>();
		for(int i = 0; i < musicList.size(); i++) {
			if(musicList.get(i).getSinger().contains(singer)) {
				searchList.add(musicList.get(i));
			}
		}
		return searchList;
	}
	
	// 8. 서브메뉴 - 각 정렬 메소드
	// comparable/Comparator 인터페이스를 적절히 활용할 것
	public List<Music> orderBy(Comparator<Music> c) {
//		Collections.sort(musicList, c);
		musicList.sort(c);
		return musicList;
	}
}
