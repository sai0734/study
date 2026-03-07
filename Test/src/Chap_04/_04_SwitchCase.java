package Chap_04;

public class _04_SwitchCase {
	public static void main(String[] args) {
		// switch case
		// if ~ else if ~ else 문과 동일하게 사용 가능하지만 약간의 차이가 있다
		// 첫번째는 switch ~case문의 값은 동등 비교만 가능하다
		// switch() 괄호 안에 들어갈 내용은 조건식이 아니라 변수 혹은 단일 값, 산술연산으로 나온 결과 말고는 들어갈 수 없다.
		// default는 else 처럼 생략이 가능하다
		
		// 석차에 따른 장학금 지급
		// 1등 : 전액 장학금
		// 2등 : 반액 장학금
		// 3등 : 반액 장학금
		// 그 외 : 장학금 대상 아님
		
		// If Else 문을 이용 (여러 조건 또는 범위에 해당하는 조건일때 사용)
		int ranking = 2; // 등수
		if (ranking == 1) {
			System.out.println("전액 장학금");
		} else if (ranking == 2 || ranking == 3) {
			System.out.println("반액 장학금");
		} else {
			System.out.println("장학금 대상 아님");
		}
		System.out.println("조회 완료 #1");
		
		// Switch Case 문을 이용 (명확한 케이스가 있는 경우 사용)
		// beake; 는 switch 문을 빠져 나가는 역할
		/*
		switch ( 변수 / 값 ) {
			case A: 
			 	해당 분기에서 실행되는 로직;
				break;
			case B: 
				해당 분기에서 실행되는 로직;
				break;
			case C: 
				해당 분기에서 실행되는 로직;
				break;
			default: 
				분기를 타지 않았을 때의 로직
		}
		*/
		ranking = 4;
		switch (ranking) {
			case 1 : 
				System.out.println("전액 장학금");
				break;
			case 2 : 
				System.out.println("반액 장학금");
				break;
			case 3 : 
				System.out.println("반액 장학금");
				break;
			default : 
				System.out.println("장학금 대상 아님");				
		}
		System.out.println("조회 완료 #2");
	
		// case 2 와 3을 통합
		// case 2 를 비어주고 break를 적지 않으면 case 2 를 넘어 case 3 을 출력
		ranking = 2;
		switch (ranking) {
			case 1 : 
				System.out.println("전액 장학금");
				break;
			case 2 :
			case 3 : 
				System.out.println("반액 장학금");
				break;
			default : 
				System.out.println("장학금 대상 아님");				
		}
		System.out.println("조회 완료 #3");
		
		// 중고상품의 등급에 짜른 가격을 책정 (1급 : 최상, 4급 : 최하)
		int grade = 1; // 등급
		int price = 7000; // 가격
		switch (grade) {
			case 1 : 
				price += 1000; // price = price + 1000;
			case 2 :
				price += 1000;
			case 3 :
				price += 1000;
				break;
		}
		System.out.println(grade + "등급 제품의 가격 : " + price + "원");
		// 1등급의 제품의 가격 : 10000원
		// 2등급의 제품의 가격 : 9000원
		
		int score = 95; {
		if (score >= 90)
			System.out.println("A");
		else if (score >= 80) 
			System.out.println("B");
		
		// switch ~ case 예제 2
		int a = 3;
		// 값을 넣을 수 있다.
		// 하지만 switch case문을 쓰는데 의미는 없다
		switch (2) {
			case 3 : 
				System.out.println("a는 3이다");
					break;
			default :
				System.out.println("a는 3이 아니다");
					break;
		}
		
		switch (a) {
			case 1 : 
				System.out.println("a는 3이 아니다");
				break;
			case 2 :
				System.out.println("a는 3이 아니다");
				break;
			case 3 : 
				System.out.println("a는 3이다");
				break;
			default :
				System.out.println("a는 3이 아니다");
		}
		}
		}
	}

	

