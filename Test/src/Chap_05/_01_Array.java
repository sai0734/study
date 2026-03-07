package Chap_05;

public class _01_Array {
	public static void main(String[] args) {
		// 배열 : 같은 자료형의 값 여러개를 저장하는 연속된 공간
		String coffeeRoss = "아메리카노";
		String coffeeRachel = "카페모키";
		String coffeeChandler = "라떼";
		String coffeeMonica = "카푸치노";
		
		System.out.println(coffeeRoss + "하나"); // 아메리카노 하나
		System.out.println(coffeeRachel + "하나");
		System.out.println(coffeeChandler + "하나");
		System.out.println(coffeeMonica + "하나");
		
		// 배열 선언 첫 번째 방법
//		String[] coffees = new String [4];
		
		// 배열 선언 두번때 방법
//		String[] coffees = new String[4];
		
//		coffees[0] = "아메리카노"; // 첫번째 순서의 값은 0 부터 시작한다 중요! 
//		coffees[1] = "카페모카";
//		coffees[2] = "라떼";
//		coffees[3] = "카푸치노";
		
		// 배열 선언 세번째 방법
//		String[] coffees = new String[] { "아메리카노", "카페모카", "라떼", "카푸치노" };
		
		// 배열 선언 네 번째 방법
		String[] coffees = { "아메리카노", "카페모카", "라떼", "카푸치노" };
	
		System.out.println("---------------------------------------------");
		
		// 커피 주문
		System.out.println(coffees[0] + " 하나"); // 아메리카노 하나
		System.out.println(coffees[1] + " 하나");
		coffees[2] = "에스프레소"; // 3번째를 에스프레소로 값 변경
		System.out.println(coffees[2] + " 하나");
		System.out.println(coffees[3] + " 하나");
		
		// 다른 자료형
		int[] i = new int [3];
		i[0] = 1;
		i[1] = 2;
		i[2] = 3;
		double[] b = new double[3];
		boolean[] c = new boolean[3];

		
	}

}
