package Chap_11;

public class _01_TryCatch {
	public static void main(String[] args) {
		// 예외 처리
		// 에러 error, 예뢰 exception
		// 컴파일 오류 : 코드에 문제가 있어서 프로그램이 실행조차 안됨
		// int i = "문자열";
		// 런타임 오류 : 컴파일은 되지만 실행하는 도중 오류가 발생
		// int[] i = new int[3];
		// int[5] = 0;
		
//		S s = new S();
//		s.methodA(); // StackOverflowError 에러 발생
		
//		S a = null;
//		a.methodA(); // NullPointerException 에러 발생
		
		try { 
//			System.out.println(3/ 0);
//			int[] arr = new int[3];
//			arr[5] = 100; 
			Object obj = "test";
			 System.out.println((int) obj);
			
		} catch (Exception e) {
			System.out.println("이런 문제가 발생했어요ㅕ => " + e.getMessage());
			e.printStackTrace();
		}
		
	
		
		
		
		
		
		System.out.println("프로그램 정상 종료");
	}

}
