package Practice;

import java.util.Scanner;

public class 적은_숫자_짝수_및_홀수_덧셈 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// #1 적은 숫자를 순차적으로 더해서 출력하기
		
		System.out.println("더할 숫자를 적어주세요");
		int inPut = scanner.nextInt();
		int sum = 0;

		for (int i = 1; i <= inPut; i++) {
			sum = sum + i;
		}
		System.out.println("합계 값은 " + sum + " 입니다.");
	
	System.out.println("-----------------------------");
	
	
		// #2 적은 숫자가 짝수이면 짝수의 합, 홀수면 홀수의 합 출력하기
		System.out.println("더할 숫자를 적어주세요");
		int inPut1 = scanner.nextInt();
		sum = 0;
		
		for (int i = 1; i <= inPut1; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			} else {
				sum = sum + i;
			}
		}
		System.out.println("숫자의 합은 " + sum + " 입니다");
	}
	

}
