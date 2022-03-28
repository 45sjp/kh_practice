package shape;

/*
 * [ 문제 8 ] 다음과 같은 조건을 만족하는 프로그램을 작성하시오.
 * 
 * 삼각형과 사각형의 넓이를 구하는 프로그램을 작성한다.
 */
public abstract class Shape {
	private int width; 		// 가로 길이
	private int height;		// 세로 길이
	private String colors;	// 색상
	
	public Shape() {}

	public Shape(int width, int height, String colors) {
		super();
		this.width = width;
		this.height = height;
		this.colors = colors;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getColors() {
		return colors;
	}

	public void setColors(String colors) {
		this.colors = colors;
	}

	// 넓이 구하기
	public abstract double getArea();
	
	@Override
	public String toString() {
		return "Shape\t" + getArea() + "\t" + colors;
	}
}
