package member.model.vo;

public class Silver extends Member {
	
	private static final double RATE = 0.02;
	
	public Silver() {
		super();
	}
	
	public Silver(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	@Override
	public double getBonusPoint() {
		return super.getPoint() * RATE;
	}

	@Override
	public int buy(int price) {
		return (int) (price - (price * RATE));
	}
}
