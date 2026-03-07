package Chap_04;

import java.util.Scanner;

public class _00_Practice {
	public static void main(String[] args) {
		
		// #1 if ~ esle if ~ esle 연습
		
		String id = "hjc135";
		String pw = "1234";
		
		if (id.equals("hjc135") && pw.equals("1234")) {
			System.out.println("로그인 되었습니다");
		} else if (id.equals("hjc135")) {
			System.out.println("pw가 틀렸습니다");
		} else {
			System.out.println("id가 틀렸습니다");
		}
		System.out.println("#1 확인완료");
		
		// #2 swicth case 연습
		
		String month = "4";
		
		switch (month) {
			case "1" :
				System.out.println("말일이 31일 입니다");
				break;
			case "2" :
				System.out.println("말일이 29일 입니다");
				break;
			case "3" :
				System.out.println("말일이 28일 입니다");
				break;
			default :
				System.out.println("말일이 30일 입니다");
		}
		System.out.println("#2 확인 완료");
		
		// #3 arrow case lable 연습
		
		int month2 = 10;
		
		switch (month2) {
		case 1, 3, 5, 7, 9, 11 -> System.out.println("말일이 31일 입니다");
		case 2, 4, 6, 8 -> System.out.println("말일이 30일 입니다");
		case 12 -> System.out.println(("말일이 28일 입니다"));		
		default -> System.out.println("말일이 29일 입니다");
		} 
		System.out.println("#3 확인 완료");	
		
		// #4 Scanner scan = new Scanner(System.in); 사용
		// 상단에 import java.util.Scanner; -> 이게 있어야 한다
		
		Scanner scan = new Scanner(System.in);
		System.out.println("해당 월을 숫자로 입력하세요");
		int month3 = scan.nextInt();
		
		String value = switch (month3) {
		case 1, 3, 5, 7, 9, 11 -> "말일이 31일 입니다";
		case 2, 4, 6, 8 -> "말일이 30일 입니다";
		case 12 -> {
			System.out.println(("말일이 28일 입니다"));
			yield "28";
		}
		default -> {
			System.out.println("말일이 29일 입니다");
			yield "없음";
		}
		};
		System.out.println("#4 확인 완료 " + value);	
		
		// #5 if 와 switch 결합문
		int k = 200;
		if (k > 100 && k <= 300) {
			switch (k) {
			case 100 -> System.out.println("k는 100입니다");
			case 200 -> System.out.println("k는 200입니다");
			case 300 -> System.out.println("k는 300입니다");
			default -> System.out.println("100, 200, 300이 아니다");
			} 
			} else {
				System.out.println("400이상이거나 100미만");
			}
		
		// #6 * 네모
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
			System.out.print("*");	
			}
			System.out.println();
		}
		
		// #7 * 직각삼각형
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");				
			}
			System.out.println();
			
		}
		}
		}
		
	
	

