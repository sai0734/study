package Chap_02;

public class _01_Operator1 {
	public static void main(String[] args) {
		/* 연산자 operator
		   - 변수와 값의 연산을 위해 쓰이는 기호들을 이야기 한다
		   - java에서는 연산을 수행하기 휘한 여러가지 기호 타입을 제공하고 있다
		   - 각각의 연산자들의 연산에 대한 우선순위를 가진다 (수학과 동일 -> 곱셈, 나눗셈, 나머지가 우선순위가 높다)
		   - 각 연산자들은 연산방향이 다르다
		*/
		// 산술 연산자
		
		// 일반 연산	
		System.out.println(4 + 2); // 6
		System.out.println(4 - 2); // 2
		System.out.println(4 * 2); // 8
		System.out.println(4 / 2); // 2
		System.out.println(5 / 2); // 2.5지만 정수연산이기에 정수로 출력
		System.out.println(2 / 4); // 0.5지만 정수연산이기에 정수로 출력
		System.out.println(4 % 2); // 4를 2로 나눈 나머지 즉 0
		System.out.println(5 % 2); // 5를 2로 나눈 나머지 즉 1
		
		// 우선 순위 연산
		System.out.println(2 + 2 * 2); // 6 수학과 마찬가지로 곱셈을 우선 연산
		System.out.println((2 + 2) * 2); // 8 수학과 마찬가지로 ()괄호 안을 우선 연산
		System.out.println(2 + (2 * 2)); // 6
		
		// 변수를 이용한 연산
		int a = 20;
		int b = 10;
		int c;
		
		c = a + b;
		System.out.println(c); // 30
		
		c = a - b;
		System.out.println(c); // 10
		
		c = a * b;
		System.out.println(c); // 200
		
		c = a / b;
		System.out.println(c); // 2
		
		c = a % b;
		System.out.println(c); // 0
		
		// 증감 연산 ++, --
		// 변수의 값을 1 증가시키거나 감소시킬 때 쓴다
		// 연산자의 위치에 따라 결과가 달라진자
		int val;
		val = 10;
		System.out.println(val); // 10
		System.out.println(++val); // 11
		System.out.println(val); // 11
		
		val = 10;
		System.out.println(val); // 10
		System.out.println(val++); // 10
		System.out.println(val); // 11
		
		val = 10;
		System.out.println(val); // 10
		System.out.println(--val); // 9
		System.out.println(val); // 9
		
		val = 10;
		System.out.println(val); // 10
		System.out.println(val--); // 10
		System.out.println(val); // 9
		
		// 은행 대기번호 표
		
		int waiting = 0;
		System.out.println("대기 인원 : " + waiting++); // 대기 인원 0
		System.out.println("대기 인원 : " + waiting++); // 대기 인원 1
		System.out.println("대기 인원 : " + waiting++); // 대기 인원 2
		System.out.println("대기 인원 : " + waiting); // 대기 인원 3
		
		
	}
}
