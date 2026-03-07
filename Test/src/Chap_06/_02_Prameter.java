package Chap_06;

public class _02_Prameter {
	
	public static void power(int number) { // 여기서 number는 Prameter 또는 매개변수라고 한다
		
		// 전달값이 있는 메소드
		int result = number * number;
		System.out.println(number + " 의 2 승은 " + result); // Parameter 가 하나인 메소드
		
	}
	
	
	public static void powerByExp(int number1, int exponent) { // Prameter 가 2개인 메소드
		
		int result2 = 1;
		
		for ( int j = 0 ; j < exponent ; j++ ) {
			result2 *= number1;
		}
		System.out.println(number1 + " 의 " + exponent + " 승은 " + result2);
	}
	
	
	
	public static void main(String[] args) {
		
		// 전달값, Parameter
		// 2 -> 2 * 2 = 4
		// 3 -> 3 * 3 = 9
		
		power(3);
		
		for ( int i = 1 ; i < 10 ; i++) {
			power(i);
		}
		
		powerByExp(2, 3);
		powerByExp(10, 0);

		
	}

}
