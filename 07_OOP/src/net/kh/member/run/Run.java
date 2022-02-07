package net.kh.member.run;

import net.kh.member.model.Member;

public class Run {

	public static void main(String[] args) {
		Member member = new Member();
		member.setMemberId("hongildong123");
		member.setMemberPwd("gildong123123");
		member.setMemberName("홍길동");
		member.setAge(20);
		member.setGender('남');
		member.setPhone("01012341234");
		member.setEmail("hongildong123@kh.com");
		
		System.out.printf("아이디 : %s%n"
						+ "비밀번호 : %s%n"
						+ "이름 : %s%n"
						+ "나이 : %d세%n"
						+ "성별 : %c자%n"
						+ "핸드폰번호 : %s%n"
						+ "이메일 : %s",
						member.getMemberId(), member.getMemberPwd(),
						member.getMemberName(), member.getAge(), member.getGender(),
						member.getPhone(), member.getEmail());
	}

}
