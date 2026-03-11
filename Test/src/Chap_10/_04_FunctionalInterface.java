package Chap_10;

import Chap_10.Converter.Convertable;
import Chap_10.Converter.ConvertableWithNoParams;
import Chap_10.Converter.ConvertableWithReturn;
import Chap_10.Converter.ConvertableWithToParams;
import Chap_10.Converter.KRWConverter;

public class _04_FunctionalInterface {
	// 함수형 인터페이스
	public static void main(String[] args) {
		KRWConverter converter = new KRWConverter();
//		converter.convert(2);
		
//		convertUSD(converter, 2);
		
		convertUSD((USD) -> System.out.println(USD + "달러 = " + (USD * 1400) + " 원"), 1);
		Convertable convertable = (USD)-> System.out.println(USD + " 달러 = " + (USD * 1400) + "원");
		convertUSD(convertable, 2);
		
		// 전달값이 하나도 없다면?
		ConvertableWithNoParams c1 = () -> System.out.println("1 달러 = 1400 원");
		c1.covert();
		
		// 두 줄 이상의 코드가 있다면? 중괄호로 감싼다.
		c1 = () -> {
			int USD = 5;
			int KRW = 1400;
			System.out.println(USD + " 달러 = " + (USD * KRW) + "원");
		};
		c1.covert();
		
		// 전달값이 2개인 경우?
		ConvertableWithToParams c2 = (USD, KRW) -> System.out.println(USD + " 달러 = " + (USD * KRW) + "원");
		c2.convert(10, 1400);
		
		// 반환값이 있는 경우?
		ConvertableWithReturn c3 = (d, w) -> d * w;
		int result = c3.covert(20, 1400);
		System.out.println("20 달러 = " + result + "원");
		}
	
	// 함수형 인터페이스를 쓰기 위해서는 딱 1개의 추상 메소드가 있어야 한다.
	public static void convertUSD(Convertable converter, int USD) {
		converter.convert(USD);
		
	}

}
