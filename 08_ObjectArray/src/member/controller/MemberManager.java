package member.controller;

import member.model.vo.Gold;
import member.model.vo.Silver;
import member.model.vo.VVip;
import member.model.vo.Vip;

public class MemberManager {
	private static final int LENGTH = 10;
	
	private Silver[] silvers = new Silver[LENGTH];
	private Gold[] golds = new Gold[LENGTH];
	private Vip[] vips = new Vip[LENGTH];
	private VVip[] vvips = new VVip[LENGTH];
	
	private int silverIndex = 0;
	private int goldIndex = 0;
	private int vipIndex = 0;
	private int vvipIndex = 0;
	
	public void silverInsert(Silver s) {
		silvers[silverIndex++] = s;
	}
	
	public void goldInsert(Gold g) {
		golds[goldIndex++] = g;
	}
	
	public void vipInsert(Vip v) {
		vips[vipIndex++] = v;
	}
	
	public void vvipInsert(VVip vv) {
		vvips[vvipIndex++] = vv;
	}
	
	public void printData() {
		String top = "---------------------------<<회원정보>>---------------------------\n"
				   + "이름\t\t등급\t\t포인트\t\t이자포인트\n"
				   + "----------------------------------------------------------------";
		
		String bottom = "----------------------------------------------------------------";
		
		System.out.println(top);
		
		for(int i = 0; i < silverIndex; i++) {
			Silver s = silvers[i];
			System.out.printf("%s\t\t%s\t\t%d\t\t%.2f%n",
								s.getName(), s.getGrade(), s.getPoint(), s.getBonusPoint());
		}
		
		for(int i = 0; i < goldIndex; i++) {
			Gold g = golds[i];
			System.out.printf("%s\t\t%s\t\t%d\t\t%.2f%n",
								g.getName(), g.getGrade(), g.getPoint(), g.getBonusPoint());
		}
		
		for(int i = 0; i < vipIndex; i++) {
			Vip v = vips[i];
			System.out.printf("%s\t\t%s\t\t%d\t\t%.2f%n",
								v.getName(), v.getGrade(), v.getPoint(), v.getBonusPoint());
		}
		
		for(int i = 0; i < vvipIndex; i++) {
			VVip vv = vvips[i];
			System.out.printf("%s\t\t%s\t\t%d\t\t%.2f%n",
								vv.getName(), vv.getGrade(), vv.getPoint(), vv.getBonusPoint());
		}
		
		System.out.println(bottom);
	}
}
