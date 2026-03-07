package Chap_04;

import java.util.Random;

public class _04_01_Random {
	public static void main(String[] args) {
		// Random 함수
		// java에서는 랜덤하게 값을 발생시킬 수 있는 랜덤 함수가 존재
		// 방법을 2가지가 있으며 하나는 Math라는 클래스를 이용하는 방법
		// 또하나는 Rondom() 이라는 클래스를 활용해 랜덤 값을 도출하는 방법
		
		// Math.random은 결과 값이 무조건 double 타입니다.
		// 값은 0부터 0.999999999999... 까지의 값을 지닌다.
		// Math.random을 그냥 사용하기 보다는 연산을 통한 가공을 통해 많이 사용
		
		double d = Math.random();
		System.out.println(d);
		
		// 1부터 6까지의 랜덤 숫자 추출 예제
		int i = (int)(Math.random()*6) + 1;
		System.out.println(i);
		
		// Random 클래스는 java.util에 있으며 기존의 Math.random보다 더 많은 기능을 가지고 있다
		// 상단에 import java.util.Random; -> 꼭
		// 그렇기에 연산을 통한 전처리를 하고 싶지 않거 기능의 편의를 추구한다면 Random 클래스를 사용할 수 있다
		
		Random ran = new Random();
		System.out.println(ran.nextDouble());
		System.out.println(ran.nextInt());
		System.out.println(ran.nextInt(5));
		System.out.println(ran.nextBoolean());
		
		// #1 로또 번호 만들기 -> Math.random() 이용
		int lottoNum = (int)(Math.random() * 45) + 1;
		System.out.println(lottoNum);
		
		// #2 로또 번호 만들기 -> Random() 클래스 이용
		int lottoNum2 = ran.nextInt(45) + 1;
		System.out.println(lottoNum2);
		
		
		int v = (int)(Math.random() * 5 ) + 1;
		System.out.println(v + "메롱");
		
		int x = ran.nextInt(5);
		System.out.println(x + "안녕");
		
		// #3 중복처리
		int num1 = (int)(Math.random() * 45 + 1);
		int num2 = (int)(Math.random() * 45 + 1);
		int num3 = (int)(Math.random() * 45 + 1);
		int num4 = (int)(Math.random() * 45 + 1);
		int num5 = (int)(Math.random() * 45 + 1);
		int num6 = (int)(Math.random() * 45 + 1);
		
		System.out.println(num1);
		if (num1 == num2) {
			num2 = (int)(Math.random() * 45 + 1);
		}
		System.out.println(num2);
		
		if (num1 == num3 && num2 == num3) {
			num3 = (int)(Math.random() * 45 + 1);
		}
		System.out.println(num3);
		
		
		
		
		
	}

}
