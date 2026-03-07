package Chap_06;

public class _04_PrameterAndReturn {
	

	public static int getPower(int number) {
		int result = number * number;
		return result;
		// return number * number; -> 이렇게 해도 된다
		
	}
	
	
	public static int getPowerByExp(int number1, int exponent) {
		int result2 = 1;
		
		for ( int j = 0 ; j < exponent ; j++ ) {
			result2 *= number1;
		
		}
		return result2;
	}
	
	
	public static void main(String[] args) {
		// 전달값과 반환값을 함께 읷는 메소드
		int reVal = getPower(2); 
		System.out.println(reVal); // 2 * 2 = 4;
		
		reVal = getPower(3);
		System.out.println(reVal); // 3 * 3 = 9;
		
		reVal = getPowerByExp(3, 3);
		System.out.println(reVal); // 3 * 3 * 3 = 27
		
		
		
		
		
		
		
		
	}

}
