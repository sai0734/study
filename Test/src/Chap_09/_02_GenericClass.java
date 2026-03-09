package Chap_09;

import Chap_09.coffee.CoffeeByNickname;
import Chap_09.coffee.CoffeeByNumber;
import Chap_09.coffee.CoffeeByUser;
import Chap_09.user.User;
import Chap_09.user.VIPUser;
import Chap_09.coffee.Coffee;
import Chap_09.coffee.CoffeeByName;

public class _02_GenericClass {
	public static void main(String[] args) {
		// 제네릭 클래스
		
		CoffeeByNumber c1 = new CoffeeByNumber(33);
		c1.ready();
		
		CoffeeByNickname c2 = new CoffeeByNickname("강호동");
		c2.ready();
		
		System.out.println("--------------------------");
		
		CoffeeByName c3 = new CoffeeByName(34); // Object타입 -> 정수
		c3.ready();
		
		CoffeeByName c4 = new CoffeeByName("유재석"); // Object타입 -> 문자열
		c4.ready();
		
		System.out.println("--------------------------");
		
		int c3Name = (int)c3.name; // c3.name이 Object타입이라 형변환을 해줌
		System.out.println(c3Name);
		
		String c4Name = (String)c4.name; // c3.name이 Object타입이라 형변환을 해줌
		System.out.println(c4Name);
		
		// 정수를 문자열로 바꿀수 없다고 에러가 뜸 (Integer cannot be cast to class java.lang.String)
//		c4Name = (String) c3.name; -> 이런 실수가 나올 수 있다.
		
		System.out.println("--------------------------");
		
		Coffee<Integer> c5 = new Coffee<>(35); // <> 다이아몬드 안에는 받고자 하는 타입(대문자)
		c5.ready();
		int c5Num = c5.name;
		System.out.println("주문 고객 번호 : " + c5Num);
		
		Coffee<String> c6 = new Coffee<>("신동엽"); // <> 다이아몬드 안에는 받고자 하는 타입(대문자)
		c6.ready();
		String c6Num = c6.name;
		System.out.println("주문 고객 번호 : " + c6Num);
		
		System.out.println("--------------------------");
		
		CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("이만기"));
		c7.ready();
		
		CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("서장훈"));
		c8.ready();
		
		System.out.println("--------------------------");
		
		orderCoffee("김영철" + "아메리카노");
		orderCoffee(36, 38);
					
	}
	
	public static <T> void orderCoffee(T name) {
		System.out.println("커피 준비 완료 " + name);
	}
	
	public static <T, V> void orderCoffee(T name, V coffee) { // 여러 타입의 값을 넣을때
		System.out.println("커피 준비 완료 " + coffee + " " + name);
	}

}
