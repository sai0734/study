package Chap_01;

public class _03_Variables {
	public static void main(String[] args) {
		/* 변수란?
		 - 단 하나의 값 만을 지정할 수 있는 공간
		 - 변수는 단 하나의 값 만을 저장할 수 있으며 변수의 값은 바뀔 수 있다
		 - 하나의 변수에 여러 번 다른 값을 저장할 시 맨 마지막에 저장한 값이 변수에 저장된다
		 - 이때 기존에 있던 변수의 값은 소멸된다
		 - 변수는 각각의 타입을 가지며 해당 타입에 맞는 자료형의 값 만을 가질 수 있다
		 - 변수타입(int) 변수명(number) 연산자(=) 변수값(0); -> int number = 0; 이렇게 표시
		 */
		String name = "나도코딩";
		//문자열형
		char name2 = '안';
		//문자형
		
		int hour = 15;
		//정수형
		
		System.out.println(name + "님, 배송이 시작됩니다." + hour + "시에 방문 예정입니다.");
		System.out.println(name + "님, 배송이 완료되었습니다.");		

		double score = 90.5;
		//실수형
		char grade = 'A';
		//문자형
		name = "사이";
		//앞에서 선언한 name을 다시 지정하면 이후에는 해당 언어로 출력
		//이때 앞에 변수타입은 들어가지 않는다
		
		System.out.println(name + "님의 평균 점수는" + score + "점 입니다.");
		System.out.println("학점은" + grade + "입니다.");
		
		boolean pass = true;
		//논리형
		System.out.println("이번 시험에 합격했을까요?" + pass);
		
		double d = 3.14123456789;
		float f = 3.14123456789F;
		//실수형의 경우 double이 float보다 훨씬 정밀하게 사용 가능하다
		//float의 경우 변수값 뒤에 f를 붙여야 한다
		
		System.out.println(d);
		System.out.println(f);
		
		int i = 1000000000;
		long l = 1000000000000l;
		l = 1_000_000_000_000l;
		//정수형의 경우 long이 int보다 훨씬 큰 값으로 사용 가능하다
		//long의 경우 변수값 뒤에 l을 붙여야 한다
		
		System.out.println(l);
		
		int q = 1, w = 2, e = 3, r = 4;
		//같은 타입의 여러가지 변수를 선언할 수 있다
		//다른 타입은 불가능
		System.out.println(q + w + e + r);
		
		
		/* 형변환
		 - 변수 또는 리터럴의 타입을 다른 타입으로 변환하는 것
		 - 연산을 하거나 변수에 넣을 값의 타입을 맞추지 않으면 에러가 날 수 있다
		 - 형변환하고자 하는 변수나 리터럴 앞에 변환하고자 하는 타입을 괄호 안에 붙여주면 형변환이 된다
		 - 형변환 시 사용된 괄호를 캐스팅 연산자 혹은 형변환 연산자라고 한다
		 - 8개의 기본형 중 boolean을 제외한 나머지 7개의 기본형 간에 형변환은 가능하다
		 - 범위가 큰 자료형에서 작은 자료형으로 변환은 값 손실이 발생할 수 있다 => (int)85.4 = 85
		 - 작은 자료형에서 큰 자료형으로 변환하는 경우 캐스팅 연산자를 생략하는 것을 허용한다
		 - 크기는 byte -> short -> int(char) -> iong -> float -> bouble 순서로 커진다
		 */
		byte z = 1;
		short x = z;
		//작은곳에서 큰 곳으로의 형변환은 캐스팅 연산자를 사용하지 않아도 된다
		System.out.println(x);
		
		double c = 8.15;
		int p = (int)c;
		// 큰 곳에서 작은곳으로의 형변환은 반드시 캐스팅 연사자를 사용해야 한다
		//또한 형변환을 하는 중 값이 소실될 수 있다
		System.out.println(p);
		
		char mind = 'B';
		int y = (int)mind;
		// 문자의 경우 숫자와 형변환이 가능하지만 String(문자열형)의 경우 클래스(객체)이기 때문에 방법이 다르다
		// char의 경우 문자도 결국 컴퓨터의 입장에선 숫자로 이루어진 값이라 가능
		
		System.out.println(mind);
		
		// 절대 변하지 않는 상수는 대문자로 적는다
		// 상수의 경우 변수타입 앞에 final을 붙여준다
		final String CODE = "KR";
		// CODE = "US"; => 안됨
		
		System.out.println(CODE);
		
		
		
	
	}

}
