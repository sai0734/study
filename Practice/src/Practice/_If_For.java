package Practice;

import java.util.Scanner;

public class _If_For {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int score = 80;
		
		if (score > 80) {
			System.out.println("점수가 80보다 크다");
			System.out.println("합격입니다");
		}
		if (score < 80) {
			System.out.println("점수가 80보다 작다");
			System.out.println("불합격입니다");
		}
		
		System.out.println("---------------------------------");
		
		if (score > 80) {
			System.out.println("점수가 80보다 크다");
			System.out.println("합격입니다");
		} else if (score == 80) {
			System.out.println("점수가 80이다");
			System.out.println("보류입니다");
		} else {
			System.out.println("점수가 80보다 작다");
			System.out.println("불합격입니다");
		}
		
		System.out.println("---------------------------------");
		
		int grade = scanner.nextInt();
		switch (grade) {
		case 1 -> {
			System.out.println("1등입니다"); 
			System.out.println("전액 장학급입니다");
		}
		case 2, 3 -> {
			System.out.println("2등 또는 3등입니다");
			System.out.println("반액장학금입니다");
		}
		case 4 -> {
			System.out.println("일반입니다");
			System.out.println("장합금없습니다");	
		}
		
		}
		
	}
}
