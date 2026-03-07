package Chap_05;

public class _02_ArrayLoop {
	public static void main(String[] args) {
		// 배열 순회
		String[] coffees = { "아메리카노", "카페모카", "라떼", "카푸치노" };
		
		System.out.println(coffees[0] + " 하나"); // 아메리카노 하나
		System.out.println(coffees[1] + " 하나");
		
		// for 반복문 순회
		for (int i = 0; i < 4 ; i++) { // 배열의 크기를 알때 사용한다
			System.out.println(coffees[i] + "하나");
			
		}
		System.out.println("주세요#1");
		
		System.out.println("---------------------------------------------");
		
		
		// 배열의 길이를 이용한 순회
		for (int i = 0; i < coffees.length ; i++) { // 배열의 크기를 모를때 사용한다
			System.out.println(coffees[i] + "하나");
		}
		
		System.out.println("주세요#2");
		
		System.out.println("---------------------------------------------");
			
		// enhanced for (for-each) 반복문 - 향상된 for문
		for (String coffee : coffees) {
			System.out.println(coffee + " 하나");
		}
		System.out.println("주세요#3");
		
		

	}
}
	
