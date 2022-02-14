package kh.java.inheritance.product.after;

public class Desktop extends Computer {
	
	private String monitor;
	private String keyboard;
	private String mouse;
	
	public Desktop() {
		super();
	}
	
	public Desktop(String brand, String code, String name, int price,
			String os, String monitor, String keyboard, String mouse) {
		super(brand, code, name, price, os);
		this.monitor = monitor;
		this.keyboard = keyboard;
		this.mouse = mouse;
	}
	
	public String getDesktopInfo() {
		return getComputerInfo() + ", " + monitor + ", " + keyboard + ", " + mouse;
	}
}
