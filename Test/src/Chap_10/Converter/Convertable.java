package Chap_10.Converter;

@FunctionalInterface
// 함수형 인터페이스는 추상 메소드가 1개여야 한다.
public interface Convertable {
	void convert(int USD); // 추상 메소드
//	void convert2(); // 어노테이션에 의해 추상 메소드가 2개가 되면 오류가 뜬다
}
