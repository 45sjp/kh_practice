package workshop02;

/*
 * [문제 2]
 * 다음의 while문을 for문으로 변경하시오.
 */
public class Test02 {

	public static void main(String[] args) {
		
		// while문
//		int inx = 0; 
//		while(inx <= 6) {
//			int jnx = 0;
//			
//			while(jnx <= inx) {
//				System.out.print("*");
//				jnx++;
//			}
//			System.out.print("@");
//			inx++;
//		}
//		
//		System.out.println();
		
		// for문
		for(int inx = 0; inx <= 6; inx++) {
			
			for(int jnx = 0; jnx <= inx; jnx++) {
				System.out.print("*");
			}
			System.out.print("@");
		}
	}	

}
