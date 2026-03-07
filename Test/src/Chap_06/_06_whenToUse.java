package Chap_06;

public class _06_whenToUse {
	
	public static int getPower(int number) {
		return getPower(number, 2);
	}
	
	// 클래스 안에 getPower 메소드 생성
	public static int getPower(int number, int exponent) {
		int result = 1;
		for ( int i = 0 ; i < exponent ; i++) {
			result *= number; 			
			}	
		return result;
		} 
	
	// 클래스 안에 main 메소드 생성
	public static void main(String[] args) {
		
		// 메소드가 필요한 이유	
		
		// 2의 2승을 구하기
//			int result = 1;
//			for ( int i = 0 ; i < 2 ; i++ ) {
//				result *= 2;
//			}	
//			System.out.println(result); // 2 * 2 = 4
		
		System.out.println(getPower(2, 3));
			
			
			// 3의 3승을 구하기
//			result = 1;
//			for ( int i = 0 ; i < 3 ; i++ ) {
//				result *= 3;
//			}	
//			System.out.println(result); // 3 * 3 * 3 = 27
		
		System.out.println(getPower(3, 3));
			
			
			// 4의 4승을 구하기
//			result = 1;
//			for ( int j = 0 ; j < 2 ; j++ ) {
//				result *= 4;
//			}
//			System.out.println(result);
		
		System.out.println(getPower(4, 3));
		}
}
