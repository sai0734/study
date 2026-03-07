package Chap_04;

import java.util.Iterator;

public class _05_For {
	public static void main(String[] args) {
		// 반복문 For
		// for ( 선언 ; 조건 ; 증감 ) {
		// 정해져 있는 횟수 만큼 반복
		
		
		// 매장 이름 나이키
		System.out.println("어서오세요 나이키입니다.");
		// 또 다른 손님이 뜰어오면?
		System.out.println("어서오세요 나이키입니다.");
		System.out.println("어서오세요 나이키입니다.");
		System.out.println("어서오세요 나이키입니다.");
		// 만약에 인사 법이 바뀌면?
		System.out.println("환영합니다. 나이키입니다");
		System.out.println("환영합니다. 나이키입니다");
		System.out.println("환영합니다. 나이키입니다");
		// 매장 이름이 바뀌면?
		// 나이키 -> 아디다스
		System.out.println("환영합니다. 아디다스입니다.");
		System.out.println("환영합니다. 아디다스입니다.");
		System.out.println("환영합니다. 아디다스입니다.");
		
		System.out.println("반복문 사용 전");
		
		// 반복문 용 For
		// for ( 선언 ; 조건 ; 증감 ) {
		for ( int i = 0; i < 10; i++ ) {
			// System.out.println("안녕하세요 아디다스입니다." + i);
			System.out.println("환영합니다." + i);
			
		}
		
		// 짝수만 출력
		for (int q = 0; q < 10; q += 2) {
			System.out.print(q);
		}
		
		System.out.println();
		
		// 홀수만 출력
		for (int w = 1; w < 10; w += 2) {
			System.out.print(w);			
		}
		
		System.out.println();
		
		// 거꾸로 숫자
		for (int e = 5; e > 0; e--) {
			System.out.print(e);
		}
		
		// 1부터 10까지의 수들의 합
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;
			System.out.println("현재까지 총합은 " + sum + "입니다.");
		}
		System.out.println("1부터 10까지 총 합은 " + sum + "");
	}

}
