package member.model.vo;

public class Vip extends Member {
	
	public Vip() {
		super();
	}
	
	public Vip(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	@Override
	public double getBonusPoint() {
		return getPoint() * 0.10;
	}
}
