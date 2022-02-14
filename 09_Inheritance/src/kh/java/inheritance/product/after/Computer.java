package kh.java.inheritance.product.after;

public class Computer extends Product {
	
	private String os;
	
	public Computer() {
		super();
	}

	public Computer(String brand, String code, String name,
						int price, String os) {
		super(brand, code, name, price);
		this.os = os;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}
	
	public String getComputerInfo() {
		return getProductInfo() + ", " + os;
	}
}
