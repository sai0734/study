package Chap_01;

public class _02_dataTypes {
	public static void main(String[] args) {
		/*
		여긴 메인 메소드 영역이다
		메인 메소드 안에 독립적징 영역을 선언할 수 있다
		 */
		/*
		 [{()}] 이걸 브레이스라 부르는데 Java 프로그래밍의 영역을 나타날때 사용
		 클래스 또는 메인 메소드에서 영역을 표시할때 쓴다
		 뿐만 아니라 여러 제어문에서도 {}를 사용하며 {}를 독립적으로 사용할 수 있다
		 */
		/* 
		 ; => 이건 세미콜론으로 Java 프로그래밍에서 해당 로직이 끝났음을 나타낼때 사용
	     세미콜론으로 로직을 끝낸 뒤 한줄에 여러 개의 로직을 붙여 사용해도 가능은 하다
	     */
		/* 자료형
		 Java에서 쓰이는 기본 데이터 타입을 의미하여 크게 5가지로 나뉘어 있다
		 정수형 (Integer) : -n, ..., -3, -2, -1, 0, 1, 2, 3, ..., m
		 실수형 (Float) : -n2, ..., -3.0, -2.9, ..., 0.1, 0.2, ..., 2.3, 2.4, ...,
		 논리형 (Boolean) : true, false
		 문자형 (Cahr) : 'A', '가', '金' => ''를 사용
		 문자열형 (String) : "안녕하세요", "abcde" => ""를 사용
		 */
		System.out.println("hello World");
		System.out.println("안녕하세요?");
		System.out.println(12);
		System.out.println(-34);
		System.out.println(true);
		System.out.println(false);
		System.out.println(123 + 345);
		
		System.out.println("안녕\t하세요");
		System.out.println("안녕\b하세요");
		System.out.println("안녕\n하세요");
		System.out.println("\\1");
		System.out.println("\'1");
		System.out.println("\"1");
		System.out.println("\u0041");
		/* 문자열형의 특수문자
		 tap => \t
		 backspace => \b
		 new line => \n
		 역슬래쉬 => \\
		 작은따옴표 => \'
		 큰따옴표 => \"
		 유니코드 => \u0041
		 */
	
		
	}
}