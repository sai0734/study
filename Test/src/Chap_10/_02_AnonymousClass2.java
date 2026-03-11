package Chap_10;

public class _02_AnonymousClass2 {
	public static void main(String[] args) {
		// 익명 클래스
		HomeMadeBurger momMadeBuger = getMomMadeBurger();
		momMadeBuger.cook();
		System.out.println("------------------------------");
		
		HomeMadeBurger broMadeBurger = getBroMadeBuger();
		broMadeBurger.cook();
		}

	private static HomeMadeBurger getBroMadeBuger() {
		return new HomeMadeBurger() { // 1. 미완성 설계도로 객체를 만들 건데 (원래 안됨)	
			@Override
			public void cook() { // 2. 그 자리에서 내용을 채울게! (익명 클래스 시작)
				System.out.println("집에서 만드는 동생표 군대리아.");
				System.out.println("재료 : 빵, 치킨패티, 양배추, 샐러드, 딸기쨉, 치즈, 삶은 계란");
			}
		}; // 3. 이제 내용이 채워졌으니 "완성된 객체"를 반환해! (익명 클래스 끝)
	}

	public static HomeMadeBurger getMomMadeBurger() {
		return new HomeMadeBurger() { // 1. 미완성 설계도로 객체를 만들 건데 (원래 안됨)
			@Override
			public void cook() { // 2. 그 자리에서 내용을 채울게! (익명 클래스 시작)
				System.out.println("집에서 만드는 엄마표 수제 버거");
				System.out.println("재료 : 빵, 소고기패티, 양상추, 마요네즈, 피클");	
			}
		}; // 3. 이제 내용이 채워졌으니 "완성된 객체"를 반환해! (익명 클래스 끝)
	}
	
}

abstract class HomeMadeBurger { // 추상 클래스
	public abstract void cook (); // 추상 메소드
}
