package workshop02;

import java.util.Arrays;

/*
 * [문제 1]
 * eclipse argument로 3개의 1자리(1~9) 정수형 데이터를 받아
 * 최대 값과 최소 값을 화면에 출력한다.
 */
public class Test01 {
	
	public static void main(String[] args) {
		
		int inputNum1 = 0;
		int inputNum2 = 0;
		int inputNum3 = 0;
		
		inputNum1 = Integer.parseInt(args[0]);
		inputNum2 = Integer.parseInt(args[1]);
		inputNum3 = Integer.parseInt(args[2]);
		
		if(inputNum1 > 0 && inputNum1 < 10 &&
		   inputNum2 > 0 && inputNum2 < 10 &&
		   inputNum3 > 0 && inputNum3 < 10) {
			
			Arrays.sort(args);
			
			System.out.printf("값 : %d %d %d%n", inputNum1, inputNum2, inputNum3);
			System.out.println("최대값 : " + args[args.length - 1]);
			System.out.println("최소값 : " + args[0]);
		}
		else {
			System.out.println("1부터 9 사이의 정수를 입력하세요.");
		}
	}

}
