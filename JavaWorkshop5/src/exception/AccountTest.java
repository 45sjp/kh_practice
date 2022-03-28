package exception;

public class AccountTest {

	public static void main(String[] args) {
		// account 객체 생성
		Account account = new Account("441-0290-1203", 500000, 7.3);
		
		// account 기본 정보 출력
		System.out.println(account);
		
		// account에 -10원 입금 - Exception 처리
		try {
			account.deposit(-10);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		// account에 600000원 출금
		try {
			account.withdraw(600000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		// 이자 출력 - 현재 잔고를 기준으로 고객에게 줄 이자 금액을 출력한다.
		System.out.println(account.calculateInterest());
	}

}
