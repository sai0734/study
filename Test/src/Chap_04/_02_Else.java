package Chap_04;

public class _02_Else {
public static void main(String[] args) {
	// 조건문 If  Else
	/*
	 if (조건식 & 논리값) {
	 	조건식이나 논리값이 참일 경우 실행되는 로직
	 } else { 
	 	조건식이나 논리값이 거짓일 경우 실행되는 로직
	 }
	 */
	// 이지선다형 조건문으로 동전의 앞 뒷면 같이 정하고자 할 경우 해당 로직을 쓸 수 있다
	
	int hour = 10;
	if (hour < 14 ) { // 오후 2시 이전이면
		System.out.println("아이스 아메리카노 +1");
	} else { // 그 외의 경우이면
		System.out.println("아이스 아메리카노 (디카페인) +1");
	}
	System.out.println("커피 주문 완료 #1");
	
	// 오후 2시 이후이거나 모닝 커피를 마신 경우?
	hour = 15;
	boolean morningCoffee = false;
	if (hour >= 14 || morningCoffee) { // 오후 2시 이후이거나 모닝 커피를 마신 경우?
		System.out.println("아이스 아메리카노 (디카페인) +1");
	} else { // 그 외 경우라면
		System.out.println("아이스 아메리카노 +1");
	}
	System.out.println("커피 주문 완료 #2");
	
	// if else 예제
	int a  = 3;
	if (a < 5) {
		System.out.println("a는 5보다 작습니다");
	} else {
		System.out.println("a는 5보다 큽니다");
	}
	
	// if else 문을 통한 가감산 예제
	int b = 5;
	if (b >= 5) {
		b--;
	} else {
		b++;
	}
	System.out.println(b);
	
	
	// 간다한 로직은 삼항 연산자로 대체가 가능하다.
	int c = 5;
	c = (c > 5)? --c : ++c;
	System.out.println(c);
	
	}
	
	}
