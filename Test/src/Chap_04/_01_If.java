package Chap_04;

public class _01_If {
	public static void main(String[] args) {
		// 조건문 if
		// if문 안에 if문을 넣을 수 있고 계속 넣을 수 있다
		// if (조건식 & 논리값) { 조건식/값이 참일 때 실행되는 로직; }
		// if문의 조건식이 참이면 if문 {}안에 있는 로직이 실행되고 아닐 경우 if문을 무시하고 바로 아래의 로직을 실행시키는 문자
		// 조건식의 여부에 따라 해당 로직을 실행시킬 수도 있고 아닐수도 있을 경우 이 로직을 사용한다
		// if문이 참이었을 경우 실행되는 로직을 {}안에 작성한다
		
		int hour = 15; // 오전 10시
		
		// if 문 내에서 하나의 문장을 실행할 때는 { } 생략 가능 -> 하지만 가능하면 써주자
		if (hour < 14)
			System.out.println("아이스 아메리카노 +1");
			
		// if 문 애네서 2개 이상의 문장을 실행할 때는 { } 생략 불가 -> 영역을 지정해야 한다	
		if (hour < 14) { 
			System.out.println("아이스 아메리카노 + 1");
			System.out.println("샷 추가");
		}
		System.out.println("커피 주문 완료 #1");
		
		// 오후 2시 이전, 모닝 커피를 마시지 않은 경우?
		hour = 10;
		boolean morningCoffee = false; // 모닝 커피
		// if (hour < 14 && morningCoffee == false) {
		if (hour < 14 && ! morningCoffee) {
		System.out.println("아이스 아메리카노 + 1");
		}
		System.out.println("커피 주문 완료 #2");
		 
		
		// 오후 2시 이후이거나 모닝 커피를 마신 경우?
		hour = 15;
		morningCoffee = true;
		// if ( hour >= 14 || morningCoffee == true) {
		if ( hour >= 14 || morningCoffee) {
			System.out.println("아이스 아메리카노 (디카페인) +1");
		}
		System.out.println("커피 주문 완료 #3");
		
		// 단수 if문 예제
		int a = 1;
		if (a > 0) {
			System.out.println("a는 1보다 큽니다");
		}
		// if문 안에 조건식이 아닌 논리값을 사용하여 
		// if문을 강제로 태우거나 if문을 아예 못태우도록 만들 수는 있지만
		// 크게 의미가 없다.
		
		if (true) {
			System.out.println("이 값은 무조건 실행됩니다");
		}
		// if문의 조건이 끝나면 반드시 바로 아래의 로직을 실행한다.
		 System.out.println("이 문장은 if문에 관계없이 바로 다음에 실행되는 문장입니다");
		 // if문에서의 더 복잡한 조건식을 만들고 싶다면 &&나 ||, !과 같은 논리연사자를 활용하면 더 복잡한 조건식을 만들 수 있다
		 
		 int b = 5;
		 if (a > 0 && b < 10) {
			 System.out.println("i는 0보다 크고 j는 10보다 작다.");
		 }
		
		 // 산술연산을 통해 활용해서 조건식 안에 산술 연산을 넣을 수도 있다.
		 if ( ((a += 1) > 0) && ((b += 1) < 10) ) {
			 System.out.println("변형된 a & b의 값");
			 System.out.println("a : "+a+"   b : "+b);
			 
		 }
		 
		 }
		 
}

