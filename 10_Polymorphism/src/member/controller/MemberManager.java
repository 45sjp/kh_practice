package member.controller;

import member.model.vo.Member;

public class MemberManager {
	private static final int MEMBER_COUNT = 40;
	Member[] members = new Member[MEMBER_COUNT];
	
	private int INDEX = 0;
	
	public void insertMember(Member m) {
		members[INDEX++] = m;
	}
	
	public void printData() {
		String top = "---------------------------<<회원정보>>---------------------------\n"
				   + "이름\t\t등급\t\t포인트\t\t이자포인트\n"
				   + "----------------------------------------------------------------";
		
		String bottom = "----------------------------------------------------------------";
		
		System.out.println(top);
		
		for(int i = 0; i < INDEX; i++) {
			Member m = members[i]; // 변수 선언해주면 간단
			System.out.printf("%s\t\t%s\t\t%d\t\t%.2f%n",
					m.getName(), m.getGrade(), // 자식객체가 호출되는 것
					m.getPoint(), m.getBonusPoint());
//					members[i].getName(), members[i].getGrade(),
//					members[i].getPoint(), members[i].getBonusPoint());
		}
		
		System.out.println(bottom);
		System.out.println();
	}
	
	// 등급별 차등 할인율 적용
	public void printBuyInfo(int price) {
		String top = "---------------------- 실제 구매금액 정보 출력 ----------------------";
		String bottom = "----------------------------------------------------------------";
		
		System.out.println(top);
		
		for(int i = 0; i < INDEX; i++) {
			Member m = members[i];
			System.out.printf("%s등급회원 %s는 %d원 상품을 %d원에 구매합니다.%n",
								m.getGrade(), m.getName(),
								price, m.buy(price));
		}
		
		System.out.println(bottom);
	}
}
