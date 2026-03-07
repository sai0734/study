package Chap_02;

public class _05_Operator5 {
	public static void main(String[] args) {
		// 삼황 연산자 (조건 연산자)
		// 결과 = (조건식) ? (참의 경우 결과값) : (거짓의 경우 결과값)
		// 삼항 연산자는 조건식, 참일때의 값, 거직일때의 값 세가지가 필요하다
		// 주의할 점은 참과 거짓의 타입이 동일하거나 다르더라도 자동 형변환이 가능해야 한다
		// 삼항 연산자 안에 삼항 연사자를 넣어 사용할 수 있으며 이렇게 다수의 조건 선택을 만족시키는 로직을 만들 수 있다
		int x = 3;
		int y = 5;
		int max = (x > y) ? x : y;
		System.out.println(max); // 5
		
		int min = (x < y) ? x : y;
		System.out.println(min); // 3
		
		boolean b = (x == y) ? true : false;
		System.out.println(b); // false
		
		String s = (x != y) ? "달라요" : "같아요";
		System.out.println(s); // 달라요
		
		// 삼항 연사자를 두개 사용해서 다중 조건을 사용할 경우
		int b1 = 5;
		int b2 = (b1 > 6) ? 7 : (b1 > 4) ? 5 : 3;
		System.out.println(b2); // 5
		
	}

}
