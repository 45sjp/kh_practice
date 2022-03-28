package mobile;

/*
 * [ 문제 7 ] 다음과 같은 조건을 만족하는 프로그램을 작성하시오.
 * 
 * Abstract 클래스에서 상속 받은 두 개의 클래스를 구현하는 프로그램을 작성한다.
 */
public abstract class Mobile {
	private String mobileName;
	private int batterySize;
	private String osType;
	
	public Mobile() {}

	public Mobile(String mobileName, int batterySize, String osType) {
		super();
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}
	
	// 사용을 통해 배터리 감소(분단위로 입력)
	public abstract int operate(int time);
	
	// 충전을 통한 배터리 증가(분단위로 입력)
	public abstract int charge(int time);

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public int getBatterySize() {
		return batterySize;
	}

	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}
	
	public String toString() {
		return mobileName + "\t\t" + batterySize + "\t\t" + osType;
	}
}
