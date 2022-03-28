package exception;

/*
 * [ 문제 6 ] 다음과 같은 조건을 만족하는 프로그램을 작성하시오.
 * 
 * 고정 금리의 계좌를 생성하여 현재 잔액을 기준으로 이자를 계산하는 프로그램을 작성한다.
 * 
 * 사용 데이터
 * Account(계좌번호): 441-0290-1203, balance(잔액): 500000원, interestRate(이율): 7.3%
 */
public class Account {
	private String account;
	private double balance;
	private double interestRate;
	
	public Account() {}

	public Account(String account, double balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double calculateInterest() {
		return balance * interestRate / 100;
	}
	
	public void deposit(double money) throws Exception {
		if(money <= 0) throw new Exception("유효한 금액을 입력하세요.");
		else balance += money;
	}
	
	public void withdraw(double money) throws Exception {
		if(money <= 0 || money > balance) throw new Exception("출금액이 유효하지 않거나 잔액보다 많습니다.");
		else balance -= money;
	}
	
	public String toString() {
		return "계좌번호: " + account + " " + balance + " " + interestRate; 
	}
}

