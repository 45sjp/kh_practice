package workshop5;

/*
 * [ 문제 3 ] 다음과 같은 조건을 만족하는 프로그램을 작성 하시오.
 * 
 * 다음 배열의 내용을 실행 결과와 같이 출력되도록 프로그램을 작성하시오.
 * 
 * int[][] arr2 = {
 * 				   {20, 30, 10}, 
 * 				   {50, 40, 60}, 
 * 				   {80, 80, 90}
 * 			      };
 */
public class Test03 {

	public static void main(String[] args) {
		int[][] arr2 = {
				 	   	{20, 30, 10}, 
				 	   	{50, 40, 60}, 
				 	   	{80, 80, 90}
				 	   };
		
		for(int i = arr2.length - 1; i >= 0; i--) {
			for(int j = arr2[0].length - 1; j >= 0; j--) {
				System.out.print(arr2[i][j] + " ");
			}
		}
	}

}
