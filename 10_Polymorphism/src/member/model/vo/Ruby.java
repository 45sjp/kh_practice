package member.model.vo;

public class Ruby extends Member {
	
	private static final double RATE = 0.30;
	
	public Ruby() {
		super();
	}
	
	public Ruby(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	@Override
	public double getBonusPoint() {
		return getPoint() * RATE;
	}

	@Override
	public int buy(int price) {
		return (int) (price - (price * RATE));
	}
}
