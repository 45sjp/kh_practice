package member.controller;

import member.model.vo.Member;

public class MemberManager {
	private static final int MEMBER_COUNT = 40;
	Member[] members = new Member[MEMBER_COUNT];
	
	private static int INDEX = 0;
	
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
			System.out.printf("%s\t\t%s\t\t%d\t\t%.2f%n",
					members[i].getName(), members[i].getGrade(),
					members[i].getPoint(), members[i].getBonusPoint());
		}
		
		System.out.println(bottom);
	}
}
