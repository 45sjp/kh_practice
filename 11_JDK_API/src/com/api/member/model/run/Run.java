package com.api.member.model.run;

import java.util.GregorianCalendar;
import java.util.StringTokenizer;

import com.api.member.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		String data = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";
		
		String[] dataToken1 = data.split("[|]");
		int length = dataToken1.length;
		Member[] members = new Member[length];
		
		for(int i = 0; i < length; i++) {
			String[] dataToken2 = dataToken1[i].split(",");
			
			Member m = new Member();
			
			m.setMemberNo(Integer.parseInt(dataToken2[0]));
			m.setMemberName(dataToken2[1]);
			m.setHeight(Integer.parseInt(dataToken2[2]));
			m.setWeight(Integer.parseInt(dataToken2[3]));
			
			int year = Integer.parseInt(dataToken2[4].substring(0, 4));
			int month = Integer.parseInt(dataToken2[4].substring(4, 6)) - 1;
			int day = Integer.parseInt(dataToken2[4].substring(6, 8));
			
			m.setBirth(new GregorianCalendar(year, month, day));
			
			members[i] = m;
			System.out.println(m.information());
		}
	}

}
