package company;

/*
 * [ 문제 2 ] 다음과 같은 조건을 만족하는 프로그램을 작성하시오.
 * 
 * 1) eclipse Argument에서 월 기본급을 입력 받는다. (정수형으로 입력)
 * 2) 입력된 기본급을 기준으로 직원들의 연봉을 계산하는 프로그램을 작성한다.
 * 
 * 연봉 계산 기준
 * 1) 기본급: 입력 데이터
 * 2) 보너스: 분기별로 월 기본급의 20% 지급
 * 3) 세금: 기본급은 10% 공제, 보너스는 5.5% 공제
 * 
 * 1년 동안 세금을 제외한 총 지급 금액을 계산 한다.
 */
public class Company {
	
	private double salary;
	private double annualIncome;
	private double bonus;
	private double afterTaxBonus;
	
	public Company() {}

	public Company(double salary) {
		super();
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}
	
	public double getIncome() {
		return salary * 12;
	}
	
	public double AfterTaxIncome() {
		return getIncome() - (getIncome() * 0.10);
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public double getBonus() {
		return (salary * 0.2) * 4;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getAfterTaxBonus() {
		return getBonus() - (getBonus() * 0.055);
	}

	public void setAfterTaxBonus(double afterTaxBonus) {
		this.afterTaxBonus = afterTaxBonus;
	}	
	
}
