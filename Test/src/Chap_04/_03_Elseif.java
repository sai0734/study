package Chap_04;

public class _03_Elseif {
	public static void main(String[] args) {
		// 조건문 ElseIf
		/*
		 if (조건식) { 조건에 해당하는 로직...
		 } else if (조건식) { 조건에 해당하는 로직...
		 } else if (조건식) { 조건에 해당하는 로직...
		 } else { 조건에 해당하는 로직...}
		 */
		// 다수개의 조건식을 넣어 비교문을 작성할 경우 사용하는 문자
		// 맨 위 조건부터 비교하여 만약 그 조건이 참이면 해당 문장을 실행하고 if ~ else if ~ else 문 밖으로 로직을 실행
		// 모든 조건식을 비교 했음에도 불구하고 만약 조건에 일치하는 것이 없다면 마지막의 else로 간다
		
		// 한라봉 에이드가 있으면 +1
		// 또는 망고 주스가 있으면 +1
		// 또는 아이스 아메리카노 +1
		
		boolean hallabongAde = true; // 한라본 에이드
		boolean mangoJuice = false; // 망고 주스
		
		if (hallabongAde) {
			System.out.println("한라봉 에이드 +1");
			
		} else if (mangoJuice) {
			System.out.println("망고 쥬스 +1");
		} else {
			System.out.println("아이스 아메리카노 +1");
		}
		System.out.println("커피 주문 완료 #1");
		
		// else If 는 여러번 사용 가능
		hallabongAde = false;
		mangoJuice = false;
		boolean orangeJuice = true;
		
		if (hallabongAde) {
			System.out.println("한라봉 에이드 +1");
		} else if (mangoJuice) {
			System.out.println("망고 쥬스 +1");
		} else if (orangeJuice) {
			System.out.println("오렌지 쥬스 +1");
		} else {
			System.out.println("아이스 아메리카노 +1");
		}
		System.out.println("커피 주문 완료 #2");
		
		// else 는 없어도 가능
			hallabongAde = false;
			mangoJuice = false;
		    orangeJuice = false;
				
			if (hallabongAde) {
				System.out.println("한라봉 에이드 +1");	
			} else if (mangoJuice) {
				System.out.println("망고 쥬스 +1");
			} else if (orangeJuice) {
				System.out.println("오렌지 쥬스 +1");			
			}
			System.out.println("커피 주문 완료 #3");
			
		// if else 예제
		int a = 1;
		if (a == 7) {
			System.out.println("a 는 7 입니다");
		} else if (a == 8) {
			System.out.println("a 는 8 입니다");
		} else if (a == 9) {
			System.out.println("a 는 9 입니다");
		} else if (a == 10) {
			System.out.println("a 는 10 입니다");
		} else {
			System.out.println("a 는 해당되는 값이 없습니다");
		}
			
		// 학점 계산기 예제
		int score = 60;
		if (score > 90) {
			System.out.println("학점은 A 입니다");
		} else if (score > 80) {
			System.out.println("학점은 B 입니다");
		} else if (score > 70) {
			System.out.println("학점은 C 입니다");
		} else {
		System.out.println("학점은 F 입니다");
		
		}
			
		}
		
	}

