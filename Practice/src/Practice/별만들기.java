package Practice;

import java.util.Scanner;

public class 별만들기 {
	public static void main(String[] args) {
		/* #1 별로 직각삼각형 만들기
		 *
		 **
		 ***
		 ****
		 *****
		 */
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			} 
			System.out.println();
		}
		
		System.out.println("----------------------------------------");
		
		/* #2 별로 역 직각삼각형 만들기
		 *****
		 ****
		 ***
		 **
		 *
		 */
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------------");
		
		/* #3 별로 반대 직각삼각형 만들기
		     *
		    **
		   ***
		  ****
		 *****
		 */
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (int j2 = 0; j2 < i + 1; j2++) {
				System.out.print("*");
			}
			System.out.println();
			}

		System.out.println("----------------------------------------");
		
		// #4 입력란 숫자만큼의 별로 직각삼각형 만들기
		Scanner scanner = new Scanner(System.in);
		int inPut = scanner.nextInt();
		
		for (int i = 0; i < inPut; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");				
			}
			System.out.println();			
		}
		
		System.out.println("----------------------------------------");
		
		// #5 입력란 숫자만큼의 별로 역 직각삼각형 만들기
		int inPut1 = scanner.nextInt();
		
		for (int i = 0; i < inPut1; i++) {
			for (int j = 0; j < inPut1 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	

		
			
	}
		
}
