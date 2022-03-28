package workshop5;

/*
 * [ 문제 5 ] 다음과 같은 조건을 만족하는 프로그램을 작성 하시오.
 * 
 * 다음에 선언된 String 객체를 이용하여 조건에 맞는 프로그램을 작성하시오.
 * String str = “LGcns”;
 * 
 * 1) Java API Documentation을 참조하여 str 내용을 아래와 같이 출력되도록 하시오.
 * LGCNS
 * lgcns
 * LG
 * cns
 */
public class Test05 {

	public static void main(String[] args) {
		String str = "LGcns";
		
		// LGCNS
		System.out.println(str.toUpperCase());
		
		// lgcns
		System.out.println(str.toLowerCase());
		
		// LG
		System.out.println(str.substring(0, 2));
		System.out.println(str.subSequence(0, 2));
		
		// cns
		System.out.println(str.substring(2));
		System.out.println(str.substring(2, 5));
		System.out.println(str.subSequence(2, 5));
	}

}
