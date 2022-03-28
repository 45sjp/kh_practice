package workshop5;

/*
 * [ 문제 1 ] 다음과 같은 조건을 만족하는 프로그램을 작성 하시오.
 * 
 * 프로그램 실행 시 eclipse argument로 공백이 없는 String 형태의 문자열을 받아들인다.
 * 입력 예1: Morning
 * 입력 받은 문자열을 뒤에서부터 출력하는 프로그램을 작성한다.
 * 단, String class의 toCharArray()함수를 이용한다.
 */
public class Test01 {

	public static void main(String[] args) {
		String inputStr = args[0];
		char[] charArr = inputStr.toCharArray();
		
		for(int i = charArr.length - 1; i >= 0; i--) {
//			if(charArr[i] >= 'a' && charArr[i] <= 'z')
//				charArr[i] -= 32; // 대문자와 소문자 차
			System.out.print(charArr[i]);
		}
	}

}
