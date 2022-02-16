package member.model.vo;

public class Gold extends Member {
	
	private static final double RATE = 0.05;
	
	public Gold() {
		super();
	}
	
	public Gold(String name, String grade, int point) {
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
