package com.thread.sleep;

/*
 * 실행용 클래스
 * 
 * 좋아하는 속담, 경구 10개를 문자열배열에 담고, 3초마다 랜덤하게 출력하세요.
 * 10번 출력후 종료하세요.
 */
public class SleepTest {

	public static void main(String[] args) {
		new SleepTest().sendAphorism();
	}
	
	public void sendAphorism() {
		String[] strArr = new String[10];
		strArr[0] = "먹지 않고 잘 걷는 말이 없다.";
		strArr[1] = "굽은 나무가 선산을 지킨다.";
		strArr[2] = "소 잃고 외양간 고친다.";
		strArr[3] = "친구는 옛 친구가 좋고 옷은 새 옷이 좋다.";
		strArr[4] = "가는 말이 고와야 오는 말이 곱다.";
		strArr[5] = "현재 이 순간에 충실하라.";
		strArr[6] = "늦더라도 안 하는 것보다 낫다.";
		strArr[7] = "말을 많이 한다는 것과 잘 한다는 것은 별개이다.";
		strArr[8] = "껍질만 보지 말라. 안에 들어 있는 것을 보라.";
		strArr[9] = "실패는 성공의 어머니.";
		
		for(String str : strArr) {
			System.out.println(str);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
