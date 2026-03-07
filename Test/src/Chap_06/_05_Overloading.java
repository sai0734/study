package Chap_06;

public class _05_Overloading {
	
	public static int getPower(int number) {
		int result = number * number;
		return result;
		// return number * number; -> 이렇게 해도 된다
		
	}
	
	public static int getPower(String strNumber) {
		int number = Integer.parseInt(strNumber); // String strNumber의 정수값을 뽑아서 반환해준다
		return number * number;
		
	}
	
	
	public static int getPower(int number1, int exponent) {
		int result2 = 1;
		
		for ( int j = 0 ; j < exponent ; j++ ) {
			result2 *= number1;
		
		}
		return result2;
	}
	
	public static void main(String[] args) {
		// 메소드 오버로딩 -> 같은 이름의 메소드여도 파라미터(전달값)이 다르면 중복해서 선언할 수 있다 
		// 같은 이름의 메소드를 여러 번 선언
		// 1. 전달값의 타입이 다르거나
		// 2. 전달값의 갯수가 다를때
		System.out.println(getPower(3)); // 3 * 3 = 9
		System.out.println(getPower("4")); // 4 * 4 = 16
		System.out.println(getPower(2, 5)); // 2 * 2 * 2 * 2 * 2 = 32
	}

}
